package hospital.service;

import hospital.entity.Client;
import hospital.entity.Doctor;
import hospital.entity.DoctorWorkingDay;
import hospital.entity.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private ClientService clientService;
    @Autowired
    private VisitService visitService;
    @Autowired
    private WorkingDayService workingDayService;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Doctor findById(int idDoctor) {
        Query query = entityManager.createQuery("SELECT c FROM Doctor c where c.idDoctor = :idDoctor", Doctor.class);
        query.setParameter("idDoctor", idDoctor);
        Doctor doctor = (Doctor) query.getSingleResult();
        return doctor;
    }

    @Override
    @Transactional
    public void addDoctor(Doctor aDoctor) {entityManager.persist(aDoctor);}

    @Override
    @Transactional
    public void updateDoctor(Doctor aDoctor) {entityManager.merge(aDoctor);}

    /**
     * Видалення інформації про дікаря з бази даних
     * @param idDoctor Ідентифікатор лікаря у таблиці "doctors"
     */
    @Override
    @Transactional
    public void delete(int idDoctor) {
        Query query = entityManager.createQuery("SELECT c FROM Doctor c where c.idDoctor = :idDoctor", Doctor.class);
        query.setParameter("idDoctor", idDoctor);
        Doctor doctor = (Doctor) query.getSingleResult();

        // Розірвання зв'язку між лікарем і клієнтом
        List<Client> clients = clientService.clients(doctor);
        for (Client client: clients) {
            System.out.println(client.getName());
            client.setDoctor(null);
        }

        // Інформація про робочі дня лікарів залишатиметься в базі даних для історії.
        List<DoctorWorkingDay> workingDays = workingDayService.findByDoctorId(idDoctor);
        for (DoctorWorkingDay workingDay: workingDays) {
            workingDay.setDoctor(null);
        }

        // Видалення записів про візити клієнтів до лікаря
        List<Visit> visits = visitService.findByDoctor(doctor);
        for(Visit visit: visits) {
            visit.setClient(null);
            entityManager.remove(visit);
        }
        entityManager.remove(doctor);
    }

    @Override
    public List<Doctor> listDoctors() {
        Query query = entityManager.createQuery("SELECT d FROM Doctor d", Doctor.class);
        return (List<Doctor>) query.getResultList();
    }
}
