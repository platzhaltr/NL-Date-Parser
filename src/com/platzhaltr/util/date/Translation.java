package com.platzhaltr.util.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.platzhaltr.util.WorkingdayConverter;
import com.platzhaltr.util.date.analysis.DepthFirstAdapter;
import com.platzhaltr.util.date.node.AAprilDate;
import com.platzhaltr.util.date.node.AAugustDate;
import com.platzhaltr.util.date.node.ADecemberDate;
import com.platzhaltr.util.date.node.AFebruaryDate;
import com.platzhaltr.util.date.node.AFridayRelative;
import com.platzhaltr.util.date.node.AJanuaryDate;
import com.platzhaltr.util.date.node.AJulyDate;
import com.platzhaltr.util.date.node.AJuneDate;
import com.platzhaltr.util.date.node.ALatinDate;
import com.platzhaltr.util.date.node.AMarchDate;
import com.platzhaltr.util.date.node.AMayDate;
import com.platzhaltr.util.date.node.AMondayRelative;
import com.platzhaltr.util.date.node.ANovemberDate;
import com.platzhaltr.util.date.node.AOctoberDate;
import com.platzhaltr.util.date.node.ASaturdayRelative;
import com.platzhaltr.util.date.node.ASeptemberDate;
import com.platzhaltr.util.date.node.ASundayRelative;
import com.platzhaltr.util.date.node.AThursdayRelative;
import com.platzhaltr.util.date.node.ATuesdayRelative;
import com.platzhaltr.util.date.node.AWednesdayRelative;
import com.platzhaltr.util.date.node.TNumber;

public class Translation extends DepthFirstAdapter {

	private GregorianCalendar cal = new GregorianCalendar();
	private Date result;

	@Override
	public void inALatinDate(ALatinDate node) {
		super.inALatinDate(node);

		List<TNumber> numbers = node.getNumber();

		int day = Integer.parseInt(numbers.get(0).toString().trim());
		int month = Integer.parseInt(numbers.get(1).toString().trim());

		int currentYear = cal.get(Calendar.YEAR);
		int year = currentYear;

		if (numbers.size() == 3) {
			year = Integer.parseInt(numbers.get(2).toString().trim());
		}

		month -= 1;

		result = WorkingdayConverter.createDate(day, month, year, currentYear);

	}

	@Override
	public void inAJanuaryDate(AJanuaryDate node) {
		super.inAJanuaryDate(node);
		result = getMonthDate(node.getNumber(), Calendar.JANUARY);
	}

	@Override
	public void inAFebruaryDate(AFebruaryDate node) {
		super.inAFebruaryDate(node);
		result = getMonthDate(node.getNumber(), Calendar.FEBRUARY);
	}

	@Override
	public void inAMarchDate(AMarchDate node) {
		super.inAMarchDate(node);
		result = getMonthDate(node.getNumber(), Calendar.MARCH);
	}

	@Override
	public void inAAprilDate(AAprilDate node) {
		super.inAAprilDate(node);
		result = getMonthDate(node.getNumber(), Calendar.APRIL);
	}

	@Override
	public void inAMayDate(AMayDate node) {
		super.inAMayDate(node);
		result = getMonthDate(node.getNumber(), Calendar.MAY);
	}

	@Override
	public void inAJuneDate(AJuneDate node) {
		super.inAJuneDate(node);
		result = getMonthDate(node.getNumber(), Calendar.JUNE);
	}

	@Override
	public void inAJulyDate(AJulyDate node) {
		super.inAJulyDate(node);
		result = getMonthDate(node.getNumber(), Calendar.JULY);
	}

	@Override
	public void inAAugustDate(AAugustDate node) {
		super.inAAugustDate(node);
		result = getMonthDate(node.getNumber(), Calendar.AUGUST);
	}

	@Override
	public void inASeptemberDate(ASeptemberDate node) {
		super.inASeptemberDate(node);
		result = getMonthDate(node.getNumber(), Calendar.SEPTEMBER);
	}

	@Override
	public void inAOctoberDate(AOctoberDate node) {
		super.inAOctoberDate(node);
		result = getMonthDate(node.getNumber(), Calendar.OCTOBER);
	}

	@Override
	public void inANovemberDate(ANovemberDate node) {
		super.inANovemberDate(node);
		result = getMonthDate(node.getNumber(), Calendar.NOVEMBER);
	}

	@Override
	public void inADecemberDate(ADecemberDate node) {
		super.inADecemberDate(node);
		result = getMonthDate(node.getNumber(), Calendar.DECEMBER);
	}

	private Date getMonthDate(final List<TNumber> numbers, final int month) {
		int day = Integer.parseInt(numbers.get(0).toString().trim());
		int currentYear = cal.get(Calendar.YEAR);
		int year = cal.get(Calendar.YEAR);

		if (numbers.size() == 2) {
			year = Integer.parseInt(numbers.get(1).toString().trim());
		}

		return WorkingdayConverter.createDate(day, month, year, currentYear);
	}

	@Override
	public void inAMondayRelative(AMondayRelative node) {
		super.inAMondayRelative(node);
		final int dayOfWeek = Calendar.MONDAY;
		result = WorkingdayConverter.createDate(dayOfWeek);
	}

	@Override
	public void inATuesdayRelative(ATuesdayRelative node) {
		super.inATuesdayRelative(node);
		final int dayOfWeek = Calendar.TUESDAY;
		result = WorkingdayConverter.createDate(dayOfWeek);
	}

	@Override
	public void inAWednesdayRelative(AWednesdayRelative node) {
		super.inAWednesdayRelative(node);
		final int dayOfWeek = Calendar.WEDNESDAY;
		result = WorkingdayConverter.createDate(dayOfWeek);
	}

	@Override
	public void inAThursdayRelative(AThursdayRelative node) {
		super.inAThursdayRelative(node);
		final int dayOfWeek = Calendar.THURSDAY;
		result = WorkingdayConverter.createDate(dayOfWeek);
	}

	@Override
	public void inAFridayRelative(AFridayRelative node) {
		super.inAFridayRelative(node);
		final int dayOfWeek = Calendar.FRIDAY;
		result = WorkingdayConverter.createDate(dayOfWeek);
	}

	@Override
	public void inASaturdayRelative(ASaturdayRelative node) {
		super.inASaturdayRelative(node);
		final int dayOfWeek = Calendar.SATURDAY;
		result = WorkingdayConverter.createDate(dayOfWeek);
	}

	@Override
	public void inASundayRelative(ASundayRelative node) {
		super.inASundayRelative(node);
		final int dayOfWeek = Calendar.SUNDAY;
		result = WorkingdayConverter.createDate(dayOfWeek);
	}

	public Date getResult() {
		return result;
	}

}
