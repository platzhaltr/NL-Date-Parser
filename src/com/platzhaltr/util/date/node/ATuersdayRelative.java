/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.node;

import com.platzhaltr.util.date.analysis.*;

@SuppressWarnings("nls")
public final class ATuersdayRelative extends PRelative
{

    public ATuersdayRelative()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new ATuersdayRelative();
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATuersdayRelative(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
