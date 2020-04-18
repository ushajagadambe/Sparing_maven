package com.nt.beans;

public class MountBike {
private int seatHeight;

public void setSeatHeight(int seatHeight) {
	this.seatHeight = seatHeight;
}

@Override
public String toString() {
	return "MountBike [seatHeight=" + seatHeight + "]";
}

public int getSeatHeight() {
	return seatHeight;
}

}
