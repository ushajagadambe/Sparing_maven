package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.EngComp;
import com.nt.beans.EngElectronics;

public class CollectionMargingTest {
public static void main(String[] args) {
	//creating IOC Container
	BeanFactory factory=null;
	EngComp comp=null;
	EngElectronics electro=null;
	factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
	//getting engcomp bean by using collection marging as default-marge="true" in beans tag
	comp=factory.getBean("comp", EngComp.class);
	System.out.println("computer student subject list");
	System.out.println(comp);
	electro=factory.getBean("electro", EngElectronics.class);
	System.out.println("electronics student subject list");
	System.out.println(electro);
}
}
