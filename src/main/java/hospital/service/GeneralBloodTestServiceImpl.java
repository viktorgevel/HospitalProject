package hospital.service;

import hospital.entity.Client;
import hospital.entity.GeneralBloodTest;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class GeneralBloodTestServiceImpl implements GeneralBloodTestService{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(GeneralBloodTest aGeneralBloodTest) {
        entityManager.merge(aGeneralBloodTest);
    }

    @Override
    public List<GeneralBloodTest> findByClient(Client login) {
        Query query = entityManager.createQuery("SELECT c FROM GeneralBloodTest c where c.client = :idClient order by c.testDate", GeneralBloodTest.class);
        query.setParameter("idClient", login);
        return query.getResultList();
    }
}