package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.TourAgent;

public class AutowriedTest {
public static void main(String[] args) {
	
	BeanFactory factory=null;
	TourAgent touragent=null;
	factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
	touragent=factory.getBean("ta",TourAgent.class);
	String result=touragent.touring();
	System.out.println(result);
}
}
