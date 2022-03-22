package com.example.demo.queries;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.demo.data.Candidat;

public class FindCommentaire {
private int commentaireId;

public int getCommentaireId() {
	return commentaireId;
}

public void setCommentaireId(int commentaireId) {
	this.commentaireId = commentaireId;
}

public FindCommentaire(int commentaireId) {
	super();
	this.commentaireId = commentaireId;
}



}
