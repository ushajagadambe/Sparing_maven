package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Doctor;
import com.nt.beans.Patient;



public class CollectionInjectTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		Doctor doctor=null;
		factory=new XmlBeanFactory(new ClassPathResource("s"));
		doctor=factory.getBean("doc", Doctor.class);
		System.out.println(doctor);
		
	}

}
