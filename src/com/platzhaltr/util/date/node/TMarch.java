/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.node;

import com.platzhaltr.util.date.analysis.*;

@SuppressWarnings("nls")
public final class TMarch extends Token
{
    public TMarch(String text)
    {
        setText(text);
    }

    public TMarch(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMarch(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMarch(this);
    }
}