package com.codejock.workout.ws.domain;

public interface Result {
	public boolean wasSuccessfull();
	public EntityInt getEntity();
	public Operation getOperation();
	public String getErrorMessage();
	
}
