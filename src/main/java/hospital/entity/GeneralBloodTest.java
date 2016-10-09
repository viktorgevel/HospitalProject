package hospital.entity;

import javax.persistence.*;

@Entity
@Table(name = "generalbloodtests")
public class GeneralBloodTest {
    @Id
    @GeneratedValue
    private int idGBT;
    private String testDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idClient")
    Client client;

    /** Гемоглобін (HGB)*/
    private double hemoglobin;
    // Кількість еритроцитів (RBC)
    private double redBloodCell;
    /** Гематокрит (HCT)*/
    private double hematocrit;
    /** Середній вміст гемоглобіну в еритроциті (MCH)*/
    private double meanCorpuscularHemoglobin;
    /** Тромбоцити (PLT)*/
    private double platelet;
    /** Лейкоцити(WBC)*/
    private  double whiteBloodCell;
    /** Швидкість осідання еритроцитів (ESR)*/
    private double erythrocyteSedimentationRate;

    public GeneralBloodTest(){}

    public GeneralBloodTest(Client aClient, String aTestDate, double aHemoglobin, double aRedBloodCell,
                            double aHematocrit, double aMeanCorpuscularHemoglobin, double aPlatelet,
                            double aWhiteBloodCell, double aErythrocyteSedimentationRate){
        client = aClient;
        testDate = aTestDate;
        hemoglobin = aHemoglobin;
        redBloodCell = aRedBloodCell;
        hematocrit = aHematocrit;
        meanCorpuscularHemoglobin = aMeanCorpuscularHemoglobin;
        platelet = aPlatelet;
        whiteBloodCell = aWhiteBloodCell;
        erythrocyteSedimentationRate = aErythrocyteSedimentationRate;
    }

    public int getIdGBT() {
        return idGBT;
    }
    public String getTestDate() {return testDate;}
    public double getHemoglobin() {return hemoglobin;}
    public double getRedBloodCell() {return redBloodCell;}
    public double getHematocrit() {return hematocrit;}
    public double getMeanCorpuscularHemoglobin() {return meanCorpuscularHemoglobin;}
    public double getPlatelet() {return platelet;}
    public double getWhiteBloodCell() {return whiteBloodCell;}
    public double getErythrocyteSedimentationRate() {return erythrocyteSedimentationRate;}
}
