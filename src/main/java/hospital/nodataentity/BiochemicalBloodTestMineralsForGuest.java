package hospital.nodataentity;

import static hospital.nodataentity.MedicalConstant.*;
import static hospital.nodataentity.MedicalAdvice.*;

public class BiochemicalBloodTestMineralsForGuest {
    private String indexPotassium;
    private String indexSodium;
    private String indexCalcium;
    private String indexMagnesium;
    private String indexPhosphorus;
    private String indexIron;

    private String assessmentPotassium;
    private String assessmentSodium;
    private String assessmentCalcium;
    private String assessmentMagnesium;
    private String assessmentPhosphorus;
    private String assessmentIron;

    public BiochemicalBloodTestMineralsForGuest(String aSexAge, double aPotassium, double aSodium, double aCalcium,
                                                double aMagnesium, double aPhosphorus, double aIron) {
        if (aSexAge.equals("до 1 місяця")) {
            if (aPotassium < CHILDTO1MONTHMINK) {
                indexPotassium = BELOWSTANDARD;
                assessmentPotassium = POTASSIUMLOW + POTASSIUMLOWSYMPTOMS;
            } else if (aPotassium > CHILDTO1MONTHMAXK) {
                indexPotassium = ABOVESTANDARD;
                assessmentPotassium = POTASSIUMHIGH + POTASSIUMHIGHSYMPTOMS;
            } else {indexPotassium = STANDARD; assessmentPotassium = "";}

            if (aSodium < CHILDTO1MONTHMINNA) {
                indexSodium = BELOWSTANDARD;
                assessmentSodium = SODIUMLOW + SODIUMLOWSYMPTOMS;
            } else if (aSodium > CHILDTO1MONTHMAXNA) {
                indexSodium = ABOVESTANDARD;
                assessmentSodium = SODIUMHIGH + SODIUMHIGHSYMPTOMS;
            } else {indexSodium = STANDARD; assessmentSodium = "";}

            if(aCalcium < CHILDTO1MONTHMINCA) {
                indexCalcium = BELOWSTANDARD;
                assessmentCalcium = CALCIUMLOW + CALCIUMLOWSYMPTOMS;
            } else if (aCalcium > CHILDTO1MONTHMAXCA) {
                indexCalcium = ABOVESTANDARD;
                assessmentCalcium = CALCIUMHIGH + CALCIUMHIGHSYMPTOMS;
            } else {indexCalcium = STANDARD; assessmentCalcium = "";}

            if(aMagnesium < CHILDTO1MONTHMINMG) {
                indexMagnesium = BELOWSTANDARD;
                assessmentMagnesium = MAGNESIUMLOW + MAGNESIUMLOWSYMPTOMS;
            } else if (aMagnesium > CHILDTO1MONTHMAXMG) {
                indexMagnesium = ABOVESTANDARD;
                assessmentMagnesium = MAGNESIUMHIGH + MAGNESIUMHIGHSYMPTOMS;
            } else {indexMagnesium = STANDARD; assessmentMagnesium = "";}

            if(aPhosphorus < CHILDTO1MONTHMINP) {
                indexPhosphorus = BELOWSTANDARD;
                assessmentPhosphorus = PHOSPHORUSLOW + PHOSPHORUSLOWLITTLECHILD + PHOSPHORUSLOWSYMPTOMS;
            } else if(aPhosphorus > CHILDTO1MONTHMAXP) {
                indexPhosphorus = ABOVESTANDARD;
                assessmentPhosphorus = PHOSPHORUSHIGH + PHOSPHORUSHIGHSYMPTOMS;
            } else {indexPhosphorus = STANDARD; assessmentPhosphorus = "";}

            if(aIron < CHILDTO1MONTHMINFE) {
                indexIron = BELOWSTANDARD;
                assessmentIron = IRONLOW + IRONLOWSYMPTOMS;
            } else if(aIron > CHILDTO1MONTHMAXFE) {
                indexIron = ABOVESTANDARD;
                assessmentIron = IRONHIGH + IRONHIGHSYMPTOMS;
            } else {indexIron = STANDARD; assessmentIron = "";}
        }

        if(aSexAge.equals("до 1 року")) {
            if (aPotassium < CHILDTO1YEARMINK) {
                indexPotassium = BELOWSTANDARD;
                assessmentPotassium = POTASSIUMLOW + POTASSIUMLOWSYMPTOMS;
            } else if (aPotassium > CHILDTO1YEARMAXK) {
                indexPotassium = ABOVESTANDARD;
                assessmentPotassium = POTASSIUMHIGH + POTASSIUMHIGHSYMPTOMS;
            } else {indexPotassium = STANDARD; assessmentPotassium = "";}

            if (aSodium < CHILDTO1YEARMINNA) {
                indexSodium = BELOWSTANDARD;
                assessmentSodium = SODIUMLOW + SODIUMLOWSYMPTOMS;
            } else if (aSodium > CHILDTO1YEARMAXNA) {
                indexSodium = ABOVESTANDARD;
                assessmentSodium = SODIUMHIGH + SODIUMHIGHSYMPTOMS;
            } else {indexSodium = STANDARD; assessmentSodium = "";}

            if(aCalcium < CHILDTO1YEARMINCA) {
                indexCalcium = BELOWSTANDARD;
                assessmentCalcium = CALCIUMLOW + CALCIUMLOWSYMPTOMS;
            } else if (aCalcium > CHILDTO1YEARMAXCA) {
                indexCalcium = ABOVESTANDARD;
                assessmentCalcium = CALCIUMHIGH + CALCIUMHIGHSYMPTOMS;
            } else {indexCalcium = STANDARD; assessmentCalcium = "";}

            if(aMagnesium < CHILDTO1YEARMINMG) {
                indexMagnesium = BELOWSTANDARD;
                assessmentMagnesium = MAGNESIUMLOW + MAGNESIUMLOWSYMPTOMS;
            } else if (aMagnesium > CHILDTO1YEARMAXMG) {
                indexMagnesium = ABOVESTANDARD;
                assessmentMagnesium = MAGNESIUMHIGH + MAGNESIUMHIGHSYMPTOMS;
            } else {indexMagnesium = STANDARD; assessmentMagnesium = "";}

            if(aPhosphorus < CHILDTO1YEARMINP) {
                indexPhosphorus = BELOWSTANDARD;
                assessmentPhosphorus = PHOSPHORUSLOW + PHOSPHORUSLOWLITTLECHILD + PHOSPHORUSLOWSYMPTOMS;
            } else if(aPhosphorus > CHILDTO1YEARMAXP) {
                indexPhosphorus = ABOVESTANDARD;
                assessmentPhosphorus = PHOSPHORUSHIGH + PHOSPHORUSHIGHSYMPTOMS;
            } else {indexPhosphorus = STANDARD; assessmentPhosphorus = "";}

            if(aIron < CHILDTO1YEARMINFE) {
                indexIron = BELOWSTANDARD;
                assessmentIron = IRONLOW + IRONLOWSYMPTOMS;
            } else if(aIron > CHILDTO1YEARMAXFE) {
                indexIron = ABOVESTANDARD;
                assessmentIron = IRONHIGH + IRONHIGHSYMPTOMS;
            } else {indexIron = STANDARD; assessmentIron = "";}
        }

        if(aSexAge.equals("від 1 до 14 років")) {
            if (aPotassium < CHILDTO14YEARMINK) {
                indexPotassium = BELOWSTANDARD;
                assessmentPotassium = POTASSIUMLOW + POTASSIUMLOWSYMPTOMS;
            } else if (aPotassium > CHILDTO14YEARMAXK) {
                indexPotassium = ABOVESTANDARD;
                assessmentPotassium = POTASSIUMHIGH + POTASSIUMHIGHSYMPTOMS;
            } else {indexPotassium = STANDARD; assessmentPotassium = "";}

            if (aSodium < CHILDTO14YEARMINNA) {
                indexSodium = BELOWSTANDARD;
                assessmentSodium = SODIUMLOW + SODIUMLOWSYMPTOMS;
            } else if (aSodium > CHILDTO14YEARMAXNA) {
                indexSodium = ABOVESTANDARD;
                assessmentSodium = SODIUMHIGH + SODIUMHIGHSYMPTOMS;
            } else {indexSodium = STANDARD; assessmentSodium = "";}

            if(aCalcium < CHILDTO14YEARMINCA) {
                indexCalcium = BELOWSTANDARD;
                assessmentCalcium = CALCIUMLOW + CALCIUMLOWSYMPTOMS;
            } else if (aCalcium > CHILDTO14YEARMAXCA) {
                indexCalcium = ABOVESTANDARD;
                assessmentCalcium = CALCIUMHIGH + CALCIUMHIGHSYMPTOMS;
            } else {indexCalcium = STANDARD; assessmentCalcium = "";}

            if(aMagnesium < CHILDTO14YEARMINMG) {
                indexMagnesium = BELOWSTANDARD;
                assessmentMagnesium = MAGNESIUMLOW + MAGNESIUMLOWCHILDTO14YEAR + MAGNESIUMLOWSYMPTOMS;
            } else if (aMagnesium > CHILDTO14YEARMAXMG) {
                indexMagnesium = ABOVESTANDARD;
                assessmentMagnesium = MAGNESIUMHIGH + MAGNESIUMHIGHSYMPTOMS;
            } else {indexMagnesium = STANDARD; assessmentMagnesium = "";}

            if(aPhosphorus < CHILDTO14YEARMINP) {
                indexPhosphorus = BELOWSTANDARD;
                assessmentPhosphorus = PHOSPHORUSLOW + PHOSPHORUSLOWSYMPTOMS;
            } else if(aPhosphorus > CHILDTO14YEARMAXP) {
                indexPhosphorus = ABOVESTANDARD;
                assessmentPhosphorus = PHOSPHORUSHIGH + PHOSPHORUSHIGHSYMPTOMS;
            } else {indexPhosphorus = STANDARD; assessmentPhosphorus = "";}

            if(aIron < CHILDTO14YEARMINFE) {
                indexIron = BELOWSTANDARD;
                assessmentIron = IRONLOW + IRONLOWSYMPTOMS;
            } else if(aIron > CHILDTO14YEARMAXFE) {
                indexIron = ABOVESTANDARD;
                assessmentIron = IRONHIGH + IRONHIGHSYMPTOMS;
            } else {indexIron = STANDARD; assessmentIron = "";}
        }

        if(aSexAge.equals("жінка")) {
            if (aPotassium < WOMANMINK) {
                indexPotassium = BELOWSTANDARD;
                assessmentPotassium = POTASSIUMLOW + POTASSIUMLOWWOMAN + POTASSIUMLOWSYMPTOMS;
            } else if (aPotassium > WOMANMAXK) {
                indexPotassium = ABOVESTANDARD;
                assessmentPotassium = POTASSIUMHIGH + POTASSIUMHIGHWOMAN+ POTASSIUMHIGHSYMPTOMS;
            } else {indexPotassium = STANDARD; assessmentPotassium = "";}

            if (aSodium < WOMANMINNA) {
                indexSodium = BELOWSTANDARD;
                assessmentSodium = SODIUMLOW + SODIUMLOWSYMPTOMS;
            } else if (aSodium > WOMANMAXNA) {
                indexSodium = ABOVESTANDARD;
                assessmentSodium = SODIUMHIGH + SODIUMHIGHSYMPTOMS;
            } else {indexSodium = STANDARD; assessmentSodium = "";}

            if(aCalcium < WOMANMINCA) {
                indexCalcium = BELOWSTANDARD;
                assessmentCalcium = CALCIUMLOW + CALCIUMLOWSYMPTOMS;
            } else if (aCalcium > WOMANMAXCA) {
                indexCalcium = ABOVESTANDARD;
                assessmentCalcium = CALCIUMHIGH + CALCIUMHIGHSYMPTOMS;
            } else {indexCalcium = STANDARD; assessmentCalcium = "";}

            if(aMagnesium < WOMANMINMG) {
                indexMagnesium = BELOWSTANDARD;
                assessmentMagnesium = MAGNESIUMLOW + MAGNESIUMLOWWOMAN + MAGNESIUMLOWSYMPTOMS;
            } else if (aMagnesium > WOMANMAXMG) {
                indexMagnesium = ABOVESTANDARD;
                assessmentMagnesium = MAGNESIUMHIGH + MAGNESIUMHIGHSYMPTOMS;
            } else {indexMagnesium = STANDARD; assessmentMagnesium = "";}

            if(aPhosphorus < WOMANMINP) {
                indexPhosphorus = BELOWSTANDARD;
                assessmentPhosphorus = PHOSPHORUSLOW + PHOSPHORUSLOWSYMPTOMS;
            } else if(aPhosphorus > WOMANMAXP) {
                indexPhosphorus = ABOVESTANDARD;
                assessmentPhosphorus = PHOSPHORUSHIGH + PHOSPHORUSHIGHWOMAN + PHOSPHORUSHIGHSYMPTOMS;
            } else {indexPhosphorus = STANDARD; assessmentPhosphorus = "";}

            if(aIron < WOMANMINFE) {
                indexIron = BELOWSTANDARD;
                assessmentIron = IRONLOW + IRONLOWWOMAN + IRONLOWSYMPTOMS;
            } else if(aIron > WOMANMAXFE) {
                indexIron = ABOVESTANDARD;
                assessmentIron = IRONHIGH + IRONHIGHSYMPTOMS;
            } else {indexIron = STANDARD; assessmentIron = "";}
        }

        if(aSexAge.equals("чоловік")) {
            if (aPotassium < MANMINK) {
                indexPotassium = BELOWSTANDARD;
                assessmentPotassium = POTASSIUMLOW + POTASSIUMLOWSYMPTOMS;
            } else if (aPotassium > MANMAXK) {
                indexPotassium = ABOVESTANDARD;
                assessmentPotassium = POTASSIUMHIGH+ POTASSIUMHIGHSYMPTOMS;
            } else {indexPotassium = STANDARD; assessmentPotassium = "";}

            if (aSodium < MANMINNA) {
                indexSodium = BELOWSTANDARD;
                assessmentSodium = SODIUMLOW + SODIUMLOWSYMPTOMS;
            } else if (aSodium > MANMAXNA) {
                indexSodium = ABOVESTANDARD;
                assessmentSodium = SODIUMHIGH + SODIUMHIGHSYMPTOMS;
            } else {indexSodium = STANDARD; assessmentSodium = "";}

            if(aCalcium < MANMINCA) {
                indexCalcium = BELOWSTANDARD;
                assessmentCalcium = CALCIUMLOW + CALCIUMLOWSYMPTOMS;
            } else if (aCalcium > MANMAXCA) {
                indexCalcium = ABOVESTANDARD;
                assessmentCalcium = CALCIUMHIGH + CALCIUMHIGHSYMPTOMS;
            } else {indexCalcium = STANDARD; assessmentCalcium = "";}

            if(aMagnesium < MANMINMG) {
                indexMagnesium = BELOWSTANDARD;
                assessmentMagnesium = MAGNESIUMLOW + MAGNESIUMLOWSYMPTOMS;
            } else if (aMagnesium > MANMAXMG) {
                indexMagnesium = ABOVESTANDARD;
                assessmentMagnesium = MAGNESIUMHIGH + MAGNESIUMHIGHSYMPTOMS;
            } else {indexMagnesium = STANDARD; assessmentMagnesium = "";}

            if(aPhosphorus < MANMINP) {
                indexPhosphorus = BELOWSTANDARD;
                assessmentPhosphorus = PHOSPHORUSLOW + PHOSPHORUSLOWSYMPTOMS;
            } else if(aPhosphorus > MANMAXP) {
                indexPhosphorus = ABOVESTANDARD;
                assessmentPhosphorus = PHOSPHORUSHIGH + PHOSPHORUSHIGHSYMPTOMS;
            } else {indexPhosphorus = STANDARD; assessmentPhosphorus = "";}

            if(aIron < MANMINFE) {
                indexIron = BELOWSTANDARD;
                assessmentIron = IRONLOW + IRONLOWSYMPTOMS;
            } else if(aIron > MANMAXFE) {
                indexIron = ABOVESTANDARD;
                assessmentIron = IRONHIGH + IRONHIGHSYMPTOMS;
            } else {indexIron = STANDARD; assessmentIron = "";}
        }
    }

    public String getIndexPotassium() {return indexPotassium;}
    public String getIndexSodium() {return indexSodium;}
    public String getIndexCalcium() {return indexCalcium;}
    public String getIndexMagnesium() {return indexMagnesium;}
    public String getIndexPhosphorus() {return indexPhosphorus;}
    public String getIndexIron() {return indexIron;}
    public String getAssessmentPotassium() {return assessmentPotassium;}
    public String getAssessmentSodium() {return assessmentSodium;}
    public String getAssessmentCalcium() {return assessmentCalcium;}
    public String getAssessmentMagnesium() {return assessmentMagnesium;}
    public String getAssessmentPhosphorus() {return assessmentPhosphorus;}
    public String getAssessmentIron() {return assessmentIron;}
}