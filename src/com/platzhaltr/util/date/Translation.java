package com.platzhaltr.util.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.platzhaltr.util.WorkingdayConverter;
import com.platzhaltr.util.date.analysis.DepthFirstAdapter;
import com.platzhaltr.util.date.node.AFridayRelative;
import com.platzhaltr.util.date.node.AJanuaryDate;
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

		int currentYear = cal.get( Calendar.YEAR );
		int year = currentYear;

		if ( numbers.size() == 3 ) {
			year = Integer.parseInt( numbers.get( 2 ).toString().trim() );
		}

		month -= 1;

		result = WorkingdayConverter.createDate( day, month, year, currentYear );

	}

	@Override
	public void inAJanuaryDate( AJanuaryDate node ) {
		super.inAJanuaryDate( node );

		List<TNumber> numbers = node.getNumber();

		int day = Integer.parseInt( numbers.get( 0 ).toString().trim() );
		int month = Calendar.JANUARY;

		int currentYear = cal.get( Calendar.YEAR );
		int year = cal.get( Calendar.YEAR );

		if ( numbers.size() == 2 ) {
			year = Integer.parseInt( numbers.get( 1 ).toString().trim() );
		}

		result = WorkingdayConverter.createDate( day, month, year, currentYear );
	}

	public Date getResult() {
		return result;
	}

}
