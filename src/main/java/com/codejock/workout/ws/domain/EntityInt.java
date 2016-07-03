package com.codejock.workout.ws.domain;

public interface EntityInt {
	public enum EntityType{
		WORKOUT, EXERCISE, VIDEO
	};
	
	public EntityStatus getStatus();
	public void setStatus(EntityStatus status);
}
