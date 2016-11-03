package ch.sebooom.domain.trackingObject;

import java.util.Date;

public class Position {
	private double lat;
	private double lng;
	private Date datePosition;

	
	public double lat(){
		return this.lat;
	}
	
	public double lng(){
		return this.lng;
	}
	
	public Date datePosition(){
		return datePosition;
	}
	

	
	
	public Position(double lat, double lng, Date datePosition) {
		this.lat = lat;
		this.lng = lng;
		this.datePosition = datePosition;

	}
	




	
}