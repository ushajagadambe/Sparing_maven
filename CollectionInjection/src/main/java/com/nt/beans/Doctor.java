package com.nt.beans;

import java.util.List;

public class Doctor {
	private List<Patient> patientlist;
	private int ward_no;
	public void setPatientlist(List<Patient> patientlist) {
		this.patientlist = patientlist;
	}
	public void setWard_no(int ward_no) {
		this.ward_no = ward_no;
	}
	@Override
	public String toString() {
		return "Doctor [patientlist=" + patientlist + ", ward_no=" + ward_no + "]";
	}
	
	

}
