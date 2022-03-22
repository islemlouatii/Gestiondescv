package com.example.demo.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatRepository extends JpaRepository<Candidat, Integer> {


	
	List<Candidat> findByFullName(String fullName);
	
	@Query("select candidat from Candidat candidat where candidat.etatc = :done")
	List<Candidat> getCandidatActif(@Param("done") EtatCandidat etatc);
	
	@Query("select candidat from Candidat candidat where candidat.etatc != :done")
	List<Candidat> getCandidatInActif(@Param("done") EtatCandidat etatc);
	
}