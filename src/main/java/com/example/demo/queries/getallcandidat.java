package com.example.demo.queries;

import java.util.Date;

import javax.persistence.OneToOne;

import com.example.demo.data.Commentaire;
import com.example.demo.data.Mission;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class getallcandidat {
	private int CandidatId;
	private String fullName;
	private Date date;
	private String Adresse;
	private int tel;
	@OneToOne(mappedBy = "candidat")
	@JsonIgnore
	private Mission mission;
	@OneToOne(mappedBy = "candidat")
	@JsonIgnore
	private Commentaire commentaire;
	public int getCandidatId() {
		return CandidatId;
	}
	public void setCandidatId(int candidatId) {
		CandidatId = candidatId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Mission getMission() {
		return mission;
	}
	public void setMission(Mission mission) {
		this.mission = mission;
	}
	public Commentaire getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}
	public getallcandidat( String fullName, Date date, String adresse, int tel, Mission mission,
			Commentaire commentaire) {
		super();
		
		this.fullName = fullName;
		this.date = date;
		Adresse = adresse;
		this.tel = tel;
		this.mission = mission;
		this.commentaire = commentaire;
	}
	public getallcandidat() {
		// TODO Auto-generated constructor stub
	}
	
}
