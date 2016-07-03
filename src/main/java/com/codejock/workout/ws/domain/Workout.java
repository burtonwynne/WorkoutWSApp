package com.codejock.workout.ws.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;



@Entity
public class Workout extends BaseEntity{
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		      name="workout_exercises",
		      joinColumns=@JoinColumn(name="workout_id", referencedColumnName="id"),
		      inverseJoinColumns=@JoinColumn(name="exercise_id", referencedColumnName="id"))
	protected List<Exercise> exercises;

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}
	
	
}
