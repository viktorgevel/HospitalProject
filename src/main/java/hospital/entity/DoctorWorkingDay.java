package hospital.entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

@Entity
@Table(name = "workingdays")
public class DoctorWorkingDay {

    @Id
    @GeneratedValue
    private int idWorkingDay;
    private Date date;
    private String doctorName;
    private int doctorId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDoctor")
    private Doctor doctor;

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

    private boolean appointedFirstTime;
    private boolean appointedSecondTime;
    private boolean appointedThirdTime;
    private boolean appointedFourthTime;
    private boolean appointedFifthTime;
    private boolean appointedSixthTime;
    private boolean appointedSeventhTime;
    private boolean appointedEighthTime;
    private boolean appointedNinthTime;
    private boolean appointedTenthTime;
    private boolean appointedEleventhTime;
    private boolean appointedTwelfthTime;
    private boolean appointedThirteenthTime;
    private boolean appointedFourteenthTime;
    private boolean appointedFifteenthTime;
    private boolean appointedSixteenthTime;
    private boolean appointedSeventeenthTime;
    private boolean appointedEighteenthTime;
    private boolean appointedNineteenthTime;
    private boolean appointedTwentiethTime;

    private String firstTimeClient;
    private String secondTimeClient;
    private String thirdTimeClient;
    private String fourthTimeClient;
    private String fifthTimeClient;
    private String sixthTimeClient;
    private String seventhTimeClient;
    private String eighthTimeClient;
    private String ninthTimeClient;
    private String tenthTimeClient;
    private String eleventhTimeClient;
    private String twelfthTimeClient;
    private String thirteenthTimeClient;
    private String fourteenthTimeClient;
    private String fifteenthTimeClient;
    private String sixteenthTimeClient;
    private String seventeenthTimeClient;
    private String eighteenthTimeClient;
    private String nineteenthTimeClient;
    private String twentiethTimeClient;

    public DoctorWorkingDay(){}

    public DoctorWorkingDay(Doctor aDoctor, String calendar) {
        doctorId = aDoctor.getIdDoctor();
        doctorName = aDoctor.getName();
        date = DoctorWorkingDay.calendarToDate(calendar);

        doctor = aDoctor;
    }

    public DoctorWorkingDay(Doctor aDoctor, int aYear, int aMonth, int aDay) {
        doctorName = aDoctor.getName();
        GregorianCalendar calendar = new GregorianCalendar(aYear, aMonth - 1, aDay);
        date = calendar.getTime();
    }

