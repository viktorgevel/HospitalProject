package hospital.service;

import hospital.entity.Doctor;
import hospital.entity.DoctorWorkingDay;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

@Repository
public class WorkingDayServiceImpl implements WorkingDayService {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(DoctorWorkingDay aDoctorWorkingDay) {
        entityManager.merge(aDoctorWorkingDay);
    }

    @Override
    public List<DoctorWorkingDay> findByDoctorId(int doctorId) {
        Query query = entityManager.createQuery("SELECT c FROM DoctorWorkingDay c where c.doctorId = :doctorId order by c.date", DoctorWorkingDay.class);
        query.setParameter("doctorId", doctorId);
        return (List<DoctorWorkingDay>) query.getResultList();
    }

    @Override
    public DoctorWorkingDay findDoctorDay(int doctorId, Date date) {
        Query query = entityManager.createQuery("SELECT c FROM DoctorWorkingDay c WHERE c.doctorId = :doctorId AND c.date = :date", DoctorWorkingDay.class);
        query.setParameter("doctorId", doctorId).setParameter("date", date);
        List<DoctorWorkingDay> doctorWorkingDays = query.getResultList();
        DoctorWorkingDay doctorWorkingDay=null;
        for(int i=0; i<doctorWorkingDays.size(); i++) {
            doctorWorkingDay = doctorWorkingDays.get(i);
        }
        return doctorWorkingDay;
    }
}
