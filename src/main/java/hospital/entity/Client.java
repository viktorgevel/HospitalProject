package hospital.entity;

import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "clients")
public class Client{

    @Id
    @GeneratedValue
    private int idClient;
    private String firstName;
    private String secondName;
    private String patronymic;
    private Date dayOfBirth;
    private String sex;
    private static int countClient = 0;
    private String address;
    private String phone;

    private String login;
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "idDoctor")
    private Doctor doctor;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client", cascade = CascadeType.ALL)
    private List<Visit> visits;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = {CascadeType.ALL})
    private List<GeneralBloodTest> generalBloodTests;


    public Client() {}

    public Client(String j_username, String j_password, String aFirstName, String aSecondName, String aPatronymic,
                  int aYear, int aMonth, int aDay, String aSex,
                  String aAddress, String aPhone) {
        login = j_username;
        password = DigestUtils.sha1Hex(j_password);
        firstName = aFirstName;
        secondName = aSecondName;
        patronymic = aPatronymic;
        GregorianCalendar calendar = new GregorianCalendar(aYear, aMonth - 1, aDay);
        dayOfBirth = calendar.getTime();
        sex = aSex;
        address = aAddress;
        phone = aPhone;
        idClient = ++countClient;
    }

    public int getIdClient() {return idClient;}
    public String getName() {return secondName + " " + firstName + " " + patronymic;}
    public Doctor getDoctor() {return doctor;}
    public void setDoctor(Doctor doctor) {this.doctor = doctor;}
    public String getLogin() {return login;}
    public void setLogin(String login) {this.login = login;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getSex() {return sex;}
    public void setSex(String sex) {this.sex = sex;}
}
