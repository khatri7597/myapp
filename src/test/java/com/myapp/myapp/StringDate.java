package com.myapp.myapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


class Dates implements Comparable<Dates>{
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(String date) throws ParseException {
		this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	public int compareTo(Dates o) {
		if(date.before(o.date)==true)
			return -1;
		else if(date.after(o.date)==true)
			return 1;
		else 
			return 0;
	}

}

public class StringDate {
	
	static String[] str = {"12/12/2019","12/12/2019","12/2/2019","12/1/2019","12/12/2018"};
	
	public static void main(String[] args) throws ParseException {
		List<Dates> dates = new ArrayList<Dates>();
		for(String c : str) {
			Dates date = new Dates();
			date.setDate(c);
			dates.add(date);			
		}
		Collections.sort(dates);
		for(Dates date : dates) {
			System.out.println(date.getDate());
		}
		
	}
	
}
