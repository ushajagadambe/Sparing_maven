package com.nt.beans;

public class Printer {
public static Printer INSTANCE;
public static Printer getInstance()
{
	if(INSTANCE==null)
		INSTANCE=new Printer();

	return INSTANCE;
	}

}
