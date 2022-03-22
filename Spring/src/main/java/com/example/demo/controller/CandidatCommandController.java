package com.example.demo.controller;

import java.util.concurrent.CompletableFuture;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.commands.CreateMissionCommand;
import com.example.demo.commands.service.CandidatCommandService;
import com.example.demo.commands.service.MissionCommandService;
import com.example.demo.data.Candidat;
import com.example.demo.data.CreateCandidatRequest;
import com.example.demo.data.EtatCandidat;
import com.example.demo.data.Mission;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/candidats")
public class CandidatCommandController {
	private final CandidatCommandService candidatCommandService ;
	private final MissionCommandService ms;

	public CandidatCommandController(CandidatCommandService candidatCommandService,MissionCommandService ms) {
		this.candidatCommandService = candidatCommandService;
		this.ms=ms;
	}
	
//	   @PostMapping
//	    
//	    public CompletableFuture<Candidat> createAccount(@RequestBody CreateCandidatRequest creationDTO) {
//	        return this.candidatCommandService.createAccount(creationDTO);
//	    }

	@PostMapping("/create")
	public ResponseEntity<String> createAccount(@RequestBody Candidat request) {
		try {
			Candidat response = candidatCommandService.createAccount(request);

			return new ResponseEntity<>( HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@PostMapping("/affect")
	public ResponseEntity<String> affectcandidatToMission(@RequestBody Mission request, @PathVariable int candidatId, int missionId  ) {
		try {
			Mission response = ms.affectcandidatToMission(request,candidatId,missionId);

			return new ResponseEntity<>( HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}


	}


