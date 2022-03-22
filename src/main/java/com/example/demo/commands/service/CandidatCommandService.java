package com.example.demo.commands.service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.commands.CreateCandidatCommand;
import com.example.demo.data.Candidat;
import com.example.demo.data.CandidatRepository;
import com.example.demo.data.CreateCandidatRequest;
import com.example.demo.event.CandidatCreatedEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
@Component
public class CandidatCommandService {
	private final CandidatRepository repository;
	public CandidatCommandService(CandidatRepository repository) {
		this.repository= repository;
	}
//	@EventHandler
//	public void on(CandidatCreatedEvent event) {
//	   // log.debug("Handling a Bank Account creation command {}", event.getId());
//	    Candidat candidat = new Candidat(
//	            event.getId(),
//	            event.getFullName(),
//	            event.getDate(),
//	            event.getAdresse(),
//	            event.getTel()
//	    );
//	    this.repository.save(candidat);
//	}
   // private final CommandGateway commandGateway;

//    public CandidatCommandService(CommandGateway commandGateway) {
//        this.commandGateway = commandGateway;
//    }

    public Candidat createAccount(Candidat createAccountRequest) {
    	
    			createAccountRequest.getCandidatId();
                createAccountRequest.getFullName();
                createAccountRequest.getDate();
                createAccountRequest.getAdresse();
                createAccountRequest.getTel();
                createAccountRequest.getActif();
                createAccountRequest.getdBFile().getData();
       return this.repository.save(createAccountRequest);
		
    }
}
