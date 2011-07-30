package com.platzhaltr.util.date.result;

import java.util.Date;

/**
 * An event without the specification of a time.
 */
public interface Event {

	Date getStart();

	Date getEnd();
}
