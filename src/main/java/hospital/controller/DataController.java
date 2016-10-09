package hospital.controller;

import hospital.entity.*;
import hospital.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/")
public class DataController {

    @Autowired
    private DoctorService doctorService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private VisitService visitService;
    @Autowired
    private WorkingDayService workingDayService;
    @Autowired
    private GeneralBloodTestService generalBloodTestService;

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("doctors", doctorService.listDoctors());
        return "index";
    }

    @RequestMapping(value = "/addnewdoctor", method = RequestMethod.POST)
    public String addDoctorToDB(@RequestParam String aFirstName, @RequestParam String aSecondName,
                              @RequestParam String aPatronymic, @RequestParam int aYear,
                              @RequestParam int aMonth, @RequestParam int aDay, @RequestParam String aSex,
                              @RequestParam String aFirstMedicalSpecialization,
                              @RequestParam String aSecondMedicalSpecialization,
                              @RequestParam String aShortInformation) {
        Doctor doctor = new Doctor(aFirstName, aSecondName, aPatronymic, aYear, aMonth, aDay,
                aSex, aFirstMedicalSpecialization, aSecondMedicalSpecialization, aShortInformation);
        doctorService.addDoctor(doctor);
        return "admin";
    }

    @RequestMapping(value = "/addworkingtime", method = RequestMethod.POST)
    public String addDoctorWorkingTime(@RequestParam int selectdoctor,
                                     @RequestParam String aFirstTime, @RequestParam String aSecondTime,
                                     @RequestParam String aThirdTime, @RequestParam String aFourthTime,
                                     @RequestParam String aFifthTime, @RequestParam String aSixthTime,
                                     @RequestParam String aSeventhTime, @RequestParam String aEighthTime,
                                     @RequestParam String aNinthTime, @RequestParam String aTenthTime,
                                     @RequestParam String aEleventhTime, @RequestParam String aTwelfthTime,
                                     @RequestParam String aThirteenthTime, @RequestParam String aFourteenthTime,
                                     @RequestParam String aFifteenthTime, @RequestParam String aSixteenthTime,
                                     @RequestParam String aSeventeenthTime, @RequestParam String aEighteenthTime,
                                     @RequestParam String aNineteenthTime, @RequestParam String aTwentiethTime) {
        Doctor doctor = doctorService.findById(selectdoctor);
        doctor.setFirstTime(aFirstTime);
        doctor.setSecondTime(aSecondTime);
        doctor.setThirdTime(aThirdTime);
        doctor.setFourthTime(aFourthTime);
        doctor.setFifthTime(aFifthTime);
        doctor.setSixthTime(aSixthTime);
        doctor.setSeventhTime(aSeventhTime);
        doctor.setEighthTime(aEighthTime);
        doctor.setNinthTime(aNinthTime);
        doctor.setTenthTime(aTenthTime);
        doctor.setEleventhTime(aEleventhTime);
        doctor.setTwelfthTime(aTwelfthTime);
        doctor.setThirteenthTime(aThirteenthTime);
        doctor.setFourteenthTime(aFourteenthTime);
        doctor.setFifteenthTime(aFifteenthTime);
        doctor.setSixteenthTime(aSixteenthTime);
        doctor.setSeventeenthTime(aSeventeenthTime);
        doctor.setEighteenthTime(aEighteenthTime);
        doctor.setNineteenthTime(aNineteenthTime);
        doctor.setTwentiethTime(aTwentiethTime);

        doctorService.updateDoctor(doctor);

        return "admin";
    }

    @RequestMapping(value = "/updatedoctor")
    public String updateDoctor(Model model) {
        model.addAttribute("doctors", doctorService.listDoctors());
        return "updatedoctor";
    }

    @RequestMapping(value = "/deletedoctor", method = RequestMethod.GET)
    public String deleteDoctorFirstStage(Model model) {
        model.addAttribute("doctors", doctorService.listDoctors());
        return "deletedoctor";
    }
    @RequestMapping(value = "/deletesomedoctor", method = RequestMethod.POST)
    public String deleteDoctorSecondStage(@RequestParam int deleteIdDoctor) {
        doctorService.delete(deleteIdDoctor);
        return "admin";
    }

    @RequestMapping(value = "/deleteclient")
    public String deleteClientBegin(Model model) {
        model.addAttribute("clients", clientService.listClients());
        return "deleteclient";
    }

    @RequestMapping(value = "/deletesomeclient", method = RequestMethod.POST)
    public String deleteClientEnd(@RequestParam int deleteClientId) {
        clientService.delete(deleteClientId);
        return "admin";
    }

    @RequestMapping(value = "/selectdoctortoseeschedule", method = RequestMethod.GET)
    public String selecctDoctorToSeeSchedule(Model model) {
        model.addAttribute("doctors", doctorService.listDoctors());
        return "selectdoctortoseeschedule";
    }

    @RequestMapping(value = "/seedoctorschedule", method = RequestMethod.POST)
    public String seeDoctorSchedule(@RequestParam int aSelectdoctor, Model model) {
        Doctor doctor = doctorService.findById(aSelectdoctor);
        List<DoctorWorkingDay> doctorWorkingDays = workingDayService.findByDoctorId(aSelectdoctor);

        model.addAttribute("doctor", doctor);
        model.addAttribute("workingDays", doctorWorkingDays);
        return "doctorschedule";
    }

    @RequestMapping(value = "/createnewclient", method = RequestMethod.POST)
    public String createNewClient(@RequestParam String j_username, @RequestParam String j_password,
                                @RequestParam String aFirstName, @RequestParam String aSecondName,
                                @RequestParam String aPatronymic, @RequestParam int aYear,
                                @RequestParam int aMonth, @RequestParam int aDay,
                                @RequestParam String aSex, @RequestParam String aAddress,
                                @RequestParam String aPhone) {
        Client client = new Client(j_username, j_password, aFirstName, aSecondName, aPatronymic,
                aYear, aMonth, aDay, aSex, aAddress, aPhone);
        clientService.addClient(client);
        return "login";
    }

    @RequestMapping(value = "/appointmentdoctorfirststage", method = RequestMethod.GET)
    public String appointmentDoctorFirstStageBegin (Model model) {
        model.addAttribute("doctors", doctorService.listDoctors());
        return "appointmentdoctorfirststage";
    }

    @RequestMapping(value = "/appointmentdoctorbegin", method = RequestMethod.POST)
    public String appointmentDoctorFirstStageSequel (Model model, int selectdoctor) {
        Doctor doctor = doctorService.findById(selectdoctor);
        model.addAttribute("doctor", doctor);
        return "appointmentdoctorsecondstage";
    }

    @RequestMapping(value = "/appointmentdoctorsequel", method = RequestMethod.POST)
    public String appointmentDoctorFirstStageEnd (Model model, @RequestParam int selectdoctor,
                                                  @RequestParam String calendar){
        Doctor doctor = doctorService.findById(selectdoctor);

        Date date = DoctorWorkingDay.calendarToDate(calendar);

        DoctorWorkingDay doctorWorkingDay;
        if(workingDayService.findDoctorDay(selectdoctor, date) != null){
            doctorWorkingDay = workingDayService.findDoctorDay(selectdoctor, date);
        } else {
            doctorWorkingDay = new DoctorWorkingDay(doctor, calendar);
        }

        DoctorWorkingDay doctorWorkingDayTransitional = new DoctorWorkingDay();
        if(doctorWorkingDay.getAppointedFirstTime()==false) doctorWorkingDayTransitional.setFirstTime(doctor.getFirstTime());
        if (doctorWorkingDay.getAppointedSecondTime()==false) doctorWorkingDayTransitional.setSecondTime(doctor.getSecondTime());
        if (doctorWorkingDay.getAppointedThirdTime()==false) doctorWorkingDayTransitional.setThirdTime(doctor.getThirdTime());
        if (doctorWorkingDay.getAppointedFourthTime()==false) doctorWorkingDayTransitional.setFourthTime(doctor.getFourthTime());
        if (doctorWorkingDay.getAppointedFifthTime()==false) doctorWorkingDayTransitional.setFifthTime(doctor.getFifthTime());
        if (doctorWorkingDay.getAppointedSixthTime()==false) doctorWorkingDayTransitional.setSixthTime(doctor.getSixthTime());
        if (doctorWorkingDay.getAppointedSeventhTime()==false) doctorWorkingDayTransitional.setSeventhTime(doctor.getSeventhTime());
        if (doctorWorkingDay.getAppointedEighthTime()==false) doctorWorkingDayTransitional.setEighthTime(doctor.getEighthTime());
        if (doctorWorkingDay.getAppointedNinthTime()==false) doctorWorkingDayTransitional.setNinthTime(doctor.getNinthTime());
        if (doctorWorkingDay.getAppointedTenthTime()==false) doctorWorkingDayTransitional.setTenthTime(doctor.getTenthTime());
        if (doctorWorkingDay.getAppointedEleventhTime()==false) doctorWorkingDayTransitional.setEleventhTime(doctor.getEleventhTime());
        if (doctorWorkingDay.getAppointedTwelfthTime()==false) doctorWorkingDayTransitional.setTwelfthTime(doctor.getTwelfthTime());
        if (doctorWorkingDay.getAppointedThirteenthTime()==false) doctorWorkingDayTransitional.setThirteenthTime(doctor.getThirteenthTime());
        if (doctorWorkingDay.getAppointedFourteenthTime()==false) doctorWorkingDayTransitional.setFourteenthTime(doctor.getFourteenthTime());
        if (doctorWorkingDay.getAppointedFifteenthTime()==false) doctorWorkingDayTransitional.setFifteenthTime(doctor.getFifteenthTime());
        if (doctorWorkingDay.getAppointedSixteenthTime()==false) doctorWorkingDayTransitional.setSixteenthTime(doctor.getSixteenthTime());
        if (doctorWorkingDay.getAppointedSeventeenthTime()==false) doctorWorkingDayTransitional.setSeventeenthTime(doctor.getSeventeenthTime());
        if (doctorWorkingDay.getAppointedEighteenthTime()==false) doctorWorkingDayTransitional.setEighteenthTime(doctor.getEighteenthTime());
        if (doctorWorkingDay.getAppointedNineteenthTime()==false) doctorWorkingDayTransitional.setNineteenthTime(doctor.getNineteenthTime());
        if (doctorWorkingDay.getAppointedTwentiethTime()==false) doctorWorkingDayTransitional.setTwentiethTime(doctor.getTwentiethTime());

        model.addAttribute("doctor", doctor);
        model.addAttribute("calendar", calendar);
        model.addAttribute("doctorDay", doctorWorkingDayTransitional);

        return "appointmentdoctorthirdstage";
    }

    @RequestMapping(value = "/appointmentdoctorend", method = RequestMethod.POST)
    public String appointmentDoctorSecondStage (@RequestParam int selectdoctor, @RequestParam String calendar,
                                                @RequestParam String selecttime, Model model) {
        Doctor doctor = doctorService.findById(selectdoctor);
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client client = clientService.findByLogin(user.getUsername());
        Visit visit = new Visit(doctor.getName(), calendar, selecttime, client);
        client.setDoctor(doctor);
        Date date = DoctorWorkingDay.calendarToDate(calendar);

        DoctorWorkingDay doctorWorkingDay;

        if(workingDayService.findDoctorDay(selectdoctor, date) != null){
            doctorWorkingDay = workingDayService.findDoctorDay(selectdoctor, date);
        } else {
            doctorWorkingDay = new DoctorWorkingDay(doctor, calendar);
        }

        if(selecttime.equals(doctor.getFirstTime())) {doctorWorkingDay.setAppointedFirstTime(true); doctorWorkingDay.setFirstTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getSecondTime())) {doctorWorkingDay.setAppointedSecondTime(true); doctorWorkingDay.setSecondTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getThirdTime())) {doctorWorkingDay.setAppointedThirdTime(true); doctorWorkingDay.setThirdTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getFourthTime())) {doctorWorkingDay.setAppointedFourthTime(true); doctorWorkingDay.setFourthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getFifthTime())) {doctorWorkingDay.setAppointedFifthTime(true); doctorWorkingDay.setFifthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getSixthTime())) {doctorWorkingDay.setAppointedSixthTime(true); doctorWorkingDay.setSixthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getSeventhTime())) {doctorWorkingDay.setAppointedSeventhTime(true); doctorWorkingDay.setSeventhTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getEighthTime())) {doctorWorkingDay.setAppointedEighthTime(true); doctorWorkingDay.setEighthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getNinthTime())) {doctorWorkingDay.setAppointedNinthTime(true); doctorWorkingDay.setNinthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getTenthTime())) {doctorWorkingDay.setAppointedTenthTime(true); doctorWorkingDay.setTenthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getEleventhTime())) {doctorWorkingDay.setAppointedEleventhTime(true); doctorWorkingDay.setEleventhTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getTwelfthTime())) {doctorWorkingDay.setAppointedTwelfthTime(true); doctorWorkingDay.setTwelfthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getThirteenthTime())) {doctorWorkingDay.setAppointedThirteenthTime(true); doctorWorkingDay.setThirteenthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getFourteenthTime())) {doctorWorkingDay.setAppointedFourteenthTime(true); doctorWorkingDay.setFourteenthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getFifteenthTime())) {doctorWorkingDay.setAppointedFifteenthTime(true); doctorWorkingDay.setFifteenthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getSixteenthTime())) {doctorWorkingDay.setAppointedSixteenthTime(true); doctorWorkingDay.setSixteenthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getSeventeenthTime())) {doctorWorkingDay.setAppointedSeventeenthTime(true); doctorWorkingDay.setSeventeenthTime(client.getName());}
        else if (selecttime.equals(doctor.getEighteenthTime())) {doctorWorkingDay.setAppointedEighteenthTime(true); doctorWorkingDay.setEighteenthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getNineteenthTime())) {doctorWorkingDay.setAppointedNineteenthTime(true); doctorWorkingDay.setNineteenthTimeClient(client.getName());}
        else if (selecttime.equals(doctor.getTwentiethTime())) {doctorWorkingDay.setAppointedTwentiethTime(true); doctorWorkingDay.setTwentiethTimeClient(client.getName());}
        else System.out.println("Something broken in working days setting");

        clientService.save(client);
        visitService.save(visit);
        workingDayService.save(doctorWorkingDay);

        model.addAttribute("doctors", doctorService.listDoctors());
        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePageOfClient(Model model) {
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client client = clientService.findByLogin(user.getUsername());
        List<Visit> visits = visitService.findByClient(client);

        model.addAttribute("visits", visits);
        return "home";
    }

    @RequestMapping(value = "/selectclient", method = RequestMethod.GET)
    public String selectclient (Model model) {
        model.addAttribute("clients", clientService.listClients());
        return "selectclient";
    }

    @RequestMapping(value = "/generalbloodanalysisbegin", method = RequestMethod.POST)
    public String  generalBloodAnalysisBegin(Model model, String selectclient) {
        Client client = clientService.findByLogin(selectclient);
        model.addAttribute("client", client);
        return "addgeneralbloodanalysis";
    }

    @RequestMapping(value = "/generalbloodanalysisend", method = RequestMethod.POST)
    public String  generalBloodAnalysisEnd(@RequestParam String selectclient, @RequestParam String date,
                                           @RequestParam double aHemoglobin, @RequestParam double aRedBloodCell,
                                           @RequestParam double aHematocrit, @RequestParam double aMeanCorpuscularHemoglobin,
                                           @RequestParam double aPlatelet, @RequestParam double aWhiteBloodCell,
                                           @RequestParam double aErythrocyteSedimentationRate, Model model) {
        Client client = clientService.findByLogin(selectclient);
        GeneralBloodTest generalBloodTest = new GeneralBloodTest(client, date, aHemoglobin, aRedBloodCell, aHematocrit,
                aMeanCorpuscularHemoglobin, aPlatelet, aWhiteBloodCell, aErythrocyteSedimentationRate);
        generalBloodTestService.save(generalBloodTest);
        return "admin";
    }

    @RequestMapping(value = "/generalbloodanalysisresults", method = RequestMethod.GET)
    public String generalBloodAnalysisResult (Model model) {
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client client = clientService.findByLogin(user.getUsername());
        List<GeneralBloodTest> generalbloodtests = generalBloodTestService.findByClient(client);
        model.addAttribute("generalbloodtests", generalbloodtests);
        model.addAttribute("client", client);
        return "generalbloodanalysisresult";
    }
}