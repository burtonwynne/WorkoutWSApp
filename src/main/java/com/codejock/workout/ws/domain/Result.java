package com.codejock.scratchboard.ws.domain;

public interface Result {
	public boolean wasSuccessfull();
	public EntityInt getEntity();
	public Operation getOperation();
	public String getErrorMessage();
	
}
