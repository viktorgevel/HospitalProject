package hospital.service;

import hospital.entity.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor findById(int idDoctor);
    void addDoctor(Doctor doctor);
    void updateDoctor(Doctor doctor);
    void delete(int idDoctor);
    List<Doctor> listDoctors();
}
