package com.example.demo.queries;

import java.util.List;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import com.example.demo.data.Candidat;
import com.example.demo.data.CandidatRepository;
import com.example.demo.data.EtatCandidat;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CandidatQueryService {

	  private final CandidatRepository candidatRepository;

	    public CandidatQueryService(CandidatRepository candidatRepository) {
	        this.candidatRepository = candidatRepository;
	    }
	   @QueryHandler
	    public Candidat handle(FindCandidatById query) {
	      //  log.info("Handling ...");
	        Candidat candidat = candidatRepository
	                .findById(query.getCandidatId()).orElse(null);

	        return candidat;
	    }
	   @QueryHandler
	    public List <Candidat> getallcandidat () {
	      //  log.info("Handling FindAccountByIdQuery...");
	        return candidatRepository
	                .findAll();

	       
	    }
	   @QueryHandler
	    public List <Candidat> getallcandidatactif () {
	      //  log.info("Handling FindAccountByIdQuery...");
	        return candidatRepository
	                .findAll();

	       
	    }
	   @QueryHandler
	    public List<Candidat> getCandidatActif() {
	        return this.candidatRepository.getCandidatActif(EtatCandidat.done);
	                        
	                    
	    }

	
	  

}
