package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.commands.service.CandidatCommandService;
import com.example.demo.commands.service.MissionCommandService;
import com.example.demo.data.Candidat;
import com.example.demo.data.CandidatRepository;
import com.example.demo.data.CreateCandidatRequest;
import com.example.demo.data.CreateMissionRequest;
import com.example.demo.data.Mission;
@RestController
@RequestMapping("/missions")
public class MissionCommandController {
	private final CandidatRepository rep;
	private final MissionCommandService missionCommandService ;

	public MissionCommandController(MissionCommandService missionCommandService, CandidatRepository rep) {
		this.rep = rep;
		this.missionCommandService = missionCommandService;
	}
	@PostMapping("/create/{candidatId}")
	public ResponseEntity<String> createAccount(@RequestBody Mission request , @PathVariable int candidatId) {
//		Candidat c = rep.findById(candidatid).orElse(null);
		try {
			Mission response = missionCommandService.createAccount(request,candidatId);
			
			return new ResponseEntity<>( HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
