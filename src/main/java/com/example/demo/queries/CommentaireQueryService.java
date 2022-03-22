package com.example.demo.queries;

import java.util.List;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import com.example.demo.data.Candidat;
import com.example.demo.data.CandidatRepository;
import com.example.demo.data.Commentaire;
import com.example.demo.data.CommentaireRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class CommentaireQueryService {
	private final CommentaireRepository comRepository;
	private final CandidatRepository c;
    public CommentaireQueryService(CommentaireRepository comRepository,CandidatRepository c ) {
        this.comRepository = comRepository;
        this.c=c;
    }
   @QueryHandler
    public Commentaire handle(FindCommentaire query) {
      //  log.info("Handling FindAccountByIdQuery...");
        Commentaire commentaire = comRepository
                .findById(query.getCommentaireId()).orElse(null);

        return commentaire;
    }

}
