/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.parser;

import com.platzhaltr.util.date.node.*;
import com.platzhaltr.util.date.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTNext(@SuppressWarnings("unused") TNext node)
    {
        this.index = 0;
    }

    @Override
    public void caseTMonday(@SuppressWarnings("unused") TMonday node)
    {
        this.index = 1;
    }

    @Override
    public void caseTTuesday(@SuppressWarnings("unused") TTuesday node)
    {
        this.index = 2;
    }

    @Override
    public void caseTWednesday(@SuppressWarnings("unused") TWednesday node)
    {
        this.index = 3;
    }

    @Override
    public void caseTThursday(@SuppressWarnings("unused") TThursday node)
    {
        this.index = 4;
    }

    @Override
    public void caseTFriday(@SuppressWarnings("unused") TFriday node)
    {
        this.index = 5;
    }

    @Override
    public void caseTSaturday(@SuppressWarnings("unused") TSaturday node)
    {
        this.index = 6;
    }

    @Override
    public void caseTSunday(@SuppressWarnings("unused") TSunday node)
    {
        this.index = 7;
    }

    @Override
    public void caseTEvening(@SuppressWarnings("unused") TEvening node)
    {
        this.index = 8;
    }

    @Override
    public void caseTWeekend(@SuppressWarnings("unused") TWeekend node)
    {
        this.index = 9;
    }

    @Override
    public void caseTWeek(@SuppressWarnings("unused") TWeek node)
    {
        this.index = 10;
    }

    @Override
    public void caseTMonth(@SuppressWarnings("unused") TMonth node)
    {
        this.index = 11;
    }

    @Override
    public void caseTYear(@SuppressWarnings("unused") TYear node)
    {
        this.index = 12;
    }

    @Override
    public void caseTEvery(@SuppressWarnings("unused") TEvery node)
    {
        this.index = 13;
    }

    @Override
    public void caseTJanuary(@SuppressWarnings("unused") TJanuary node)
    {
        this.index = 14;
    }

    @Override
    public void caseTFebruary(@SuppressWarnings("unused") TFebruary node)
    {
        this.index = 15;
    }

    @Override
    public void caseTMarch(@SuppressWarnings("unused") TMarch node)
    {
        this.index = 16;
    }

    @Override
    public void caseTApril(@SuppressWarnings("unused") TApril node)
    {
        this.index = 17;
    }

    @Override
    public void caseTMay(@SuppressWarnings("unused") TMay node)
    {
        this.index = 18;
    }

    @Override
    public void caseTJune(@SuppressWarnings("unused") TJune node)
    {
        this.index = 19;
    }

    @Override
    public void caseTJuly(@SuppressWarnings("unused") TJuly node)
    {
        this.index = 20;
    }

    @Override
    public void caseTAugust(@SuppressWarnings("unused") TAugust node)
    {
        this.index = 21;
    }

    @Override
    public void caseTSeptember(@SuppressWarnings("unused") TSeptember node)
    {
        this.index = 22;
    }

    @Override
    public void caseTOctober(@SuppressWarnings("unused") TOctober node)
    {
        this.index = 23;
    }

    @Override
    public void caseTNovember(@SuppressWarnings("unused") TNovember node)
    {
        this.index = 24;
    }

    @Override
    public void caseTDecember(@SuppressWarnings("unused") TDecember node)
    {
        this.index = 25;
    }

    @Override
    public void caseTDot(@SuppressWarnings("unused") TDot node)
    {
        this.index = 26;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 27;
    }

    @Override
    public void caseTOn(@SuppressWarnings("unused") TOn node)
    {
        this.index = 28;
    }

    @Override
    public void caseTIn(@SuppressWarnings("unused") TIn node)
    {
        this.index = 29;
    }

    @Override
    public void caseTAt(@SuppressWarnings("unused") TAt node)
    {
        this.index = 30;
    }

    @Override
    public void caseTOclock(@SuppressWarnings("unused") TOclock node)
    {
        this.index = 31;
    }

    @Override
    public void caseTSubject(@SuppressWarnings("unused") TSubject node)
    {
        this.index = 32;
    }

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 33;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 34;
    }
}
