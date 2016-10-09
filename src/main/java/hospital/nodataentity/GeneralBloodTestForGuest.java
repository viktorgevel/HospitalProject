package hospital.nodataentity;

import static hospital.nodataentity.MedicalConstant.*;
import static hospital.nodataentity.MedicalAdvice.*;

public class GeneralBloodTestForGuest {
    private String indexHemoglobin;
    private String indexRedBloodCell;
    private String indexHematocrit;
    private String indexPlatelet;
    private String indexWhiteBloodCell;
    private String indexErythrocyteSedimentationRate;

    private String assessmentHemoglobin;
    private String assessmentRedBloodCell;
    private String assessmentHematocrit;
    private String assessmentPlatelet;
    private String assessmentWhiteBloodCell;
    private String assessmentErythrocyteSedimentationRate;

    public GeneralBloodTestForGuest(String aSexAge, int aHemoglobin, double aRedBloodCell, double aHematocrit,
                                    int aPlatelet, double aWhiteBloodCell, int aErythrocyteSedimentationRate) {
        if (aSexAge.equals("новонароджений")) {
            if(aHemoglobin < NEWBORNMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > NEWBORNMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < NEWBORNMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > NEWBORNMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < NEWBORNMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > NEWBORNMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < NEWBORNMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW + PLATELEDLOWCHILD;
            } else if (aPlatelet > NEWBORNMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < NEWBORNMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > NEWBORNMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < NEWBORNMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOWFORNEWBORN+ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > NEWBORNMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("від 0 до 7 днів")) {
            if(aHemoglobin < CHILDTO7DAYSMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > CHILDTO7DAYSMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < CHILDTO7DAYSMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > CHILDTO7DAYSMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < CHILDTO7DAYSMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > CHILDTO7DAYSMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < CHILDTO7DAYSMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW + PLATELEDLOWCHILD;
            } else if (aPlatelet > CHILDTO7DAYSMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < CHILDTO7DAYSMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > CHILDTO7DAYSMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < CHILDTO7DAYSMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > CHILDTO7DAYSMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("від 7 до 30 днів")) {
            if(aHemoglobin < CHILDTO30DAYSMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > CHILDTO30DAYSMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < CHILDTO30DAYSMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > CHILDTO30DAYSMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < CHILDTO30DAYSMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > CHILDTO30DAYSMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < CHILDTO30DAYSMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW + PLATELEDLOWCHILD;
            } else if (aPlatelet > CHILDTO30DAYSMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < CHILDTO30DAYSMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > CHILDTO30DAYSMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < CHILDTO30DAYSMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > CHILDTO30DAYSMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("від 1 до 6 місяців")) {
            if(aHemoglobin < CHILDTO6MONTHMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > CHILDTO6MONTHMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < CHILDTO6MONTHMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > CHILDTO6MONTHMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < CHILDTO6MONTHMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > CHILDTO6MONTHMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < CHILDTO6MONTHMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW;
            } else if (aPlatelet > CHILDTO6MONTHMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < CHILDTO6MONTHMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > CHILDTO6MONTHMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < CHILDTO6MONTHMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > CHILDTO6MONTHMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("від 6 до 12 місяців")) {
            if(aHemoglobin < CHILDTO1YEARMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > CHILDTO1YEARMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < CHILDTO1YEARMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > CHILDTO1YEARMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < CHILDTO1YEARMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > CHILDTO1YEARMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < CHILDTO1YEARMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW;
            } else if (aPlatelet > CHILDTO1YEARMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < CHILDTO1YEARMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > CHILDTO1YEARMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < CHILDTO1YEARMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > CHILDTO1YEARMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("від 1 до 2 років")) {
            if(aHemoglobin < CHILDTO2YEARMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > CHILDTO2YEARMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < CHILDTO2YEARMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > CHILDTO2YEARMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < CHILDTO2YEARMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > CHILDTO2YEARMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < CHILDTO2YEARMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW;
            } else if (aPlatelet > CHILDTO2YEARMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < CHILDTO2YEARMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > CHILDTO2YEARMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < CHILDTO2YEARMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > CHILDTO2YEARMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("від 2 до 3 років")) {
            if(aHemoglobin < CHILDTO3YEARMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > CHILDTO3YEARMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < CHILDTO3YEARMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > CHILDTO3YEARMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < CHILDTO3YEARMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > CHILDTO3YEARMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < CHILDTO3YEARMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW;
            } else if (aPlatelet > CHILDTO3YEARMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < CHILDTO3YEARMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > CHILDTO3YEARMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < CHILDTO3YEARMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > CHILDTO3YEARMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("від 3 до 6 років")) {
            if(aHemoglobin < CHILDTO6YEARMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > CHILDTO6YEARMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < CHILDTO6YEARMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > CHILDTO6YEARMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < CHILDTO6YEARMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > CHILDTO6YEARMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < CHILDTO6YEARMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW;
            } else if (aPlatelet > CHILDTO6YEARMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < CHILDTO6YEARMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > CHILDTO6YEARMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < CHILDTO6YEARMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > CHILDTO6YEARMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("від 6 до 9 років")) {
            if(aHemoglobin < CHILDTO9YEARMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > CHILDTO9YEARMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < CHILDTO9YEARMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > CHILDTO9YEARMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < CHILDTO9YEARMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > CHILDTO9YEARMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < CHILDTO9YEARMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW;
            } else if (aPlatelet > CHILDTO9YEARMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < CHILDTO9YEARMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > CHILDTO9YEARMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < CHILDTO9YEARMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > CHILDTO9YEARMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("від 9 до 12 років")) {
            if(aHemoglobin < CHILDTO12YEARMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > CHILDTO12YEARMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < CHILDTO12YEARMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > CHILDTO12YEARMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < CHILDTO12YEARMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > CHILDTO12YEARMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < CHILDTO12YEARMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW;
            } else if (aPlatelet > CHILDTO12YEARMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < CHILDTO12YEARMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > CHILDTO12YEARMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < CHILDTO12YEARMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > CHILDTO12YEARMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("жінка")) {
            if(aHemoglobin < WOMANMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > WOMANMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < WOMANMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > WOMANMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < WOMANMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW.concat(HEMATOCRITLOWWOMAN);
            } else if (aHematocrit > WOMANMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < WOMANMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW;
            } else if (aPlatelet > WOMANMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < WOMANMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > WOMANMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH.concat(WHITEBLOODCELLHIGHWOMAN);
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < WOMANMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > WOMANMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH.concat(ERYTHROCYTESEDIMENTATIONRATEHIGHWOMAN);
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }


        if(aSexAge.equals("чоловік")) {
            if(aHemoglobin < MANMINHGB) {
                indexHemoglobin = BELOWSTANDARD;
                assessmentHemoglobin = HEMOGLOBINLOW;
            } else if (aHemoglobin > MANMAXHGB) {
                indexHemoglobin = ABOVESTANDARD;
                assessmentHemoglobin = HEMOGLOBINHIGH;
            } else {indexHemoglobin = STANDARD; assessmentHemoglobin = "";}

            if (aRedBloodCell < MANMINRBC) {
                indexRedBloodCell = BELOWSTANDARD;
                assessmentRedBloodCell = REDBLOODCELLLOW;
            } else if (aRedBloodCell > MANMAXRBC) {
                indexRedBloodCell = ABOVESTANDARD;
                assessmentRedBloodCell = REDBLOODCELLHIGH;
            } else {indexRedBloodCell = STANDARD; assessmentRedBloodCell = "";}

            if(aHematocrit < MANMINHCT) {
                indexHematocrit = BELOWSTANDARD;
                assessmentHematocrit = HEMATOCRITLOW;
            } else if (aHematocrit > MANMAXHCT) {
                indexHematocrit = ABOVESTANDARD;
                assessmentHematocrit = HEMATOCRITHIGH;
            } else {indexHematocrit = STANDARD; assessmentHematocrit = "";}

            if(aPlatelet < MANMINPLT) {
                indexPlatelet = BELOWSTANDARD;
                assessmentPlatelet = PLATELEDLOW;
            } else if (aPlatelet > MANMAXPLT) {
                indexPlatelet = ABOVESTANDARD;
                assessmentPlatelet = PLATELEDHIGH;
            } else {indexPlatelet = STANDARD; assessmentPlatelet = "";}

            if(aWhiteBloodCell < MANMINWBC) {
                indexWhiteBloodCell = BELOWSTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLLOW;
            } else if (aWhiteBloodCell > MANMAXWBC) {
                indexWhiteBloodCell = ABOVESTANDARD;
                assessmentWhiteBloodCell = WHITEBLOODCELLHIGH;
            } else {indexWhiteBloodCell = STANDARD; assessmentWhiteBloodCell = "";}

            if(aErythrocyteSedimentationRate < MANMINESR) {
                indexErythrocyteSedimentationRate = BELOWSTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATELOW;
            } else if(aErythrocyteSedimentationRate > MANMAXESR) {
                indexErythrocyteSedimentationRate = ABOVESTANDARD;
                assessmentErythrocyteSedimentationRate = ERYTHROCYTESEDIMENTATIONRATEHIGH;
            } else {indexErythrocyteSedimentationRate = STANDARD; assessmentErythrocyteSedimentationRate = "";}
        }
    }

    public String getIndexHemoglobin() {return indexHemoglobin;}
    public String getIndexRedBloodCell() {return indexRedBloodCell;}
    public String getIndexHematocrit() {return indexHematocrit;}
    public String getIndexPlatelet() {return indexPlatelet;}
    public String getIndexWhiteBloodCell() {return indexWhiteBloodCell;}
    public String getIndexErythrocyteSedimentationRate() {return indexErythrocyteSedimentationRate;}
    public String getAssessmentHemoglobin() {return assessmentHemoglobin;}
    public String getAssessmentRedBloodCell() {return assessmentRedBloodCell;}
    public String getAssessmentHematocrit() {return assessmentHematocrit;}
    public String getAssessmentPlatelet() {return assessmentPlatelet;}
    public String getAssessmentWhiteBloodCell() {return assessmentWhiteBloodCell;}
    public String getAssessmentErythrocyteSedimentationRate() {return assessmentErythrocyteSedimentationRate;}


}
