package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Cricketer;




public class InnerBeanTest {

	public static void main(String[] args) {
		Cricketer cricketer=null;
		BeanFactory factory=null;
		//creating ioc container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//getting bean
		cricketer=factory.getBean("cricketer", Cricketer.class);
		String result=cricketer.BattingScroe();
		System.out.println(result);
	}

}
