package com.example.demo.queries;

import org.axonframework.queryhandling.QueryGateway;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Candidat;
import com.example.demo.data.CandidatRepository;
import com.example.demo.data.Commentaire;
import com.example.demo.data.CommentaireRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/commentaire")
//@Api(value = "Bank Account Queries", description = "Bank Account Query Events API")

public class CommentaireQueryController {
	  private final QueryGateway queryGateway;
	    public CommentaireQueryController(QueryGateway queryGateway) {
	        this.queryGateway = queryGateway;
	    }

	    @GetMapping("/get-commentaire/{id}")
	    public ResponseEntity<Commentaire> getCom(@PathVariable int id) {
	    	Commentaire commentaire = queryGateway.query(
	                new FindCommentaire(id), Commentaire.class
	        ).join();

	        if (commentaire == null) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }

	        return new ResponseEntity<>(commentaire, HttpStatus.OK);
	    }

}
