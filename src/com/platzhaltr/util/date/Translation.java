package com.platzhaltr.util.date;

import java.util.GregorianCalendar;

import com.platzhaltr.util.date.analysis.DepthFirstAdapter;
import com.platzhaltr.util.date.node.AFridayRelative;
import com.platzhaltr.util.date.node.AMondayRelative;
import com.platzhaltr.util.date.node.AMonthRelative;
import com.platzhaltr.util.date.node.ANextEntry;
import com.platzhaltr.util.date.node.AThuesdayRelative;
import com.platzhaltr.util.date.node.ATuersdayRelative;
import com.platzhaltr.util.date.node.AWednesdayRelative;
import com.platzhaltr.util.date.node.AWeekendRelative;
import com.platzhaltr.util.date.node.AYearRelative;
import com.platzhaltr.util.date.node.Node;

public class Translation extends DepthFirstAdapter {

	private GregorianCalendar cal = new GregorianCalendar();

	@Override
	public void inANextEntry( ANextEntry node ) {
		// TODO Auto-generated method stub
		super.inANextEntry( node );

		Node nextNode = node.getRelative();

		if ( nextNode instanceof AMondayRelative ) {

		} else if ( nextNode instanceof AThuesdayRelative ) {

		} else if ( nextNode instanceof AWednesdayRelative ) {

		} else if ( nextNode instanceof ATuersdayRelative ) {

		} else if ( nextNode instanceof AFridayRelative ) {

		} else if ( nextNode instanceof AWeekendRelative ) {

		} else if ( nextNode instanceof AMonthRelative ) {

		} else if ( nextNode instanceof AYearRelative ) {

		}
	}

}
