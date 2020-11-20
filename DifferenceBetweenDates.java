package com.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DifferenceBetweenDates {
	public static int getDateDifference(String date1, String date2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(date1);
		Date d2 = sdf.parse(date2);
		Calendar cal = Calendar.getInstance();

		cal.setTime(d1);
		int months1 = cal.get(Calendar.MONTH);
		int year1 = cal.get(Calendar.YEAR);
		int date3 = cal.get(Calendar.DATE);
		cal.setTime(d2);
		int months2 = cal.get(Calendar.MONTH);
		int year2 = cal.get(Calendar.YEAR);
		int date4 = cal.get(Calendar.DATE);
		int n = ((year2 - year1) * 12) + (months2 - months1) + (date3 - date4);
		return n;

	}
}
