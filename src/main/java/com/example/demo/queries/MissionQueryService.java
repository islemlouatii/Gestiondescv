package com.example.demo.queries;

import java.util.List;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import com.example.demo.data.Candidat;
import com.example.demo.data.Etat;
import com.example.demo.data.EtatCandidat;
import com.example.demo.data.Mission;
import com.example.demo.data.Missionepository;

import lombok.AllArgsConstructor;

@Service

public class MissionQueryService {
	private final Missionepository missionRepository;

	public MissionQueryService(Missionepository missionRepository) {
		this.missionRepository = missionRepository;
	}

	@QueryHandler
	public Mission handle(FindMissionById query) {
		
		Mission mission = missionRepository.findById(query.getMissionId()).orElse(null);

		return mission;
	}
	   @QueryHandler
	    public List<Mission> getMissionTermine() {
	        return this.missionRepository.getMissionTermine(Etat.TERMINE);
	                        
	                    
	    }
	   @QueryHandler
	    public List<Mission> getMissionEncour() {
	        return this.missionRepository.getMissionEnCour(Etat.EN_COUR);
	                        
	                    
	    }
	   @QueryHandler
	    public List<Mission> getMissionNonaffecte() {
	        return this.missionRepository.getMissionNonAffecte(Etat.NON_AFFECTE);
	                        
	                    
	    }

}
