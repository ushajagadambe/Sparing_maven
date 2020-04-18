package com.nt.beans;

public class EmpAddress {
private int laneNo;
private String streetname;
private String area;
private int pincode;
public EmpAddress(int laneNo, String streetname, String area, int pincode) {
	this.laneNo = laneNo;
	this.streetname = streetname;
	this.area = area;
	this.pincode = pincode;
}

@Override
public String toString() {
	return "EmpAddress [laneNo=" + laneNo + ", streetname=" + streetname + ", area=" + area + ", pincode=" + pincode
			+ "]";
}

}
