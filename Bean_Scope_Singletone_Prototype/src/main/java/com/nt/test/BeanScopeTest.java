package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Employee;
import com.nt.beans.Printer;
import com.nt.beans.Student;



public class BeanScopeTest {

	public static void main(String[] args) {
		Student student1,student2=null;
		Employee employee1,employee2=null;
		Printer printer1,printer2=null;
		BeanFactory factory=null;
		//creating ioc container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//getting bean
		System.out.println("singletone student class");
		student1=factory.getBean("stud", Student.class);
		student2=factory.getBean("stud", Student.class);
		System.out.println(student1.hashCode()+" "+student2.hashCode());
		System.out.println("-----------------");
		System.out.println("prototype employee class");
		employee1=factory.getBean("emp", Employee.class);
		employee2=factory.getBean("emp",Employee.class);
		System.out.println(employee1.hashCode()+" "+employee2.hashCode());
		System.out.println("----------------------");
		System.out.println("singletone printer class with prototype scope");
		printer1=factory.getBean("pri", Printer.class);
		printer2=factory.getBean("pri",Printer.class);
		System.out.println(printer1.hashCode()+" "+printer2.hashCode());
	}

}
