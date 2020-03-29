package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.StudentController.MainController;
import com.nt.StudentVO.StudentVO;
import com.nt.studentDAO.StudentDAOImpl;

public class Test {
public static void main(String[] args) {
	String result=null;

	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("ApplicationCpntext.xml"));
	MainController controller=factory.getBean(MainController.class);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sno");
	String sno=sc.next();
	System.out.println("enter the sname");
	String sname=sc.next();
	System.out.println("enter the saddress");
	String sadd=sc.next();
	System.out.println("enter the mark1");
	String m1=sc.next();
	System.out.println("enter the mark2");
	String m2=sc.next();
	System.out.println("enter the mark3");
	String m3=sc.next();
	StudentVO studentvo=new StudentVO();
	studentvo.setSno(sno);
	studentvo.setSname(sname);
	studentvo.setSadd(sadd);
	studentvo.setM1(m1);
	studentvo.setM2(m2);
	studentvo.setM3(m3);
	try
	{
		result=controller.Handle(studentvo);
		System.out.println("result="+result);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
