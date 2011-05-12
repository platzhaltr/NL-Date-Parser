/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.node;

import java.util.*;
import com.platzhaltr.util.date.analysis.*;

@SuppressWarnings("nls")
public final class AMarchDate extends PDate
{
    private final LinkedList<TNumber> _number_ = new LinkedList<TNumber>();

    public AMarchDate()
    {
        // Constructor
    }

    public AMarchDate(
        @SuppressWarnings("hiding") List<TNumber> _number_)
    {
        // Constructor
        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new AMarchDate(
            cloneList(this._number_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMarchDate(this);
    }

    public LinkedList<TNumber> getNumber()
    {
        return this._number_;
    }

    public void setNumber(List<TNumber> list)
    {
        this._number_.clear();
        this._number_.addAll(list);
        for(TNumber e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._number_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._number_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<TNumber> i = this._number_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TNumber) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
