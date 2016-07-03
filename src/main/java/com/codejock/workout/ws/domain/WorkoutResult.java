package com.codejock.scratchboard.ws.domain;

public class WorkoutResult implements Result {
	
	protected Workout entity;
	protected String errorMessage;
	protected Operation operation;
	protected boolean success = false;
	
	@Override
	public boolean wasSuccessfull() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void setSuccess(boolean success){
		
	}

	@Override
	public EntityInt getEntity() {
		// TODO Auto-generated method stub
		return entity;
	}
	
	public void setEntity(Workout workout){
		this.entity = workout;
	}

	@Override
	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	@Override
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

}
