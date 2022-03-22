package com.example.demo.event;

import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.data.Candidat;
import com.example.demo.data.CandidatRepository;

@Component
@ProcessingGroup("candidat")
public class CandidatEventHandler {

    private CandidatRepository candidatRepository;

    public CandidatEventHandler(CandidatRepository candidatRepository) {
        this.candidatRepository = candidatRepository;
    }

//	@EventHandler
//	public void on(CandidatCreatedEvent event) throws Exception {
//		Candidat candidat = new Candidat();
//		BeanUtils.copyProperties(event, candidat);
////        candidatRepository.save(candidat);
//		throw new Exception("Exception Occurred");
//	}

	@ExceptionHandler
	public void handle(Exception exception) throws Exception {
		throw exception;
	}
}
