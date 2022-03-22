package com.example.demo.queries;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.demo.data.Candidat;

public class findCommentaireByCandidatId {
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CandidatId", referencedColumnName = "CandidatId")
	private int candidat;





	
}
