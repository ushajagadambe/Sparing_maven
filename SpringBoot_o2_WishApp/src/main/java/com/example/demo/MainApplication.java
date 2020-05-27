package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.beans.WishMessagegenerator;

@SpringBootApplication
public class MainApplication {
public static void main(String[] args) {
	ApplicationContext actx=null;WishMessagegenerator wishapp=null;
actx=	SpringApplication.run(MainApplication.class, args);
wishapp=actx.getBean("wmsg",WishMessagegenerator.class);
String res=wishapp.GetWishMessage("raja");
System.out.println(res);

}
}
