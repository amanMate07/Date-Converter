package com.car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	
	public static void main(String args[]) throws ParseException
	{
		//Date Format For Year-Month-Day
		SimpleDateFormat timeDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		//Date Format for Month/day/year hour-min-sec
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		Date date=new Date();
		
		String convertedDate1=timeDateFormat.format(date);
		
		Date convertedDate2=timeDateFormat.parse(convertedDate1);
		
		String convertedDate3=simpleDateFormat.format(date);
		
		Date convertedDate4=simpleDateFormat.parse(convertedDate3);
		/*
		 * Output1
		2020-10-26
		
		Output 2
		Mon Oct 26 00:00:00 IST 2020
		
		Output 3
		10/26/2020 18:26:34
		
		Output 4
		Mon Oct 26 18:26:34 IST 2020
		
		*/

	}

}
