package com.nt.beans;

public class TourAgent {
private TourPlane tourplane;
public void setTourplane(TourPlane tourplane)
{ this.tourplane = tourplane; }
 

public String touring()
{
	return tourplane.toString()+"visting fees 5000";
}

/*
 * public TourAgent(TourPlane tourplane) { super(); this.tourplane = tourplane;
 * }
 */


}
