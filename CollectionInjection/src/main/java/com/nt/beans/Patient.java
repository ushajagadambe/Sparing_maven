package com.nt.beans;

public class Patient {
private String name;
private int age;
private String date_of_admit;
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setDate_of_admit(String date_of_admit) {
	this.date_of_admit = date_of_admit;
}
@Override
public String toString() {
	return "Patient [name=" + name + ", age=" + age + ", date_of_admit=" + date_of_admit + "]";
}
}
