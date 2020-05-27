package com.example.demo.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig::static block)");
	}
	
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	@Bean()
public Calendar getCal()
{
Calendar	calendar=Calendar.getInstance();
	return calendar;
}
}
