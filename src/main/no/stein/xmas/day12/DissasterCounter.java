package no.stein.xmas.day12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.joda.time.DateTime;

import com.google.common.collect.Lists;

public class DissasterCounter {

	public static void main(String[] args) {
//		System.out.println("Gregorian count: " + gregorianCount());
		System.out.println("Joda Time count: " + jodaTimeCount());
//		System.out.println("Julian time count: " + julianTimeCount());
	}

	public static int jodaTimeCount() {
		List<DateTime> dissasters = Lists.newArrayList();
		DateFormat dateFormat = new SimpleDateFormat("E dd.MMM.yyyy");
		DateTime date = new DateTime(1337, 1, 1, 1, 1);
		for (int year = 1337; year < 2015; year++) {
			for (int month = 1; month < 13; month++) {
				date = new DateTime(year, month, 13, 1,1);
				if (date.getDayOfWeek() == 5  && date.getDayOfMonth() == 13) {
					dissasters.add(date);
					if (year > 1580 && year < 1585) {
						System.out.println("Year:" + year + ", month:" + month + ", day:" + 13);
						System.out.println(date.toString("E dd.MMM.yyyy"));
					}
				}
			}
		}
		return dissasters.size();
	}

	public static int gregorianCount() {
		List<Date> dissasters = Lists.newArrayList();
		DateFormat dateFormat = new SimpleDateFormat("E dd.MMM.yyyy");
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, 1337);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 1);
		for (int year = 1337; year < 2015; year++) {
			for (int month = 0; month < 12; month++) {
				cal.set(Calendar.YEAR, year);
				cal.set(Calendar.MONTH, month);
				cal.set(Calendar.DATE, 13);
				if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY
						&& cal.get(Calendar.DATE) == 13) {
					// System.out.println(dateFormat.format(cal.getTime()));
					dissasters.add(cal.getTime());
				}
			}
		}
		// System.out.println(dissasters.size());
		return dissasters.size();
	}
	public static int julianCount() {
		List<Date> dissasters = Lists.newArrayList();
		DateFormat dateFormat = new SimpleDateFormat("E dd.MMM.yyyy");
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, 1337);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 1);
		for (int year = 1337; year < 2015; year++) {
			for (int month = 0; month < 12; month++) {
				cal.set(Calendar.YEAR, year);
				cal.set(Calendar.MONTH, month);
				cal.set(Calendar.DATE, 13);
				if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY
						&& cal.get(Calendar.DATE) == 13) {
					// System.out.println(dateFormat.format(cal.getTime()));
					dissasters.add(cal.getTime());
				}
			}
		}
		// System.out.println(dissasters.size());
		return dissasters.size();
	}
}
