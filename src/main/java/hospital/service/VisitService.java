package hospital.service;

import hospital.entity.Client;
import hospital.entity.Doctor;
import hospital.entity.Visit;

import java.util.List;

public interface VisitService {
    void save(Visit aVisit);
    List<Visit> findByClient(Client client);
    List<Visit> findByDoctor(Doctor doctor);
}
