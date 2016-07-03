package com.codejock.workout.ws.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.codejock.workout.ws.domain.Workout;



@RestResource(path="workouts", rel="workout")
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}
