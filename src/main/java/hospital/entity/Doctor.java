package hospital.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "doctors")
public class Doctor{

    @Id
    @GeneratedValue
    private int idDoctor;
    private String firstName;
    private String secondName;
    private String patronymic;
    private Date dayOfBirth;
    private int age;
    private String sex;
    private static int countDoctor = 0;
    private String firstMedicalSpecialization;
    private String secondMedicalSpecialization;
    private String shortInformation;

    private String firstTime;
    private String secondTime;
    private String thirdTime;
    private String fourthTime;
    private String fifthTime;
    private String sixthTime;
    private String seventhTime;
    private String eighthTime;
    private String ninthTime;
    private String tenthTime;
    private String eleventhTime;
    private String twelfthTime;
    private String thirteenthTime;
    private String fourteenthTime;
    private String fifteenthTime;
    private String sixteenthTime;
    private String seventeenthTime;
    private String eighteenthTime;
    private String nineteenthTime;
    private String twentiethTime;

    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Client> clients = new ArrayList<Client>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<DoctorWorkingDay> workingDays;

    public Doctor() {}

    public Doctor(String aFirstName, String aSecondName, String aPatronymic,
                  int aYear, int aMonth, int aDay, String aSex, String aFirstMedicalSpecialization,
                  String aSecondMedicalSpecialization, String aShortInformation) {
        firstName = aFirstName;
        secondName = aSecondName;
        patronymic = aPatronymic;
        GregorianCalendar calendar = new GregorianCalendar(aYear, aMonth - 1, aDay);
        dayOfBirth = calendar.getTime();
        age = Doctor.calculateAge(dayOfBirth);
        sex = aSex;
        firstMedicalSpecialization = aFirstMedicalSpecialization;
        secondMedicalSpecialization = aSecondMedicalSpecialization;
        shortInformation = aShortInformation;
    }

    public int getIdDoctor() {return idDoctor;}

    public String getName() {return secondName + " " + firstName + " " + patronymic;}

    //public String getAge() {return dayOfBirth.toString();}

    public static int calculateAge(Date dayOfBirth) {
        Calendar tmp = Calendar.getInstance();
        Calendar today = Calendar.getInstance();
        tmp.setTime(dayOfBirth);
        tmp.add(Calendar.DAY_OF_MONTH, -1);
        int age = today.get(Calendar.YEAR) - tmp.get(Calendar.YEAR);
        if(today.get(Calendar.DAY_OF_YEAR) <= tmp.get(Calendar.DAY_OF_YEAR))
            age--;
        return age;
    }

    public int getAge() {return age;}
    public String getSex() {return sex;}
    public String getFirstMedicalSpecialization() {return firstMedicalSpecialization;}
    public String getSecondMedicalSpecialization() {return secondMedicalSpecialization;}
    public String getShortInformation() {return shortInformation;}

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public String getFirstTime() {return firstTime;}
    public void setFirstTime(String firstTime) {this.firstTime = firstTime;}
    public String getSecondTime() {return secondTime;}
    public void setSecondTime(String secondTime) {this.secondTime = secondTime;}
    public String getThirdTime() {return thirdTime;}
    public void setThirdTime(String thirdTime) {this.thirdTime = thirdTime;}
    public String getFourthTime() {return fourthTime;}
    public void setFourthTime(String fourthTime) {this.fourthTime = fourthTime;}
    public String getFifthTime() {return fifthTime;}
    public void setFifthTime(String fifthTime) {this.fifthTime = fifthTime;}
    public String getSixthTime() {return sixthTime;}
    public void setSixthTime(String sixthTime) {this.sixthTime = sixthTime;}
    public String getSeventhTime() {return seventhTime;}
    public void setSeventhTime(String seventhTime) {this.seventhTime = seventhTime;}
    public String getEighthTime() {return eighthTime;}
    public void setEighthTime(String eighthTime) {this.eighthTime = eighthTime;}
    public String getNinthTime() {return ninthTime;}
    public void setNinthTime(String ninthTime) {this.ninthTime = ninthTime;}
    public String getTenthTime() {return tenthTime;}
    public void setTenthTime(String tenthTime) {this.tenthTime = tenthTime;}
    public String getEleventhTime() {return eleventhTime;}
    public void setEleventhTime(String eleventhTime) {this.eleventhTime = eleventhTime;}
    public String getTwelfthTime() {return twelfthTime;}
    public void setTwelfthTime(String twelfthTime) {this.twelfthTime = twelfthTime;}
    public String getThirteenthTime() {return thirteenthTime;}
    public void setThirteenthTime(String thirteenthTime) {this.thirteenthTime = thirteenthTime;}
    public String getFourteenthTime() {return fourteenthTime;}
    public void setFourteenthTime(String fourteenthTime) {this.fourteenthTime = fourteenthTime;}
    public String getFifteenthTime() {return fifteenthTime;}
    public void setFifteenthTime(String fifteenthTime) {this.fifteenthTime = fifteenthTime;}
    public String getSixteenthTime() {return sixteenthTime;}
    public void setSixteenthTime(String sixteenthTime) {this.sixteenthTime = sixteenthTime;}
    public String getSeventeenthTime() {return seventeenthTime;}
    public void setSeventeenthTime(String seventeenthTime) {this.seventeenthTime = seventeenthTime;}
    public String getEighteenthTime() {return eighteenthTime;}
    public void setEighteenthTime(String eighteenthTime) {this.eighteenthTime = eighteenthTime;}
    public String getNineteenthTime() {return nineteenthTime;}
    public void setNineteenthTime(String nineteenthTime) {this.nineteenthTime = nineteenthTime;}
    public String getTwentiethTime() {return twentiethTime;}
    public void setTwentiethTime(String twentiethTime) {this.twentiethTime = twentiethTime;}
}
