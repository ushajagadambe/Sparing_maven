package com.nt.beans;

public class Bicycle {
 int gear;
 int speed;
public void setGear(int gear) {
	this.gear = gear;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
@Override
public String toString() {
	return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
}
public int getGear() {
	return gear;
}
public int getSpeed() {
	return speed;
}
}
