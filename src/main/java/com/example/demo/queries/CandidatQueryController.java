package com.example.demo.queries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import javax.annotation.security.RolesAllowed;

import org.axonframework.queryhandling.QueryGateway;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.data.Candidat;
import com.example.demo.data.EtatCandidat;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/candidat")

public class CandidatQueryController {
	   private final QueryGateway queryGateway;
	   private final CandidatQueryService c;
    public CandidatQueryController(QueryGateway queryGateway,CandidatQueryService c) {
        this.queryGateway = queryGateway;
        this.c=c;
    }
    

    @GetMapping("/get-candidat/{id}")
    public ResponseEntity<Candidat> getCandidat(@PathVariable int id) {
    	Candidat candidat = queryGateway.query(
                new FindCandidatById(id), Candidat.class
        ).join();

        if (candidat == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(candidat, HttpStatus.OK);
    }
    @GetMapping("/candidats")
    public List<Candidat> getSummary(){
        return this.c.getallcandidat();
    }  
    
    @GetMapping("/candidatByetat")
    public List<Candidat> getCandidatByEtat(){
        return this.c.getCandidatActif();
    }  
}

