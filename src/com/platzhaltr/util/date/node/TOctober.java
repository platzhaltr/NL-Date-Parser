/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.node;

import com.platzhaltr.util.date.analysis.*;

@SuppressWarnings("nls")
public final class TOctober extends Token
{
    public TOctober(String text)
    {
        setText(text);
    }

    public TOctober(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOctober(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOctober(this);
    }
}
