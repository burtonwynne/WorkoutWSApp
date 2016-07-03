package com.codejock.workout.ws.domain;

public class ExerciseResult implements Result {
	
	protected Exercise entity;
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
	
	public void setEntity(Exercise exercise ){
		this.entity = exercise;
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
