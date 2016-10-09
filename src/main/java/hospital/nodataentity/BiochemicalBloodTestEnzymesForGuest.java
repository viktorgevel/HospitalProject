package hospital.nodataentity;

import static hospital.nodataentity.MedicalConstant.*;
import static hospital.nodataentity.MedicalAdvice.*;

public class BiochemicalBloodTestEnzymesForGuest {
    private String indexAmylase;
    private String indexLipase;
    private String indexLactateDehydrogenase;
    private String indexAlanineAminotransferase;
    private String indexAspartateAminotransferase;
    private String indexAlkalinePhosphatase;

    private String assessmentAmylase;
    private String assessmentLipase;
    private String assessmentLactateDehydrogenase;
    private String assessmentAlanineAminotransferase;
    private String assessmentAspartateAminotransferase;
    private String assessmentAlkalinePhosphatase;

    public BiochemicalBloodTestEnzymesForGuest(String aSexAge, double aAmylase, double aLipase,
                                               double aLactateDehydrogenase, double aAlanineAminotransferase,
                                               double aAspartateAminotransferase, double aAlkalinePhosphatase) {
        if(aSexAge.equals("до 1 місяця")) {
            if(aAmylase > CHILDTO1MONTHMAXAML) {
                indexAmylase = ABOVESTANDARD;
                assessmentAmylase = AMYLASEHIGH + AMYLASELITTLECHILD;
            } else {indexAmylase = STANDARD; assessmentAmylase = "";}

            if(aLipase > CHILDTO1MONTHMAXLPS) {
                indexLipase = ABOVESTANDARD;
                assessmentLipase = LIPASEHIGH + LIPASELITTLECHILD;
            } else {indexLipase = STANDARD; assessmentLipase = "";}

            if(aLactateDehydrogenase > CHILDTO1MONTHMAXLDH) {
                indexLactateDehydrogenase = ABOVESTANDARD;
                assessmentLactateDehydrogenase = LACTATEDEHYDROGENASEHIGH;
            } else {indexLactateDehydrogenase = STANDARD; assessmentLactateDehydrogenase = "";}

            if(aAlanineAminotransferase > CHILDTO1MONTHMAXALT) {
                indexAlanineAminotransferase = ABOVESTANDARD;
                assessmentAlanineAminotransferase = ALANINEAMINOTRANSFERASEHIGH + ALANINEAMINOTRANSFERASEHIGHFORCHILDTO14YEAR;
            } else {indexAlanineAminotransferase = STANDARD; assessmentAlanineAminotransferase = "";}

            if(aAspartateAminotransferase > CHILDTO1MONTHMAXAST) {
                indexAspartateAminotransferase = ABOVESTANDARD;
                assessmentAspartateAminotransferase = ASPARTATEAMINOTRANSFERASEHIGH;
            } else {indexAspartateAminotransferase = STANDARD; assessmentAspartateAminotransferase = "";}

            if(aAlkalinePhosphatase > CHILDTO1MONTHMAXALKP) {
                indexAlkalinePhosphatase = ABOVESTANDARD;
                assessmentAlkalinePhosphatase = ALKALINEPHOSPHATASEHIGH;
            } else if (aAlkalinePhosphatase < CHILDTO1MONTHMINALKP) {
                indexAlkalinePhosphatase = BELOWSTANDARD;
                assessmentAlkalinePhosphatase = ALKALINEPHOSPHATASELOW;
            } else {indexAlkalinePhosphatase = STANDARD; assessmentAlkalinePhosphatase = "";}
        }

        if(aSexAge.equals("до 1 року")) {
            if(aAmylase > CHILDTO1YEARMAXAML) {
                indexAmylase = ABOVESTANDARD;
                assessmentAmylase = AMYLASEHIGH;
            } else {indexAmylase = STANDARD; assessmentAmylase = "";}

            if(aLipase > CHILDTO1YEARMAXLPS) {
                indexLipase = ABOVESTANDARD;
                assessmentLipase = LIPASEHIGH;
            } else {indexLipase = STANDARD; assessmentLipase = "";}

            if(aLactateDehydrogenase > CHILDTO1YEARMAXLDH) {
                indexLactateDehydrogenase = ABOVESTANDARD;
                assessmentLactateDehydrogenase = LACTATEDEHYDROGENASEHIGH;
            } else {indexLactateDehydrogenase = STANDARD; assessmentLactateDehydrogenase = "";}

            if(aAlanineAminotransferase > CHILDTO1YEARMAXALT) {
                indexAlanineAminotransferase = ABOVESTANDARD;
                assessmentAlanineAminotransferase = ALANINEAMINOTRANSFERASEHIGH + ALANINEAMINOTRANSFERASEHIGHFORCHILDTO14YEAR;
            } else {indexAlanineAminotransferase = STANDARD; assessmentAlanineAminotransferase = "";}

            if(aAspartateAminotransferase > CHILDTO1YEARMAXAST) {
                indexAspartateAminotransferase = ABOVESTANDARD;
                assessmentAspartateAminotransferase = ASPARTATEAMINOTRANSFERASEHIGH;
            } else {indexAspartateAminotransferase = STANDARD; assessmentAspartateAminotransferase = "";}

            if(aAlkalinePhosphatase > CHILDTO1YEARMAXALKP) {
                indexAlkalinePhosphatase = ABOVESTANDARD;
                assessmentAlkalinePhosphatase = ALKALINEPHOSPHATASEHIGH;
            } else if (aAlkalinePhosphatase < CHILDTO1YEARMINALKP) {
                indexAlkalinePhosphatase = BELOWSTANDARD;
                assessmentAlkalinePhosphatase = ALKALINEPHOSPHATASELOW;
            } else {indexAlkalinePhosphatase = STANDARD; assessmentAlkalinePhosphatase = "";}
        }

        if(aSexAge.equals("від 1 до 14 років")) {
            if(aAmylase > CHILDTO14YEARMAXAML) {
                indexAmylase = ABOVESTANDARD;
                assessmentAmylase = AMYLASEHIGH;
            } else {indexAmylase = STANDARD; assessmentAmylase = "";}

            if(aLipase > CHILDTO14YEARMAXLPS) {
                indexLipase = ABOVESTANDARD;
                assessmentLipase = LIPASEHIGH;
            } else {indexLipase = STANDARD; assessmentLipase = "";}

            if(aLactateDehydrogenase > CHILDTO14YEARMAXLDH) {
                indexLactateDehydrogenase = ABOVESTANDARD;
                assessmentLactateDehydrogenase = LACTATEDEHYDROGENASEHIGH;
            } else {indexLactateDehydrogenase = STANDARD; assessmentLactateDehydrogenase = "";}

            if(aAlanineAminotransferase > CHILDTO14YEARMAXALT) {
                indexAlanineAminotransferase = ABOVESTANDARD;
                assessmentAlanineAminotransferase = ALANINEAMINOTRANSFERASEHIGH + ALANINEAMINOTRANSFERASEHIGHFORCHILDTO14YEAR;
            } else {indexAlanineAminotransferase = STANDARD; assessmentAlanineAminotransferase = "";}

            if(aAspartateAminotransferase > CHILDTO14YEARMAXAST) {
                indexAspartateAminotransferase = ABOVESTANDARD;
                assessmentAspartateAminotransferase = ASPARTATEAMINOTRANSFERASEHIGH;
            } else {indexAspartateAminotransferase = STANDARD; assessmentAspartateAminotransferase = "";}

            if(aAlkalinePhosphatase > CHILDTO14YEARMAXALKP) {
                indexAlkalinePhosphatase = ABOVESTANDARD;
                assessmentAlkalinePhosphatase = ALKALINEPHOSPHATASEHIGH;
            } else if (aAlkalinePhosphatase < CHILDTO14YEARMINALKP) {
                indexAlkalinePhosphatase = BELOWSTANDARD;
                assessmentAlkalinePhosphatase = ALKALINEPHOSPHATASELOW;
            } else {indexAlkalinePhosphatase = STANDARD; assessmentAlkalinePhosphatase = "";}
        }

        if(aSexAge.equals("жінка")) {
            if(aAmylase > WOMANMAXAML) {
                indexAmylase = ABOVESTANDARD;
                assessmentAmylase = AMYLASEHIGH + AMYLASEWOMANHIGH;
            } else if (aAmylase<WOMANMINAML) {
                indexAmylase = BELOWSTANDARD;
                assessmentAmylase = AMYLASELOW;}
            else {indexAmylase = STANDARD; assessmentAmylase = "";}

            if(aLipase > WOMANMAXLPS) {
                indexLipase = ABOVESTANDARD;
                assessmentLipase = LIPASEHIGH;
            } else if(aLipase < WOMANMINLPS) {
                indexLipase = BELOWSTANDARD;
                assessmentLipase = LIPASELOW;
            } else {indexLipase = STANDARD; assessmentLipase = "";}

            if(aLactateDehydrogenase > WOMANMAXLDH) {
                indexLactateDehydrogenase = ABOVESTANDARD;
                assessmentLactateDehydrogenase = LACTATEDEHYDROGENASEHIGH;
            } else if(aLactateDehydrogenase < WOMANMINLDH) {
                indexLactateDehydrogenase = BELOWSTANDARD;
                assessmentLactateDehydrogenase = LACTATEDEHYDROGENASELOW;
            } else {indexLactateDehydrogenase = STANDARD; assessmentLactateDehydrogenase = "";}

            if(aAlanineAminotransferase > WOMANMAXALT) {
                indexAlanineAminotransferase = ABOVESTANDARD;
                assessmentAlanineAminotransferase = ALANINEAMINOTRANSFERASEHIGH;
            } else {indexAlanineAminotransferase = STANDARD; assessmentAlanineAminotransferase = "";}

            if(aAspartateAminotransferase > WOMANMAXAST) {
                indexAspartateAminotransferase = ABOVESTANDARD;
                assessmentAspartateAminotransferase = ASPARTATEAMINOTRANSFERASEHIGH;
            } else if(aAspartateAminotransferase < WOMANMINAST) {
                indexAspartateAminotransferase = BELOWSTANDARD;
                assessmentAspartateAminotransferase = ASPARTATEAMINOTRANSFERASELOW + ASPARTATEAMINOTRANSFERASELOWWOMAN;
            } else {indexAspartateAminotransferase = STANDARD; assessmentAspartateAminotransferase = "";}

            if(aAlkalinePhosphatase > WOMANMAXALKP) {
                indexAlkalinePhosphatase = ABOVESTANDARD;
                assessmentAlkalinePhosphatase = ALKALINEPHOSPHATASEHIGH + ALKALINEPHOSPHATASEHIGHWOMAN;
            } else if (aAlkalinePhosphatase < WOMANMINALKP) {
                indexAlkalinePhosphatase = BELOWSTANDARD;
                assessmentAlkalinePhosphatase = ALKALINEPHOSPHATASELOW + ALKALINEPHOSPHATASELOWWOMAN;
            } else {indexAlkalinePhosphatase = STANDARD; assessmentAlkalinePhosphatase = "";}
        }

        if(aSexAge.equals("чоловік")) {
            if(aAmylase > MANMAXAML) {
                indexAmylase = ABOVESTANDARD;
                assessmentAmylase = AMYLASEHIGH;
            } else if (aAmylase<MANMINAML) {
                indexAmylase = BELOWSTANDARD;
                assessmentAmylase = AMYLASELOW;}
            else {indexAmylase = STANDARD; assessmentAmylase = "";}

            if(aLipase > MANMAXLPS) {
                indexLipase = ABOVESTANDARD;
                assessmentLipase = LIPASEHIGH;
            } else if(aLipase < MANMINLPS) {
                indexLipase = BELOWSTANDARD;
                assessmentLipase = LIPASELOW;
            } else {indexLipase = STANDARD; assessmentLipase = "";}

            if(aLactateDehydrogenase > MANMAXLDH) {
                indexLactateDehydrogenase = ABOVESTANDARD;
                assessmentLactateDehydrogenase = LACTATEDEHYDROGENASEHIGH;
            } else if(aLactateDehydrogenase < MANMINLDH) {
                indexLactateDehydrogenase = BELOWSTANDARD;
                assessmentLactateDehydrogenase = LACTATEDEHYDROGENASELOW;
            } else {indexLactateDehydrogenase = STANDARD; assessmentLactateDehydrogenase = "";}

            if(aAlanineAminotransferase > MANMAXALT) {
                indexAlanineAminotransferase = ABOVESTANDARD;
                assessmentAlanineAminotransferase = ALANINEAMINOTRANSFERASEHIGH;
            } else {indexAlanineAminotransferase = STANDARD; assessmentAlanineAminotransferase = "";}

            if(aAspartateAminotransferase > MANMAXAST) {
                indexAspartateAminotransferase = ABOVESTANDARD;
                assessmentAspartateAminotransferase = ASPARTATEAMINOTRANSFERASEHIGH;
            } else if(aAspartateAminotransferase < MANMINAST) {
                indexAspartateAminotransferase = BELOWSTANDARD;
                assessmentAspartateAminotransferase = ASPARTATEAMINOTRANSFERASELOW ;
            } else {indexAspartateAminotransferase = STANDARD; assessmentAspartateAminotransferase = "";}

            if(aAlkalinePhosphatase > MANMAXALKP) {
                indexAlkalinePhosphatase = ABOVESTANDARD;
                assessmentAlkalinePhosphatase = ALKALINEPHOSPHATASEHIGH;
            } else if (aAlkalinePhosphatase < MANMINALKP) {
                indexAlkalinePhosphatase = BELOWSTANDARD;
                assessmentAlkalinePhosphatase = ALKALINEPHOSPHATASELOW;
            } else {indexAlkalinePhosphatase = STANDARD; assessmentAlkalinePhosphatase = "";}
        }
    }

    public String getIndexAmylase() {return indexAmylase;}
    public String getIndexLipase() {return indexLipase;}
    public String getIndexLactateDehydrogenase() {return indexLactateDehydrogenase;}
    public String getIndexAlanineAminotransferase() {return indexAlanineAminotransferase;}
    public String getIndexAspartateAminotransferase() {return indexAspartateAminotransferase;}
    public String getIndexAlkalinePhosphatase() {return indexAlkalinePhosphatase;}
    public String getAssessmentAmylase() {return assessmentAmylase;}
    public String getAssessmentLipase() {return assessmentLipase;}
    public String getAssessmentLactateDehydrogenase() {return assessmentLactateDehydrogenase;}
    public String getAssessmentAlanineAminotransferase() {return assessmentAlanineAminotransferase;}
    public String getAssessmentAspartateAminotransferase() {return assessmentAspartateAminotransferase;}
    public String getAssessmentAlkalinePhosphatase() {return assessmentAlkalinePhosphatase;}
}