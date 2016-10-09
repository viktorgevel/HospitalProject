package hospital.controller;

import hospital.nodataentity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @RequestMapping(value = "generalbloodanalysisforguest")
    public String generalBloodAnalysisForGuest(@RequestParam String aSexAge, @RequestParam int aHemoglobin,
                                               @RequestParam double aRedBloodCell, @RequestParam double aHematocrit,
                                               @RequestParam int aPlatelet, @RequestParam double aWhiteBloodCell,
                                               @RequestParam int aErythrocyteSedimentationRate, Model model) {
        GeneralBloodTestForGuest bloodTest = new GeneralBloodTestForGuest(aSexAge, aHemoglobin, aRedBloodCell,
                aHematocrit, aPlatelet, aWhiteBloodCell, aErythrocyteSedimentationRate);
        model.addAttribute("bloodTest", bloodTest);
        model.addAttribute("hemoglobin", MedicalConstant.HEMOGLOBIN);
        model.addAttribute("redBloodCell", MedicalConstant.REDBLOODCELL);
        model.addAttribute("hematocrit", MedicalConstant.HEMATOCRIT);
        model.addAttribute("platelet", MedicalConstant.PLATELED);
        model.addAttribute("whiteBloodCell", MedicalConstant.WHITEBLOODCELL);
        model.addAttribute("erythrocyteSedimentationRate", MedicalConstant.ERYTHROCYTESEDIMENTATIONRATE);
        return "generalbloodanalysisresultforguest";
    }

    @RequestMapping(value = "biochemicalbloodanalysisonenzymesforguest")
    public String biochemicalBloodAnalysisOnEnzymesForGuest(@RequestParam String aSexAge, @RequestParam double aAmylase,
                                                            @RequestParam double aLipase,
                                                            @RequestParam double aLactateDehydrogenase,
                                                            @RequestParam double aAlanineAminotransferase,
                                                            @RequestParam double aAspartateAminotransferase,
                                                            @RequestParam double aAlkalinePhosphatase,
                                                            Model model) {
        BiochemicalBloodTestEnzymesForGuest bloodTest = new BiochemicalBloodTestEnzymesForGuest(aSexAge, aAmylase,
                aLipase, aLactateDehydrogenase, aAlanineAminotransferase, aAspartateAminotransferase,
                aAlkalinePhosphatase);
        model.addAttribute("bloodTest", bloodTest);
        model.addAttribute("amylase", MedicalConstant.AMYLASE);
        model.addAttribute("lipase", MedicalConstant.LIPASE);
        model.addAttribute("lactateDehydrogenase", MedicalConstant.LACTATEDEHYDROGENASE);
        model.addAttribute("alanineAminotransferase", MedicalConstant.ALANINEAMINOTRANSFERASE);
        model.addAttribute("aspartateAminotransferase", MedicalConstant.ASPARTATEAMINOTRANSFERASE);
        model.addAttribute("alkalinePhosphatase", MedicalConstant.ALKALINEPHOSPHATASE);
        return "biochemicalbloodanalysisonenzymesforguest";
    }

    @RequestMapping(value = "biochemicalbloodanalysisonproteinsforguest")
    public String biochemicalBloodAnalysisOnProteinsForGuest (@RequestParam String aSexAge,
                                                              @RequestParam double aTotalProtein, double aAlbumin,
                                                              Model model) {
        BiochemicalBloodTestProteinsForGuest bloodTest = new BiochemicalBloodTestProteinsForGuest(aSexAge,
                aTotalProtein, aAlbumin);
        model.addAttribute("bloodTest", bloodTest);
        model.addAttribute("totalProtein", MedicalConstant.TOTALPROTEIN);
        model.addAttribute("albumin", MedicalConstant.ALBUMIN);
        return "biochemicalbloodanalysisonproteinsforguest";
    }

    @RequestMapping(value = "biochemicalbloodanalysisonlipidsforguest")
    public String biochemicalBloodAnalysisOnLipidsForGuest(@RequestParam String aSexAge,
                                                           @RequestParam double aCholesterol,
                                                           @RequestParam double aLowDensityLipoprotein,
                                                           @RequestParam double aHighDensityLipoprotein, Model model) {
        BiochemicalBloodTestLipidsForGuest bloodTest = new BiochemicalBloodTestLipidsForGuest(aSexAge, aCholesterol,
                aLowDensityLipoprotein, aHighDensityLipoprotein);
        model.addAttribute("bloodTest", bloodTest);
        model.addAttribute("cholesterol", MedicalConstant.CHOLESTEROL);
        model.addAttribute("lowDensityLipoprotein", MedicalConstant.LOWDENSITYLIPOPROTEIN);
        model.addAttribute("highDensityLipoprotein", MedicalConstant.HIGHDENSITYLIPOPROTEIN);
        return "biochemicalbloodanalysisonlipidsforguest";
    }

    @RequestMapping(value = "biochemicalbloodanalysisonmineralsforguest")
    public String biochemicalBloodAnalysisOnMineralsForGuest(@RequestParam String aSexAge,
                                                             @RequestParam double aPotassium,
                                                             @RequestParam double aSodium,
                                                             @RequestParam double aCalcium,
                                                             @RequestParam double aMagnesium,
                                                             @RequestParam double aPhosphorus,
                                                             @RequestParam double aIron, Model model) {
        BiochemicalBloodTestMineralsForGuest bloodTest = new BiochemicalBloodTestMineralsForGuest(aSexAge, aPotassium,
                aSodium, aCalcium, aMagnesium, aPhosphorus, aIron);

        model.addAttribute("bloodTest", bloodTest);
        model.addAttribute("potassium", MedicalConstant.POTASSIUM);
        model.addAttribute("sodium", MedicalConstant.SODIUM);
        model.addAttribute("calcium", MedicalConstant.CALCIUM);
        model.addAttribute("magnesium", MedicalConstant.MAGNESIUM);
        model.addAttribute("phosphorus", MedicalConstant.PHOSPHORUS);
        model.addAttribute("iron", MedicalConstant.IRON);

        return "biochemicalbloodanalysisonmineralsforguest";
    }


}