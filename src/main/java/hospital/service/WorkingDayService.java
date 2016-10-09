package hospital.service;

import hospital.entity.DoctorWorkingDay;

import java.util.Date;
import java.util.List;

public interface WorkingDayService {
    void save(DoctorWorkingDay aDoctorWorkingDay);
    List<DoctorWorkingDay> findByDoctorId(int doctorId);
    DoctorWorkingDay findDoctorDay(int doctorId, Date date);
}
