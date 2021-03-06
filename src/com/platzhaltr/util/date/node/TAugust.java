/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.platzhaltr.util.date.node;

import com.platzhaltr.util.date.analysis.*;

@SuppressWarnings("nls")
public final class TAugust extends Token
{
    public TAugust(String text)
    {
        setText(text);
    }

    public TAugust(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAugust(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAugust(this);
    }
}
