package com.example.demo.event;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.demo.data.Etat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder

public class MissionCreatedEvent {
	private int missionId;
	private String description;
	private Date datedebut;
	private Date datefin;
	@Enumerated(EnumType.STRING)
	private Etat etat;
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
	public MissionCreatedEvent(int missionId, String description, Date datedebut, Date datefin, Etat etat) {
		super();
		this.missionId = missionId;
		this.description = description;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.etat = etat;
	}
	
}
