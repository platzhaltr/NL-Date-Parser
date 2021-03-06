/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.node;

import com.platzhaltr.util.date.analysis.*;

@SuppressWarnings("nls")
public final class TNovember extends Token
{
    public TNovember(String text)
    {
        setText(text);
    }

    public TNovember(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNovember(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNovember(this);
    }
}
