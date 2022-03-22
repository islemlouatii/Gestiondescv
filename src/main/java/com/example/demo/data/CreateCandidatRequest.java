package com.example.demo.data;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
public class CreateCandidatRequest {
	private int candidatId;
	private String fullName;
	private Date date;
	private String Adresse;
	private int tel;
	@Enumerated(EnumType.STRING)
	private EtatCandidat actif;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cv", referencedColumnName = "id")
	private DBFile dBFile;
	
	
	
	public DBFile getdBFile() {
		return dBFile;
	}

	public void setdBFile(DBFile dBFile) {
		this.dBFile = dBFile;
	}

	public CreateCandidatRequest(int candidatId, String fullName, Date date, String adresse, int tel,
			EtatCandidat actif, DBFile dBFile) {
		super();
		this.candidatId = candidatId;
		this.fullName = fullName;
		this.date = date;
		Adresse = adresse;
		this.tel = tel;
		this.actif = actif;
		this.dBFile = dBFile;
	}

	public CreateCandidatRequest() {
		super();
	}

	public CreateCandidatRequest(int candidatId, String fullName, Date date, String adresse, int tel, EtatCandidat actif) {
		super();
		this.candidatId = candidatId;
		this.fullName = fullName;
		this.date = date;
		Adresse = adresse;
		this.tel = tel;
		this.actif = actif;
	}

	public EtatCandidat isActif() {
		return actif;
	}

	public void setActif(EtatCandidat actif) {
		this.actif = actif;
	}

	public CreateCandidatRequest(int candidatId, String fullName, Date date, String adresse, int tel) {
		super();
		this.candidatId = candidatId;
		this.fullName = fullName;
		this.date = date;
		Adresse = adresse;
		this.tel = tel;
	}

	public String getFullName() {
		return fullName;
	}
	
	public int getCandidatId() {
		return candidatId;
	}

	public void setCandidatId(int candidatId) {
		this.candidatId = candidatId;
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
	
}
