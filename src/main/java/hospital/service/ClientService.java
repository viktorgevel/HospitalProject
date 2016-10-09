package hospital.service;

import hospital.entity.Client;
import hospital.entity.Doctor;

import java.util.List;

public interface ClientService {
    void addClient(Client client);
    void delete(int idClient);
    void save(Client aClient);
    Client findByLogin(String login);
    List<Client> clients(Doctor doctor);
    List<Client> listClients();
}