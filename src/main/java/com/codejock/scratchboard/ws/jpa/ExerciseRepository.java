package com.codejock.scratchboard.ws.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.codejock.scratchboard.ws.domain.Exercise;

@RestResource(path="exercises", rel="exercise")
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
