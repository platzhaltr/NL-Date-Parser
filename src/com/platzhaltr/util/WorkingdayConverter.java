package com.platzhaltr.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class WorkingdayConverter {

	public static long getDateByWorkingday(String workingday) {

		if (workingday == null || workingday.isEmpty()) {
			return 0;
		}

		return 0;
	}

	public static Date createDate(int dayOfWeek) {
		GregorianCalendar cal = new GregorianCalendar();
		int currentDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		if (dayOfWeek == currentDayOfWeek) {
			cal.add(Calendar.DAY_OF_WEEK, 7);
		} else {
			cal.add(Calendar.DAY_OF_WEEK,
					(7 + (dayOfWeek - currentDayOfWeek)) % 7);
		}

		return cal.getTime();
	}

	public static Date createDate(int day, int month, int year, int currentYear) {
		GregorianCalendar cal = new GregorianCalendar();

		if (year == currentYear) {
			if (month < cal.get(Calendar.MONTH)
					|| (month == cal.get(Calendar.MONTH))
					&& (day < cal.get(Calendar.DAY_OF_MONTH))) {
				year += 1;
			}
		}

		GregorianCalendar resultCal = new GregorianCalendar();
		resultCal.set(year, month, day);

		return resultCal.getTime();
	}
}
