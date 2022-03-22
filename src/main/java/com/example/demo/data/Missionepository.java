package com.example.demo.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Missionepository extends JpaRepository<Mission, Integer> {
	@Query("select mission from Mission mission where mission.etat = :TERMINE")
	List<Mission> getMissionTermine(@Param("TERMINE") Etat etat);
	
	@Query("select mission from Mission mission where mission.etat = :EN_COUR")
	List<Mission> getMissionEnCour(@Param("EN_COUR") Etat etat);
	
	@Query("select mission from Mission mission where mission.etat = :NON_AFFECTE")
	List<Mission> getMissionNonAffecte(@Param("NON_AFFECTE") Etat etat);
}
