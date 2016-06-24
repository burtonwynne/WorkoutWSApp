package com.codejock.scratchboard.ws;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codejock.scratchboard.ws.domain.Operation;
import com.codejock.scratchboard.ws.domain.Result;
import com.codejock.scratchboard.ws.domain.Workout;
import com.codejock.scratchboard.ws.domain.WorkoutResult;
import com.codejock.scratchboard.ws.jpa.WorkoutRepository;

import ch.qos.logback.access.pattern.RequestMethodConverter;
import io.undertow.attribute.RequestMethodAttribute;

@RestController
public class WorkoutController {
	
	@Autowired
	WorkoutRepository workoutRepository;
	
	@RequestMapping(value="/workout/create", method=RequestMethod.PUT, produces="application/json")
	public Result createWorkout(@RequestBody Workout workout){
		WorkoutResult result = getResult(Operation.CREATE);
		Date currentDate = getCurrentDate();
		workout.setCreationDate(currentDate);
		workout.setLastModifiedDate(currentDate);
		Workout createdWorkout = workoutRepository.saveAndFlush(workout);
		result.setSuccess(true);
		result.setEntity(createdWorkout);
		return result;
	}
	
	@RequestMapping(value="/workout/get/{id}", method=RequestMethod.GET, produces="application/json")
	public Result getWorkout(@PathVariable Long id){
		WorkoutResult result = getResult(Operation.READ);
		Workout foundWorkout = workoutRepository.findOne(id);
		if(foundWorkout == null){
			result.setSuccess(false);
			result.setErrorMessage("Could not find workout with id(" + id + ")");
		}else{
			result.setSuccess(true);
			result.setEntity(foundWorkout);
		}
		return result;
	}
	
	@RequestMapping(value="/workout/delete/{id}", method=RequestMethod.DELETE, produces="application/json")
	public Result deleteWorkout( @PathVariable Long id){
		WorkoutResult result = getResult(Operation.DELETE);
		Workout deletedWorkout = workoutRepository.findOne(id);
		if(deletedWorkout == null){
			result.setSuccess(false);
			result.setErrorMessage("Could not delete workout with id(" + id + ") because it could not be found");
			return result;
		}
		workoutRepository.delete(id);
		//result.setEntity(deletedWorkout);
		result.setSuccess(true);
		return result;
	}
	
	@RequestMapping(value="/workout/update", method=RequestMethod.POST, produces="application/json")
	public Result updateWorkout(@RequestBody Workout workout){
		WorkoutResult result = getResult(Operation.UPDATE);
		workout.setLastModifiedDate(getCurrentDate());
		Workout updatedWorkout = workoutRepository.saveAndFlush(workout);
		result.setSuccess(true);
		result.setEntity(updatedWorkout);
		return result;
	}
	
	private WorkoutResult getResult(Operation operation){
		WorkoutResult result = new WorkoutResult();
		result.setSuccess(false);
		result.setOperation(operation);
		
		return result;
		
	}
	private Date getCurrentDate(){
		return new Date();
	}
	

}
