package com.example.demo.commands.service;

import org.springframework.stereotype.Component;

import com.example.demo.data.Commentaire;
import com.example.demo.data.CommentaireRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
//@RequiredArgsConstructor
@Component
public class CommentaireCommandeService {
	private final CommentaireRepository cm;
	public CommentaireCommandeService(CommentaireRepository cm) {
		this.cm = cm;
		
	}
    public Commentaire createComment(Commentaire commentaire) {
   	 Commentaire c = new Commentaire(
   			commentaire.getCommentaireId(),
   			commentaire.getImpression_sourcing(),
   			commentaire.getDisposition_par_rapport_statutAE(),
   			commentaire.getNiveaux_francais(),
   			commentaire.getDisposition_negociation_salaire(),
   			commentaire.getDernier_poste(),
   			commentaire.getDate_relance(),
   			commentaire.getSalaire_negocie(),
   			commentaire.getCandidat())	
       ;
      return this.cm.save(c);
		
   }

	
}

