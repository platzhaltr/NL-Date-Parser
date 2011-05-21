/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.node;

import com.platzhaltr.util.date.analysis.*;

@SuppressWarnings("nls")
public final class TOclock extends Token
{
    public TOclock(String text)
    {
        setText(text);
    }

    public TOclock(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOclock(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOclock(this);
    }
}
