package com.nt.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.HondaBike;
import com.nt.beans.MountBike;




public class BeanInheritanceTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		HondaBike hondabike=null;
		MountBike mountbike=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
hondabike=factory.getBean("hon", HondaBike.class);
System.out.println(hondabike);
mountbike=factory.getBean("mon", MountBike.class);
		System.out.println(mountbike);
	}

}
