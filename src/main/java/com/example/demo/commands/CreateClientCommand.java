package com.example.demo.commands;

import java.util.Date;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import com.example.demo.data.User;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class CreateClientCommand {

	@TargetAggregateIdentifier
	private int ClienId;
	private String nom;
	private int numerotel;
	private String description;
	private String adresse;
	private int codepostal;
	private String ville;
	private String pays;
	private String contactname;
	private String contactprenom;
	private int contacttel;
	private User user;
	public int getClienId() {
		return ClienId;
	}
	public void setClienId(int clienId) {
		ClienId = clienId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumerotel() {
		return numerotel;
	}
	public void setNumerotel(int numerotel) {
		this.numerotel = numerotel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
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
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public String getContactprenom() {
		return contactprenom;
	}
	public void setContactprenom(String contactprenom) {
		this.contactprenom = contactprenom;
	}
	public int getContacttel() {
		return contacttel;
	}
	public void setContacttel(int contacttel) {
		this.contacttel = contacttel;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public CreateClientCommand(int clienId, String nom, int numerotel, String description, String adresse,
			int codepostal, String ville, String pays, String contactname, String contactprenom, int contacttel) {
		super();
		ClienId = clienId;
		this.nom = nom;
		this.numerotel = numerotel;
		this.description = description;
		this.adresse = adresse;
		this.codepostal = codepostal;
		this.ville = ville;
		this.pays = pays;
		this.contactname = contactname;
		this.contactprenom = contactprenom;
		this.contacttel = contacttel;
	}
	public CreateClientCommand(int clienId, String nom, int numerotel, String description, String adresse,
			int codepostal, String ville, String pays, String contactname, String contactprenom, int contacttel,
			User user) {
		super();
		ClienId = clienId;
		this.nom = nom;
		this.numerotel = numerotel;
		this.description = description;
		this.adresse = adresse;
		this.codepostal = codepostal;
		this.ville = ville;
		this.pays = pays;
		this.contactname = contactname;
		this.contactprenom = contactprenom;
		this.contacttel = contacttel;
		this.user = user;
	}
	public CreateClientCommand() {
		super();
	}
	
}
