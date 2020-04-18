package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.EmployeDeatils;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		EmployeDeatils empdetails=null;
		BeanFactory factory;
		//creating ioc container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//getting bean
		empdetails=factory.getBean("empdt", EmployeDeatils.class);
		System.out.println(empdetails);

	}

}
