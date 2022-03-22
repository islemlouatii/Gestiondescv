package com.example.demo.commands.service;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.commands.CreateMissionCommand;
import com.example.demo.data.Candidat;
import com.example.demo.data.CandidatRepository;
import com.example.demo.data.CreateCandidatRequest;
import com.example.demo.data.CreateMissionRequest;
import com.example.demo.data.Etat;
import com.example.demo.data.EtatCandidat;
import com.example.demo.data.Mission;
import com.example.demo.data.Missionepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
//@RequiredArgsConstructor
@Component
public class MissionCommandService {
	private static final Logger l = LogManager.getLogger(MissionCommandService.class);
	private final CandidatRepository rep;
	private final Missionepository repository;

	public MissionCommandService(Missionepository repository, CandidatRepository rep) {
		this.rep = rep;
		this.repository = repository;
	}

	public Mission createAccount(Mission createAccountRequest, int candidatId) {

		l.debug("Handling a Bank Account creation command {}");
		Candidat candidat = rep.findById(candidatId).orElse(null);
		// Mission m ;

		createAccountRequest.getMissionId();
		createAccountRequest.getDescription();
		createAccountRequest.getDatedebut();
		createAccountRequest.getDatefin();
		createAccountRequest.getEtat();

		createAccountRequest.setCandidat(null);

		return this.repository.save(createAccountRequest);

	}



	public Mission affectcandidatToMission(Mission createAccountRequest, int candidatId, int missionId) {
		l.debug("Handling a Bank Account creation command {}");
		Candidat candidat = rep.findById(candidatId).orElse(null);
		Mission mission = repository.findById(missionId).orElse(null);
		// Mission m ;
		if (candidat == null && mission !=null)
			createAccountRequest.getMissionId();

		createAccountRequest.setCandidat(candidat);

		return this.repository.save(createAccountRequest);

	}

	// @Scheduled(cron = "*/10 * * * * *")
	// @Scheduled(cron="*/5 * * * * ?")
	public void ActifCandidat() {
		for (Mission m : repository.findAll()) {
			if (m.getCandidat() != null) {

				if (m.getCandidat().getActif() != m.getCandidat().getActif().done) {
					m.getMissionId();
					m.getCandidat().setActif(m.getCandidat().getActif().done);
					m.setEtat(Etat.EN_COUR);
					this.repository.save(m);

				}
			}
			else
			{
				m.setEtat(Etat.NON_AFFECTE);
				this.repository.save(m);
			}

		}
	}
	// @Scheduled(cron = "*/10 * * * * *")
	// @Scheduled(cron="*/5 * * * * ?")

	public void missiontermine() {

		for (Mission m : repository.findAll()) {

			Date now = new Date();

			if (new Date(m.getDatefin().getYear(), m.getDatefin().getMonth(), m.getDatefin().getDate())
					.before(new Date(now.getYear(), now.getMonth(), now.getDate())))

			{
				l.info("inf" + m.getEtat());
				m.setEtat(Etat.TERMINE);
				repository.save(m);

			}
		
			
		}

	}




}
