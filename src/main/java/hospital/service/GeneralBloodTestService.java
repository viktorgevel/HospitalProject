package hospital.service;

import hospital.entity.Client;
import hospital.entity.GeneralBloodTest;

import java.util.List;

public interface GeneralBloodTestService {
    void save(GeneralBloodTest aGeneralBloodTest);
    List<GeneralBloodTest> findByClient(Client login);
}
