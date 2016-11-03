package ch.sebooom.domain.trackingObject;


import com.google.common.base.Preconditions;

import java.util.UUID;

public class TrackingObject {

	
	private String description;
	private String identification;
	private Position actualPosition;
	
	public static TrackingObject from(String description) {
		Preconditions.checkNotNull(description);
		return new TrackingObject(description);

	}

	public static TrackingObject from(String description, Position position) {
		Preconditions.checkNotNull(description);
		Preconditions.checkNotNull(position);
		return new TrackingObject(description);

	}

	private TrackingObject(String description){
		this.description = description;
		this.identification = UUID.randomUUID().toString();

	}

	private TrackingObject(String description, Position position){
		this.description = description;
		this.actualPosition = position;
		this.identification = UUID.randomUUID().toString();

	}

	public String identification() {
		return identification;
	}

	public String description () { return description; }

	public Position position() { return actualPosition;}




	
	
	
	
	
}
