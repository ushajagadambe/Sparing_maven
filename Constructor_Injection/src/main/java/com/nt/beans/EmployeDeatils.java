package com.nt.beans;


public class EmployeDeatils {
private int id;	
private String empname;
private EmpAddress empaddress;
private int age;

public EmployeDeatils(int id, String empname, EmpAddress empaddress, int age) {
	super();
	this.id = id;
	this.empname = empname;
	this.empaddress = empaddress;
	this.age = age;
}

@Override
public String toString() {
	return "EmployeDeatils [id=" + id + ", empname=" + empname + ", empaddress=" + empaddress + ", age=" + age + "]";
}


}
