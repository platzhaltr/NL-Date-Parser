/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.analysis;

import com.platzhaltr.util.date.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseANextEntry(ANextEntry node);
    void caseARelativeEntry(ARelativeEntry node);
    void caseADateEntry(ADateEntry node);
    void caseARepeatingEntry(ARepeatingEntry node);
    void caseAMondayRelative(AMondayRelative node);
    void caseAThuesdayRelative(AThuesdayRelative node);
    void caseAWednesdayRelative(AWednesdayRelative node);
    void caseATuersdayRelative(ATuersdayRelative node);
    void caseAFridayRelative(AFridayRelative node);
    void caseASaturdayRelative(ASaturdayRelative node);
    void caseASundayRelative(ASundayRelative node);
    void caseAWeekendRelative(AWeekendRelative node);
    void caseAWeekRelative(AWeekRelative node);
    void caseAMonthRelative(AMonthRelative node);
    void caseAYearRelative(AYearRelative node);
    void caseALatinDate(ALatinDate node);
    void caseAJanuaryDate(AJanuaryDate node);
    void caseAFebruaryDate(AFebruaryDate node);
    void caseAMarchDate(AMarchDate node);
    void caseAAprilDate(AAprilDate node);
    void caseAMayDate(AMayDate node);
    void caseAJuneDate(AJuneDate node);
    void caseAJulyDate(AJulyDate node);
    void caseAAugustDate(AAugustDate node);
    void caseASeptemberDate(ASeptemberDate node);
    void caseAOctoberDate(AOctoberDate node);
    void caseANovemberDate(ANovemberDate node);
    void caseADecemberDate(ADecemberDate node);
    void caseAAbsoluteTime(AAbsoluteTime node);
    void caseAEveningTime(AEveningTime node);

    void caseTNext(TNext node);
    void caseTMonday(TMonday node);
    void caseTThuesday(TThuesday node);
    void caseTWednesday(TWednesday node);
    void caseTTuersday(TTuersday node);
    void caseTFriday(TFriday node);
    void caseTSaturday(TSaturday node);
    void caseTSunday(TSunday node);
    void caseTEvening(TEvening node);
    void caseTWeekend(TWeekend node);
    void caseTWeek(TWeek node);
    void caseTMonth(TMonth node);
    void caseTYear(TYear node);
    void caseTEvery(TEvery node);
    void caseTJanuary(TJanuary node);
    void caseTFebruary(TFebruary node);
    void caseTMarch(TMarch node);
    void caseTApril(TApril node);
    void caseTMay(TMay node);
    void caseTJune(TJune node);
    void caseTJuly(TJuly node);
    void caseTAugust(TAugust node);
    void caseTSeptember(TSeptember node);
    void caseTOctober(TOctober node);
    void caseTNovember(TNovember node);
    void caseTDecember(TDecember node);
    void caseTDot(TDot node);
    void caseTColon(TColon node);
    void caseTOn(TOn node);
    void caseTIn(TIn node);
    void caseTAt(TAt node);
    void caseTOclock(TOclock node);
    void caseTBlank(TBlank node);
    void caseTWord(TWord node);
    void caseTNumber(TNumber node);
    void caseEOF(EOF node);
}
