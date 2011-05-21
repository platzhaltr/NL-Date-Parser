/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.node;

import com.platzhaltr.util.date.analysis.*;

@SuppressWarnings("nls")
public final class AWeekRelative extends PRelative
{
    private TWeek _week_;

    public AWeekRelative()
    {
        // Constructor
    }

    public AWeekRelative(
        @SuppressWarnings("hiding") TWeek _week_)
    {
        // Constructor
        setWeek(_week_);

    }

    @Override
    public Object clone()
    {
        return new AWeekRelative(
            cloneNode(this._week_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWeekRelative(this);
    }

    public TWeek getWeek()
    {
        return this._week_;
    }

    public void setWeek(TWeek node)
    {
        if(this._week_ != null)
        {
            this._week_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._week_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._week_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._week_ == child)
        {
            this._week_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._week_ == oldChild)
        {
            setWeek((TWeek) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
