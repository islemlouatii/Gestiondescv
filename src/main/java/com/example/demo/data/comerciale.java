package com.example.demo.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import javassist.bytecode.ByteArray;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class comerciale {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int UserId;
	@Enumerated(EnumType.STRING)
	private Role_dorigine role;
	@Enumerated(EnumType.STRING)
	private Entite_commerciale entite_commerciale;
	@Enumerated(EnumType.STRING)
	private Droits_Speciaux Droits_Speciaux; 
	@Enumerated(EnumType.STRING)
	private Titre titre;
	private String nom;
	private String prenom;   
	
    @Column(name="profile_picture")
	private String image;
	private Date date_naissance;
	private Expertise Expertise;
	private String Adresse;
	private String ville;
	private String pays;
	private int code_postale;
	private String email;
	private int tel;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public Role_dorigine getRole() {
		return role;
	}
	public void setRole(Role_dorigine role) {
		this.role = role;
	}
	public Entite_commerciale getEntite_commerciale() {
		return entite_commerciale;
	}
	public void setEntite_commerciale(Entite_commerciale entite_commerciale) {
		this.entite_commerciale = entite_commerciale;
	}
	public Droits_Speciaux getDroits_Speciaux() {
		return Droits_Speciaux;
	}
	public void setDroits_Speciaux(Droits_Speciaux droits_Speciaux) {
		Droits_Speciaux = droits_Speciaux;
	}
	public Titre getTitre() {
		return titre;
	}
	public void setTitre(Titre titre) {
		this.titre = titre;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public Expertise getExpertise() {
		return Expertise;
	}
	public void setExpertise(Expertise expertise) {
		Expertise = expertise;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getCode_postale() {
		return code_postale;
	}
	public void setCode_postale(int code_postale) {
		this.code_postale = code_postale;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public comerciale( Role_dorigine role, Entite_commerciale entite_commerciale,
		Droits_Speciaux droits_Speciaux, Titre titre, String nom, String prenom, String image,
			Date date_naissance, com.example.demo.data.Expertise expertise, String adresse, String ville, String pays,
			int code_postale, String email, int tel) {
		super();
	
		this.role = role;
		this.entite_commerciale = entite_commerciale;
		this.Droits_Speciaux = droits_Speciaux;
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
		this.image = image;
		this.date_naissance = date_naissance;
		Expertise = expertise;
		Adresse = adresse;
		this.ville = ville;
		this.pays = pays;
		this.code_postale = code_postale;
		this.email = email;
		this.tel = tel;
	}
	public comerciale() {
		super();
	}
	
}
