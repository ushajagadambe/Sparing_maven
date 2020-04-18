package com.nt.beans;

import java.util.List;

public class EngComp {
private List<String> subject;

public void setSubject(List<String> subject) {
	this.subject = subject;
}

@Override
public String toString() {
	return "EngComp [subject=" + subject + "]";
}


}
