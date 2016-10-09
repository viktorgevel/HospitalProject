package hospital.nodataentity;

import static hospital.nodataentity.MedicalConstant.*;
import static hospital.nodataentity.MedicalAdvice.*;

public class BiochemicalBloodTestProteinsForGuest {
    private String indexTotalProtein;
    private String indexAlbumin;

    private String assessmentTotalProtein;
    private String assessmentAlbumin;

    public BiochemicalBloodTestProteinsForGuest(String aSexAge, double aTotalProtein, double aAlbumin) {
        if (aSexAge.equals("до 1 місяця")) {
            if (aTotalProtein < CHILDTO1MONTHMINTP) {
                indexTotalProtein = BELOWSTANDARD;
                assessmentTotalProtein = TOTALPROTEINLOW;
            } else if (aTotalProtein > CHILDTO1MONTHMAXTP) {
                indexTotalProtein = ABOVESTANDARD;
                assessmentTotalProtein = TOTALPROTEINHIGH;
            } else {indexTotalProtein = STANDARD; assessmentTotalProtein = "";}

            if(aAlbumin < CHILDTO1MONTHMINALB) {
                indexAlbumin = BELOWSTANDARD;
                assessmentAlbumin = ALBUMINLOW;
            } else if(aAlbumin > CHILDTO1MONTHMAXALB) {
                indexAlbumin = ABOVESTANDARD;
                assessmentAlbumin = ALBUMINHIGH;
            } else {indexAlbumin = STANDARD; assessmentAlbumin = "";}
        }

        if(aSexAge.equals("до 1 року")) {
            if (aTotalProtein < CHILDTO1YEARMINTP) {
                indexTotalProtein = BELOWSTANDARD;
                assessmentTotalProtein = TOTALPROTEINLOW;
            } else if (aTotalProtein > CHILDTO1YEARMAXTP) {
                indexTotalProtein = ABOVESTANDARD;
                assessmentTotalProtein = TOTALPROTEINHIGH;
            } else {indexTotalProtein = STANDARD; assessmentTotalProtein = "";}

            if(aAlbumin < CHILDTO1YEARMINALB) {
                indexAlbumin = BELOWSTANDARD;
                assessmentAlbumin = ALBUMINLOW;
            } else if(aAlbumin > CHILDTO1YEARMAXALB) {
                indexAlbumin = ABOVESTANDARD;
                assessmentAlbumin = ALBUMINHIGH;
            } else {indexAlbumin = STANDARD; assessmentAlbumin = "";}
        }

        if(aSexAge.equals("від 1 до 14 років")) {
            if (aTotalProtein < CHILDTO14YEARMINTP) {
                indexTotalProtein = BELOWSTANDARD;
                assessmentTotalProtein = TOTALPROTEINLOW;
            } else if (aTotalProtein > CHILDTO14YEARMAXTP) {
                indexTotalProtein = ABOVESTANDARD;
                assessmentTotalProtein = TOTALPROTEINHIGH;
            } else {indexTotalProtein = STANDARD; assessmentTotalProtein = "";}

            if(aAlbumin < CHILDTO14YEARMINALB) {
                indexAlbumin = BELOWSTANDARD;
                assessmentAlbumin = ALBUMINLOW;
            } else if(aAlbumin > CHILDTO14YEARMAXALB) {
                indexAlbumin = ABOVESTANDARD;
                assessmentAlbumin = ALBUMINHIGH;
            } else {indexAlbumin = STANDARD; assessmentAlbumin = "";}
        }

        if(aSexAge.equals("жінка")) {
            if (aTotalProtein < WOMANMINTP) {
                indexTotalProtein = BELOWSTANDARD;
                assessmentTotalProtein = TOTALPROTEINLOW + TOTALPROTEINLOWWOMAN;
            } else if (aTotalProtein > WOMANMAXTP) {
                indexTotalProtein = ABOVESTANDARD;
                assessmentTotalProtein = TOTALPROTEINHIGH;
            } else {indexTotalProtein = STANDARD; assessmentTotalProtein = "";}

            if(aAlbumin < WOMANMINALB) {
                indexAlbumin = BELOWSTANDARD;
                assessmentAlbumin = ALBUMINLOW + ALBUMINLOWWOMAN;
            } else if(aAlbumin > WOMANMAXALB) {
                indexAlbumin = ABOVESTANDARD;
                assessmentAlbumin = ALBUMINHIGH;
            } else {indexAlbumin = STANDARD; assessmentAlbumin = "";}
        }

        if(aSexAge.equals("чоловік")) {
            if (aTotalProtein < MANMINTP) {
                indexTotalProtein = BELOWSTANDARD;
                assessmentTotalProtein = TOTALPROTEINLOW;
            } else if (aTotalProtein > MANMAXTP) {
                indexTotalProtein = ABOVESTANDARD;
                assessmentTotalProtein = TOTALPROTEINHIGH;
            } else {indexTotalProtein = STANDARD; assessmentTotalProtein = "";}

            if(aAlbumin < MANMINALB) {
                indexAlbumin = BELOWSTANDARD;
                assessmentAlbumin = ALBUMINLOW;
            } else if(aAlbumin > MANMAXALB) {
                indexAlbumin = ABOVESTANDARD;
                assessmentAlbumin = ALBUMINHIGH;
            } else {indexAlbumin = STANDARD; assessmentAlbumin = "";}
        }
    }

    public String getIndexTotalProtein() {return indexTotalProtein;}
    public String getIndexAlbumin() {return indexAlbumin;}
    public String getAssessmentTotalProtein() {return assessmentTotalProtein;}
    public String getAssessmentAlbumin() {return assessmentAlbumin;}
}