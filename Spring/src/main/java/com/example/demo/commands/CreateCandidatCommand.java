package com.example.demo.commands;

import java.util.Date;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateCandidatCommand {

	public String getCandidatId() {
		return CandidatId;
	}

	public void setCandidatId(String candidatId) {
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

	public CreateCandidatCommand(String fullName,  int tel) {
		super();
		this.fullName = fullName;
	
		this.tel = tel;
	}



	public CreateCandidatCommand(String candidatId, String fullName, Date date, String adresse, int tel) {
		super();
		CandidatId = candidatId;
		this.fullName = fullName;
		this.date = date;
		Adresse = adresse;
		this.tel = tel;
	}
	public CreateCandidatCommand( String fullName, Date date, String adresse, int tel) {
		super();
		
		this.fullName = fullName;
		this.date = date;
		Adresse = adresse;
		this.tel = tel;
	}

	public CreateCandidatCommand(String fullName, String adresse, int tel) {
		super();
		this.fullName = fullName;
		Adresse = adresse;
		this.tel = tel;
	}



	@TargetAggregateIdentifier
	private String CandidatId;
	private String fullName;
	private Date date;
	private String Adresse;
	private int tel;
}
