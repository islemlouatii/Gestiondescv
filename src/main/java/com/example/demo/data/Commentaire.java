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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Commentaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int commentaireId;
	@Enumerated(EnumType.STRING)
	private Impression impression_sourcing;
	@Enumerated(EnumType.STRING)
	private Disposition disposition_par_rapport_statutAE;
	@Enumerated(EnumType.STRING)
	private Niveau niveaux_francais;
	@Enumerated(EnumType.STRING)
	private Negiciation disposition_negociation_salaire;
	private String dernier_poste;
	private Date date_relance;
	private float salaire_negocie;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CandidatId", referencedColumnName = "CandidatId")
	private Candidat candidat;
	public int getCommentaireId() {
		return commentaireId;
	}
	public void setCommentaireId(int commentaireId) {
		this.commentaireId = commentaireId;
	}
	public Impression getImpression_sourcing() {
		return impression_sourcing;
	}
	public void setImpression_sourcing(Impression impression_sourcing) {
		this.impression_sourcing = impression_sourcing;
	}
	public Disposition getDisposition_par_rapport_statutAE() {
		return disposition_par_rapport_statutAE;
	}
	public void setDisposition_par_rapport_statutAE(Disposition disposition_par_rapport_statutAE) {
		this.disposition_par_rapport_statutAE = disposition_par_rapport_statutAE;
	}
	public Niveau getNiveaux_francais() {
		return niveaux_francais;
	}
	public void setNiveaux_francais(Niveau niveaux_francais) {
		this.niveaux_francais = niveaux_francais;
	}
	public Negiciation getDisposition_negociation_salaire() {
		return disposition_negociation_salaire;
	}
	public void setDisposition_negociation_salaire(Negiciation disposition_negociation_salaire) {
		this.disposition_negociation_salaire = disposition_negociation_salaire;
	}
	public String getDernier_poste() {
		return dernier_poste;
	}
	public void setDernier_poste(String dernier_poste) {
		this.dernier_poste = dernier_poste;
	}
	public Date getDate_relance() {
		return date_relance;
	}
	public void setDate_relance(Date date_relance) {
		this.date_relance = date_relance;
	}
	public float getSalaire_negocie() {
		return salaire_negocie;
	}
	public void setSalaire_negocie(int salaire_negocie) {
		this.salaire_negocie = salaire_negocie;
	}
	public Candidat getCandidat() {
		return candidat;
	}
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	public Commentaire(int commentaireId, Impression impression_sourcing, Disposition disposition_par_rapport_statutAE,
			Niveau niveaux_francais, Negiciation disposition_negociation_salaire, String dernier_poste,
			Date date_relance, float salaire_negocie, Candidat candidat) {
		super();
		this.commentaireId = commentaireId;
		this.impression_sourcing = impression_sourcing;
		this.disposition_par_rapport_statutAE = disposition_par_rapport_statutAE;
		this.niveaux_francais = niveaux_francais;
		this.disposition_negociation_salaire = disposition_negociation_salaire;
		this.dernier_poste = dernier_poste;
		this.date_relance = date_relance;
		this.salaire_negocie = salaire_negocie;
		this.candidat = candidat;
	}
	public Commentaire(int commentaireId, Impression impression_sourcing, Disposition disposition_par_rapport_statutAE,
			Niveau niveaux_francais, Negiciation disposition_negociation_salaire, String dernier_poste,
			Date date_relance, float salaire_negocie) {
		super();
		this.commentaireId = commentaireId;
		this.impression_sourcing = impression_sourcing;
		this.disposition_par_rapport_statutAE = disposition_par_rapport_statutAE;
		this.niveaux_francais = niveaux_francais;
		this.disposition_negociation_salaire = disposition_negociation_salaire;
		this.dernier_poste = dernier_poste;
		this.date_relance = date_relance;
		this.salaire_negocie = salaire_negocie;
		
	}
	
	
}
