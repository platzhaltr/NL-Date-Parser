/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.node;

import com.platzhaltr.util.date.analysis.*;

@SuppressWarnings("nls")
public final class ATuersdayRelative extends PRelative
{
    private TTuersday _tuersday_;

    public ATuersdayRelative()
    {
        // Constructor
    }

    public ATuersdayRelative(
        @SuppressWarnings("hiding") TTuersday _tuersday_)
    {
        // Constructor
        setTuersday(_tuersday_);

    }

    @Override
    public Object clone()
    {
        return new ATuersdayRelative(
            cloneNode(this._tuersday_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATuersdayRelative(this);
    }

    public TTuersday getTuersday()
    {
        return this._tuersday_;
    }

    public void setTuersday(TTuersday node)
    {
        if(this._tuersday_ != null)
        {
            this._tuersday_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tuersday_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tuersday_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tuersday_ == child)
        {
            this._tuersday_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tuersday_ == oldChild)
        {
            setTuersday((TTuersday) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
