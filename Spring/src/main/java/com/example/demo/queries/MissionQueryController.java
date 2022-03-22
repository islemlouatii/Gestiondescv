package com.example.demo.queries;

import java.util.List;

import org.axonframework.queryhandling.QueryGateway;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Candidat;
import com.example.demo.data.Mission;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/mission")
@AllArgsConstructor
public class MissionQueryController {
	private final QueryGateway queryGateway;
	private final MissionQueryService m;

	public MissionQueryController(QueryGateway queryGateway,MissionQueryService m) {
		this.queryGateway = queryGateway;
		this.m= m;
	}

	@GetMapping("/get-mission/{id}")
	public ResponseEntity<Mission> getCandidat(@PathVariable int id) {
		Mission mission = queryGateway.query(new FindMissionById(id), Mission.class).join();

		if (mission == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(mission, HttpStatus.OK);
	}
	
    @GetMapping("/missiontermine")
    public List<Mission> getMissionTermine(){
        return this.m.getMissionTermine();
    }
    
    @GetMapping("/missionencour")
    public List<Mission> getMissionEncour(){
        return this.m.getMissionEncour();
    }
    
    @GetMapping("/missionnonaffecte")
    public List<Mission> getMissionnonaffecte(){
        return this.m.getMissionNonaffecte();
    }

}