    /**Метод перетворення рядкка виду "yyyy-MM-dd", у змінну типу Date.
     * Використовується для перетворення даних типу date з іменем calendar,
     * отриманих з *.jsp сторінки у змінну типу Date*/
    public static Date calendarToDate(String calendar){
        String[] calendars = calendar.split("-");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Integer.valueOf(calendars[0]),
                Integer.valueOf(calendars[1]) - 1, Integer.valueOf(calendars[2]));
        Date date = gregorianCalendar.getTime();
        return date;
    }

    public Date getDate() {return date;}
    public void setDoctor(Doctor doctor) {this.doctor = doctor;}

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

    public boolean getAppointedFirstTime() {return appointedFirstTime;}
    public void setAppointedFirstTime(boolean appointedFirstTime) {this.appointedFirstTime = appointedFirstTime;}
    public boolean getAppointedSecondTime() {return appointedSecondTime;}
    public void setAppointedSecondTime(boolean appointedSecondTime) {this.appointedSecondTime = appointedSecondTime;}
    public boolean getAppointedThirdTime() {return appointedThirdTime;}
    public void setAppointedThirdTime(boolean appointedThirdTime) {this.appointedThirdTime = appointedThirdTime;}
    public boolean getAppointedFourthTime() {return appointedFourthTime;}
    public void setAppointedFourthTime(boolean appointedFourthTime) {this.appointedFourthTime = appointedFourthTime;}
    public boolean getAppointedFifthTime() {return appointedFifthTime;}
    public void setAppointedFifthTime(boolean appointedFifthTime) {this.appointedFifthTime = appointedFifthTime;}
    public boolean getAppointedSixthTime() {return appointedSixthTime;}
    public void setAppointedSixthTime(boolean appointedSixthTime) {this.appointedSixthTime = appointedSixthTime;}
    public boolean getAppointedSeventhTime() {return appointedSeventhTime;}
    public void setAppointedSeventhTime(boolean appointedSeventhTime) {this.appointedSeventhTime = appointedSeventhTime;}
    public boolean getAppointedEighthTime() {return appointedEighthTime;}
    public void setAppointedEighthTime(boolean appointedEighthTime) {this.appointedEighthTime = appointedEighthTime;}
    public boolean getAppointedNinthTime() {return appointedNinthTime;}
    public void setAppointedNinthTime(boolean appointedNinthTime) {this.appointedNinthTime = appointedNinthTime;}
    public boolean getAppointedTenthTime() {return appointedTenthTime;}
    public void setAppointedTenthTime(boolean appointedTenthTime) {this.appointedTenthTime = appointedTenthTime;}
    public boolean getAppointedEleventhTime() {return appointedEleventhTime;}
    public void setAppointedEleventhTime(boolean appointedEleventhTime) {this.appointedEleventhTime = appointedEleventhTime;}
    public boolean getAppointedTwelfthTime() {return appointedTwelfthTime;}
    public void setAppointedTwelfthTime(boolean appointedTwelfthTime) {this.appointedTwelfthTime = appointedTwelfthTime;}
    public boolean getAppointedThirteenthTime() {return appointedThirteenthTime;}
    public void setAppointedThirteenthTime(boolean appointedThirteenthTime) {this.appointedThirteenthTime = appointedThirteenthTime;}
    public boolean getAppointedFourteenthTime() {return appointedFourteenthTime;}
    public void setAppointedFourteenthTime(boolean appointedFourteenthTime) {this.appointedFourteenthTime = appointedFourteenthTime;}
    public boolean getAppointedFifteenthTime() {return appointedFifteenthTime;}
    public void setAppointedFifteenthTime(boolean appointedFifteenthTime) {this.appointedFifteenthTime = appointedFifteenthTime;}
    public boolean getAppointedSixteenthTime() {return appointedSixteenthTime;}
    public void setAppointedSixteenthTime(boolean appointedSixteenthTime) {this.appointedSixteenthTime = appointedSixteenthTime;}
    public boolean getAppointedSeventeenthTime() {return appointedSeventeenthTime;}
    public void setAppointedSeventeenthTime(boolean appointedSeventeenthTime) {this.appointedSeventeenthTime = appointedSeventeenthTime;}
    public boolean getAppointedEighteenthTime() {return appointedEighteenthTime;}
    public void setAppointedEighteenthTime(boolean appointedEighteenthTime) {this.appointedEighteenthTime = appointedEighteenthTime;}
    public boolean getAppointedNineteenthTime() {return appointedNineteenthTime;}
    public void setAppointedNineteenthTime(boolean appointedNineteenthTime) {this.appointedNineteenthTime = appointedNineteenthTime;}
    public boolean getAppointedTwentiethTime() {return appointedTwentiethTime;}
    public void setAppointedTwentiethTime(boolean appointedTwentiethTime) {this.appointedTwentiethTime = appointedTwentiethTime;}

    public String getFirstTimeClient() {return firstTimeClient;}
    public void setFirstTimeClient(String firstTimeClient) {this.firstTimeClient = firstTimeClient;}
    public String getSecondTimeClient() {return secondTimeClient;}
    public void setSecondTimeClient(String secondTimeClient) {this.secondTimeClient = secondTimeClient;}
    public String getThirdTimeClient() {return thirdTimeClient;}
    public void setThirdTimeClient(String thirdTimeClient) {this.thirdTimeClient = thirdTimeClient;}
    public String getFourthTimeClient() {return fourthTimeClient;}
    public void setFourthTimeClient(String fourthTimeClient) {this.fourthTimeClient = fourthTimeClient;}
    public String getFifthTimeClient() {return fifthTimeClient;}
    public void setFifthTimeClient(String fifthTimeClient) {this.fifthTimeClient = fifthTimeClient;}
    public String getSixthTimeClient() {return sixthTimeClient;}
    public void setSixthTimeClient(String sixthTimeClient) {this.sixthTimeClient = sixthTimeClient;}
    public String getSeventhTimeClient() {return seventhTimeClient;}
    public void setSeventhTimeClient(String seventhTimeClient) {this.seventhTimeClient = seventhTimeClient;}
    public String getEighthTimeClient() {return eighthTimeClient;}
    public void setEighthTimeClient(String eighthTimeClient) {this.eighthTimeClient = eighthTimeClient;}
    public String getNinthTimeClient() {return ninthTimeClient;}
    public void setNinthTimeClient(String ninthTimeClient) {this.ninthTimeClient = ninthTimeClient;}
    public String getTenthTimeClient() {return tenthTimeClient;}
    public void setTenthTimeClient(String tenthTimeClient) {this.tenthTimeClient = tenthTimeClient;}
    public String getEleventhTimeClient() {return eleventhTimeClient;}
    public void setEleventhTimeClient(String eleventhTimeClient) {this.eleventhTimeClient = eleventhTimeClient;}
    public String getTwelfthTimeClient() {return twelfthTimeClient;}
    public void setTwelfthTimeClient(String twelfthTimeClient) {this.twelfthTimeClient = twelfthTimeClient;}
    public String getThirteenthTimeClient() {return thirteenthTimeClient;}
    public void setThirteenthTimeClient(String thirteenthTimeClient) {this.thirteenthTimeClient = thirteenthTimeClient;}
    public String getFourteenthTimeClient() {return fourteenthTimeClient;}
    public void setFourteenthTimeClient(String fourteenthTimeClient) {this.fourteenthTimeClient = fourteenthTimeClient;}
    public String getFifteenthTimeClient() {return fifteenthTimeClient;}
    public void setFifteenthTimeClient(String fifteenthTimeClient) {this.fifteenthTimeClient = fifteenthTimeClient;}
    public String getSixteenthTimeClient() {return sixteenthTimeClient;}
    public void setSixteenthTimeClient(String sixteenthTimeClient) {this.sixteenthTimeClient = sixteenthTimeClient;}
    public String getSeventeenthTimeClient() {return seventeenthTimeClient;}
    public void setSeventeenthTimeClient(String seventeenthTimeClient) {this.seventeenthTimeClient = seventeenthTimeClient;}
    public String getEighteenthTimeClient() {return eighteenthTimeClient;}
    public void setEighteenthTimeClient(String eighteenthTimeClient) {this.eighteenthTimeClient = eighteenthTimeClient;}
    public String getNineteenthTimeClient() {return nineteenthTimeClient;}
    public void setNineteenthTimeClient(String nineteenthTimeClient) {this.nineteenthTimeClient = nineteenthTimeClient;}
    public String getTwentiethTimeClient() {return twentiethTimeClient;}
    public void setTwentiethTimeClient(String twentiethTimeClient) {this.twentiethTimeClient = twentiethTimeClient;}
}
