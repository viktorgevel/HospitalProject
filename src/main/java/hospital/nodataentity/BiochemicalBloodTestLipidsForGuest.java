package hospital.nodataentity;

import static hospital.nodataentity.MedicalConstant.*;
import static hospital.nodataentity.MedicalAdvice.*;

public class BiochemicalBloodTestLipidsForGuest {
    private String indexCholesterol;
    private String indexLowDensityLipoprotein;
    private String indexHighDensityLipoprotein;

    private String assessmentCholesterol;
    private String assessmentLowDensityLipoprotein;
    private String assessmentHighDensityLipoprotein;

    public BiochemicalBloodTestLipidsForGuest(String aSexAge, double aCholesterol,
                                              double aLowDensityLipoprotein, double aHighDensityLipoprotein) {
        if (aSexAge.equals("до 1 місяця")) {
            if (aCholesterol < CHILDTO1MONTHMINCHOL) {
                indexCholesterol = BELOWSTANDARD;
                assessmentCholesterol = CHOLESTEROLLOW;
            } else if(aCholesterol > CHILDTO1MONTHMAXCHOL) {
                indexCholesterol = ABOVESTANDARD;
                assessmentCholesterol = CHOLESTEROLHIGH;
            } else {indexCholesterol = STANDARD; assessmentCholesterol = "";}

            if(aLowDensityLipoprotein < CHILDTO1MONTHMINLDL) {
                indexLowDensityLipoprotein = BELOWSTANDARD;
                assessmentLowDensityLipoprotein = LOWDENSITYLIPOPROTEINLOW;
            } else if(aLowDensityLipoprotein > CHILDTO1MONTHMAXLDL) {
                indexLowDensityLipoprotein = ABOVESTANDARD;
                assessmentLowDensityLipoprotein = LOWDENSITYLIPOPROTEINHIGH;
            } else {indexLowDensityLipoprotein = STANDARD; assessmentLowDensityLipoprotein = "";}

            if(aHighDensityLipoprotein < CHILDTO1MONTHMINHDL) {
                indexHighDensityLipoprotein = BELOWSTANDARD;
                assessmentHighDensityLipoprotein = HIGHDENSITYLIPOPROTEINLOW;
            } if(aHighDensityLipoprotein > CHILDTO1MONTHMAXHDL) {
                indexHighDensityLipoprotein = ABOVESTANDARD;
                assessmentHighDensityLipoprotein = HIGHDENSITYLIPOPROTEINHIGH;
            } else {indexHighDensityLipoprotein = STANDARD; assessmentHighDensityLipoprotein = "";}
        }

        if(aSexAge.equals("до 1 року")) {
            if (aCholesterol < CHILDTO1YEARMINCHOL) {
                indexCholesterol = BELOWSTANDARD;
                assessmentCholesterol = CHOLESTEROLLOW;
            } else if(aCholesterol > CHILDTO1YEARMAXCHOL) {
                indexCholesterol = ABOVESTANDARD;
                assessmentCholesterol = CHOLESTEROLHIGH;
            } else {indexCholesterol = STANDARD; assessmentCholesterol = "";}

            if(aLowDensityLipoprotein < CHILDTO1YEARMINLDL) {
                indexLowDensityLipoprotein = BELOWSTANDARD;
                assessmentLowDensityLipoprotein = LOWDENSITYLIPOPROTEINLOW;
            } else if(aLowDensityLipoprotein > CHILDTO1YEARMAXLDL) {
                indexLowDensityLipoprotein = ABOVESTANDARD;
                assessmentLowDensityLipoprotein = LOWDENSITYLIPOPROTEINHIGH;
            } else {indexLowDensityLipoprotein = STANDARD; assessmentLowDensityLipoprotein = "";}

            if(aHighDensityLipoprotein < CHILDTO1YEARMINHDL) {
                indexHighDensityLipoprotein = BELOWSTANDARD;
                assessmentHighDensityLipoprotein = HIGHDENSITYLIPOPROTEINLOW;
            } if(aHighDensityLipoprotein > CHILDTO1YEARMAXHDL) {
                indexHighDensityLipoprotein = ABOVESTANDARD;
                assessmentHighDensityLipoprotein = HIGHDENSITYLIPOPROTEINHIGH;
            } else {indexHighDensityLipoprotein = STANDARD; assessmentHighDensityLipoprotein = "";}
        }

        if(aSexAge.equals("від 1 до 14 років")) {
            if (aCholesterol < CHILDTO14YEARMINCHOL) {
                indexCholesterol = BELOWSTANDARD;
                assessmentCholesterol = CHOLESTEROLLOW;
            } else if(aCholesterol > CHILDTO14YEARMAXCHOL) {
                indexCholesterol = ABOVESTANDARD;
                assessmentCholesterol = CHOLESTEROLHIGH;
            } else {indexCholesterol = STANDARD; assessmentCholesterol = "";}

            if(aLowDensityLipoprotein < CHILDTO14YEARMINLDL) {
                indexLowDensityLipoprotein = BELOWSTANDARD;
                assessmentLowDensityLipoprotein = LOWDENSITYLIPOPROTEINLOW;
            } else if(aLowDensityLipoprotein > CHILDTO14YEARMAXLDL) {
                indexLowDensityLipoprotein = ABOVESTANDARD;
                assessmentLowDensityLipoprotein = LOWDENSITYLIPOPROTEINHIGH;
            } else {indexLowDensityLipoprotein = STANDARD; assessmentLowDensityLipoprotein = "";}

            if(aHighDensityLipoprotein < CHILDTO14YEARMINHDL) {
                indexHighDensityLipoprotein = BELOWSTANDARD;
                assessmentHighDensityLipoprotein = HIGHDENSITYLIPOPROTEINLOW;
            } if(aHighDensityLipoprotein > CHILDTO14YEARMAXHDL) {
                indexHighDensityLipoprotein = ABOVESTANDARD;
                assessmentHighDensityLipoprotein = HIGHDENSITYLIPOPROTEINHIGH;
            } else {indexHighDensityLipoprotein = STANDARD; assessmentHighDensityLipoprotein = "";}
        }

        if(aSexAge.equals("жінка")) {
            if (aCholesterol < WOMANMINCHOL) {
                indexCholesterol = BELOWSTANDARD;
                assessmentCholesterol = CHOLESTEROLLOW;
            } else if(aCholesterol > WOMANMAXCHOL) {
                indexCholesterol = ABOVESTANDARD;
                assessmentCholesterol = CHOLESTEROLHIGH;
            } else {indexCholesterol = STANDARD; assessmentCholesterol = "";}

            if(aLowDensityLipoprotein < WOMANMINLDL) {
                indexLowDensityLipoprotein = BELOWSTANDARD;
                assessmentLowDensityLipoprotein = LOWDENSITYLIPOPROTEINLOW;
            } else if(aLowDensityLipoprotein > WOMANMAXLDL) {
                indexLowDensityLipoprotein = ABOVESTANDARD;
                assessmentLowDensityLipoprotein = LOWDENSITYLIPOPROTEINHIGH;
            } else {indexLowDensityLipoprotein = STANDARD; assessmentLowDensityLipoprotein = "";}

            if(aHighDensityLipoprotein < WOMANMINHDL) {
                indexHighDensityLipoprotein = BELOWSTANDARD;
                assessmentHighDensityLipoprotein = HIGHDENSITYLIPOPROTEINLOW;
            } if(aHighDensityLipoprotein > WOMANMAXHDL) {
                indexHighDensityLipoprotein = ABOVESTANDARD;
                assessmentHighDensityLipoprotein = HIGHDENSITYLIPOPROTEINHIGH;
            } else {indexHighDensityLipoprotein = STANDARD; assessmentHighDensityLipoprotein = "";}
        }

        if(aSexAge.equals("чоловік")) {
            if (aCholesterol < MANMINCHOL) {
                indexCholesterol = BELOWSTANDARD;
                assessmentCholesterol = CHOLESTEROLLOW;
            } else if(aCholesterol > MANMAXCHOL) {
                indexCholesterol = ABOVESTANDARD;
                assessmentCholesterol = CHOLESTEROLHIGH;
            } else {indexCholesterol = STANDARD; assessmentCholesterol = "";}

            if(aLowDensityLipoprotein < MANMINLDL) {
                indexLowDensityLipoprotein = BELOWSTANDARD;
                assessmentLowDensityLipoprotein = LOWDENSITYLIPOPROTEINLOW;
            } else if(aLowDensityLipoprotein > MANMAXLDL) {
                indexLowDensityLipoprotein = ABOVESTANDARD;
                assessmentLowDensityLipoprotein = LOWDENSITYLIPOPROTEINHIGH;
            } else {indexLowDensityLipoprotein = STANDARD; assessmentLowDensityLipoprotein = "";}

            if(aHighDensityLipoprotein < MANMINHDL) {
                indexHighDensityLipoprotein = BELOWSTANDARD;
                assessmentHighDensityLipoprotein = HIGHDENSITYLIPOPROTEINLOW;
            } if(aHighDensityLipoprotein > MANMAXHDL) {
                indexHighDensityLipoprotein = ABOVESTANDARD;
                assessmentHighDensityLipoprotein = HIGHDENSITYLIPOPROTEINHIGH;
            } else {indexHighDensityLipoprotein = STANDARD; assessmentHighDensityLipoprotein = "";}
        }

        if(aCholesterol < 5.2) assessmentCholesterol += CHOLESTEROLRISKLOW;
        else if(aCholesterol < 6.2) assessmentCholesterol += CHOLESTEROLRISKBORDER;
        else assessmentCholesterol += CHOLESTEROLRISKHIGH;

        if(aSexAge.equals("жінка")) {
            if(aHighDensityLipoprotein < 1.3) assessmentHighDensityLipoprotein +=  HDLRISKLOW;
            else if(aHighDensityLipoprotein < 1.5) assessmentHighDensityLipoprotein += HDLRISKMIDDLE;
            else assessmentHighDensityLipoprotein += HDLRISKHIGH;}

        if(aSexAge.equals("чоловік")) {
            if(aHighDensityLipoprotein < 1.0) assessmentHighDensityLipoprotein += HDLRISKLOW;
            else if(aHighDensityLipoprotein < 1.3) assessmentHighDensityLipoprotein += HDLRISKMIDDLE;
            else assessmentHighDensityLipoprotein += HDLRISKHIGH;}
    }

    public String getIndexCholesterol() {return indexCholesterol;}
    public String getIndexLowDensityLipoprotein() {return indexLowDensityLipoprotein;}
    public String getIndexHighDensityLipoprotein() {return indexHighDensityLipoprotein;}
    public String getAssessmentCholesterol() {return assessmentCholesterol;}
    public String getAssessmentLowDensityLipoprotein() {return assessmentLowDensityLipoprotein;}
    public String getAssessmentHighDensityLipoprotein() {return assessmentHighDensityLipoprotein;}
}