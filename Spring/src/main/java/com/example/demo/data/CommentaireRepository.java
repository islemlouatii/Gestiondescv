package com.example.demo.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Integer>{
	@Query("select c from Commentaire c where c.candidat.CandidatId=:CandidatId")
	List<Commentaire> findCommentaireByCandidatId(@Param("CandidatId") int CandidatId);
}