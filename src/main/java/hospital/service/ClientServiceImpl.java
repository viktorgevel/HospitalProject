package hospital.service;

import hospital.entity.Client;
import hospital.entity.Doctor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ClientServiceImpl implements ClientService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void addClient(Client aClient) {
        entityManager.merge(aClient);
    }

    @Override
    @Transactional
    public void save(Client aClient) {
        entityManager.merge(aClient);
    }

    @Override
    @Transactional
    public void delete(int idClient) {
        Query query = entityManager.createQuery("SELECT c FROM Client c WHERE c.idClient = :idClient", Client.class);
        query.setParameter("idClient", idClient);
        Client client = (Client) query.getSingleResult();
        entityManager.remove(client);
    }

    @Override
    public Client findByLogin(String login) {
        Query query = entityManager.createQuery("SELECT c FROM Client c where c.login = :login", Client.class);
        query.setParameter("login", login);
        return (Client) query.getSingleResult();
    }

    @Override
    public List<Client> clients(Doctor doctor) {
        Query query = entityManager.createQuery("SELECT c FROM Client c where c.doctor = :doctor", Client.class);
        query.setParameter("doctor", doctor);
        return (List<Client>) query.getResultList();
    }

    @Override
    public List<Client> listClients() {
        Query query = entityManager.createQuery("SELECT d FROM Client d", Client.class);
        return (List<Client>) query.getResultList();
    }
}