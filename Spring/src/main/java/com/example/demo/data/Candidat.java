package com.example.demo.data;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Lombok
@NoArgsConstructor // Lombok
@AllArgsConstructor // Lombok
@Entity
public class Candidat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CandidatId;
	private String fullName;
	private Date date;
	private String Adresse;
	private int tel;
	@Enumerated(EnumType.STRING)
	private EtatCandidat etatc;
	@OneToOne(mappedBy = "candidat")
	@JsonIgnore
	private Mission mission;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cv", referencedColumnName = "id")
	private DBFile dBFile;
	@OneToOne(mappedBy = "candidat")
	@JsonIgnore
	private Commentaire commentaire;

	
	public Commentaire getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}

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
	

	public EtatCandidat getActif() {
		return etatc;
	}

	public void setActif(EtatCandidat etatc) {
		this.etatc = etatc;
	}
	

	public EtatCandidat getEtatc() {
		return etatc;
	}

	public void setEtatc(EtatCandidat etatc) {
		this.etatc = etatc;
	}

	public DBFile getdBFile() {
		return dBFile;
	}

	public void setdBFile(DBFile dBFile) {
		this.dBFile = dBFile;
	}

	public Candidat(int candidatId, String fullName, Date date, String adresse, int tel) {
		super();
		CandidatId = candidatId;
		this.fullName = fullName;
		this.date = date;
		Adresse = adresse;
		this.tel = tel;
	}



	

	public Candidat(int candidatId, String fullName, Date date, String adresse, int tel, EtatCandidat etatc) {
		super();
		CandidatId = candidatId;
		this.fullName = fullName;
		this.date = date;
		Adresse = adresse;
		this.tel = tel;
		this.etatc = etatc;
	}
	

	public Candidat(int candidatId, String fullName, Date date, String adresse, int tel, EtatCandidat etatc,
			Mission mission, DBFile dBFile) {
		super();
		CandidatId = candidatId;
		this.fullName = fullName;
		this.date = date;
		Adresse = adresse;
		this.tel = tel;
		this.etatc = etatc;
		this.mission = mission;
		this.dBFile = dBFile;
	}

	public Candidat() {
		super();
	}
	

}
