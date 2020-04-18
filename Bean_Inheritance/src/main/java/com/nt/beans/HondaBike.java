package com.nt.beans;

public class HondaBike {
	private int seatHeight;

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return "HondaBike [seatHeight=" + seatHeight + "]";
	}

	public int getSeatHeight() {
		return seatHeight;
	}
}
