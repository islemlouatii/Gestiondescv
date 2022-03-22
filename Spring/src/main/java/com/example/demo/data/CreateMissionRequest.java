package com.example.demo.data;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
public class CreateMissionRequest {
	private int missionId;
	private String description;
	private Date datedebut;
	private Date datefin;
	@Enumerated(EnumType.STRING)
	private Etat etat;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CandidatId", referencedColumnName = "CandidatId")
	private Candidat candidat;
	
	public CreateMissionRequest(int missionId, String description, Date datedebut, Date datefin, Etat etat,
			Candidat candidat) {
		super();
		this.missionId = missionId;
		this.description = description;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.etat = etat;
		this.candidat = candidat;
	}
	public Candidat getCandidat() {
		return candidat;
	}
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	public int getMissionId() {
		return missionId;
	}
	public void setMissionId(int missionId) {
		this.missionId = missionId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	public CreateMissionRequest() {
		super();
	}
	public CreateMissionRequest(int missionId, String description, Date datedebut, Date datefin, Etat etat) {
		super();
		this.missionId = missionId;
		this.description = description;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.etat = etat;
	}
	
}
