package com.codejock.scratchboard.ws;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codejock.scratchboard.ws.domain.EntityStatus;
import com.codejock.scratchboard.ws.domain.Workout;
import com.codejock.scratchboard.ws.jpa.WorkoutRepository;

@SpringBootApplication
public class SpringWebServiceScratchBoardApplication {
	@Autowired
	WorkoutRepository workoutRepository;
	
	@PostConstruct
	public void init() {
		if(workoutRepository.count() == 0){
			Workout workout = new Workout();
		    workout.setCreationDate(new Date());
		    workout.setDescription("Test Workout");
		    workout.setLastModifiedDate(new Date());
		    workout.setName("Test workout");
		    workout.setStatus(EntityStatus.ACTIVE);
		    workoutRepository.saveAndFlush(workout);
		    
		}
	  }    
	public static void main(String[] args) {
		SpringApplication.run(SpringWebServiceScratchBoardApplication.class, args);
	}
}
