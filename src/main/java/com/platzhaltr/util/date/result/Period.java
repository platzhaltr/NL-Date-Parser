package com.platzhaltr.util.date.result;

import java.util.Date;

/**
 * A Period is an appointment in the calendar, which basicaly consists of two time specifications.
 */
public interface Period {

	Date getStart();

	Date getEnd();
}
