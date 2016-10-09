package hospital.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visits")
public class Visit {
    @Id
    @GeneratedValue
    private int idVisit;
    private String doctorName;
    private String visitDate;
    private String visitTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idClient")
    Client client;

    public Visit() {}

    public Visit(String aDoctorName, String aVisitDate, String aVisitTime, Client aClient) {
        doctorName = aDoctorName;
        visitDate = aVisitDate;
        visitTime = aVisitTime;
        client = aClient;
    }

    public int getIdVisit() {return idVisit;}
    public String getDoctorName() {return doctorName;}
    public String getVisitDate() {return visitDate;}
    public String getVisitTime() {return visitTime;}

    public void setClient(Client client) {this.client = client;}
}
