package com.platzhaltr.util.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.platzhaltr.util.date.analysis.DepthFirstAdapter;
import com.platzhaltr.util.date.node.AFridayRelative;
import com.platzhaltr.util.date.node.ALatinDate;
import com.platzhaltr.util.date.node.AMondayRelative;
import com.platzhaltr.util.date.node.AMonthRelative;
import com.platzhaltr.util.date.node.ANextEntry;
import com.platzhaltr.util.date.node.AThuesdayRelative;
import com.platzhaltr.util.date.node.ATuersdayRelative;
import com.platzhaltr.util.date.node.AWednesdayRelative;
import com.platzhaltr.util.date.node.AWeekendRelative;
import com.platzhaltr.util.date.node.AYearRelative;
import com.platzhaltr.util.date.node.Node;
import com.platzhaltr.util.date.node.TNumber;

public class Translation extends DepthFirstAdapter {

	private GregorianCalendar cal = new GregorianCalendar();
	private Date result;

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

	@Override
	public void inALatinDate( ALatinDate node ) {
		super.inALatinDate( node );

		List<TNumber> numbers = node.getNumber();

		int day = Integer.parseInt( numbers.get( 0 ).toString().trim() );
		int month = Integer.parseInt( numbers.get( 1 ).toString().trim() );
		int year = cal.get( Calendar.YEAR );

		TNumber yearTNumber = numbers.size() == 3 ? numbers.get( 2 ) : null;

		if ( yearTNumber == null ) {
			if ( month < cal.get( Calendar.MONTH + 1 ) || day < cal.get( Calendar.DAY_OF_MONTH ) ) {
				year += 1;
			}
		} else {
			year = Integer.parseInt( yearTNumber.toString().trim() );
		}

		GregorianCalendar resultCal = new GregorianCalendar();
		resultCal.set( year, month - 1, day );

		result = resultCal.getTime();

	}

	public Date getResult() {
		return result;
	}

}
