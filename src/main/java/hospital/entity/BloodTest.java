package hospital.entity;

import javax.persistence.Table;

/**
 * Клас для можливого більш детального аналізу крові
 */
@Table(name = "bloodtests")
public class BloodTest {

    //Chemistry Panel (or Metabolic Panel)
    int alanineAminotransferase;
    int albumin;
    int albuminGlobulinRatio;
    int alkalinePhosphatase;
    int aspartateAminotransferase;
    int bilirubin;
    int bloodUreaNitrogen;
    int creatinineRatio;
    int calcium;
    int chloride;
    int creatinine;
    int fastingGlucose;
    int phosphorus;
    int potassium;
    int sodium;

    //Lipid Panel (or Lipid Profile)
    int totalCholesterol;
    int triglycerides;
    int HDLCholesterol;
    int LDLCholesterol;
    int HDLRatio;

    //Complete Blood Count (CBC)
    int whiteBloodCellLeukocyteCount;
    int redBloodCellErythrocyteCount;
    int hematocrit;
    int hemoglobin;
    int meanCorpuscularVolume;
    int meanCorpuscularHemoglobin;
    int meanCorpuscularHemoglobinConcentration;
    int redCellDistributionWidth;
    int plateletCount;
    int meanPlateletVolume;

    //Additional Recommended Tests
    int thyroid;
    int vitaminD;

}
