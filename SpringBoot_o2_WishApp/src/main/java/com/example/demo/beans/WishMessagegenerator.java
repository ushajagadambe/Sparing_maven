package com.example.demo.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmsg")
public class WishMessagegenerator {
	@Autowired
private Calendar calendar;

	public WishMessagegenerator() {
		System.out.println("wishmessagegenerator constructor");
	}

	public String GetWishMessage(String user)
	{
		int hour=0;
		   hour=calendar.get(Calendar.HOUR_OF_DAY);
		   if(hour<12)
			   return "Good Morning::"+user;
		   else if(hour<16)
			   return "Good AfterNoon::"+user;
		   else if(hour<20)
			   return "Good Evening :;"+user;
		   else 
			   return "Good Night ::"+user;
	
		
	}
}
