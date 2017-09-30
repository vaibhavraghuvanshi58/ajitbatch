package org.day6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);
		
		System.out.println(dt.getMonth());
		System.out.println(dt.getYear());
		System.out.println(dt.getTime());
		
		int tdate = dt.getDate();
		int tmonth = dt.getMonth()+1;
		int tyear = dt.getYear()+1900;
		System.out.println(tdate+"-"+tmonth+"-"+tyear);
		
		Date bday = new Date();
		bday.setDate(31);
		bday.setMonth(7);
		bday.setYear(90);
		System.out.println(bday);
		long bdaymilis = bday.getTime();
		long todaymilis = dt.getTime();
		long totalLivingMilis = todaymilis-bdaymilis;
		System.out.println(todaymilis);
		
		//https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-dd-MM");
		String fomrattedDate = format.format(dt);
		System.out.println(fomrattedDate);
		
	}
}
