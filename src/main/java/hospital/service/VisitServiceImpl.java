package hospital.service;

import hospital.entity.Client;
import hospital.entity.Doctor;
import hospital.entity.Visit;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class VisitServiceImpl implements VisitService{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Visit aVisit) {
        entityManager.merge(aVisit);
    }

    @Override
    public List<Visit> findByClient(Client client) {
        Query query = entityManager.createQuery("SELECT c FROM Visit c where c.client = :idClient order by c.visitDate", Visit.class);
        query.setParameter("idClient", client);
        List<Visit> visits = (List<Visit>) query.getResultList();
        return visits;
    }

    @Override
    public List<Visit> findByDoctor(Doctor doctor) {
        Query query = entityManager.createQuery("SELECT c FROM Visit c where c.doctorName = :doctorName", Visit.class);
        query.setParameter("doctorName", doctor.getName());
        return (List<Visit>) query.getResultList();
    }
}