package com.example.demo.commands.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.demo.commands.CreateClientCommand;
import com.example.demo.data.Candidat;
import com.example.demo.data.CandidatRepository;
import com.example.demo.data.Client;
import com.example.demo.data.ClientRepository;
import com.example.demo.data.CreateCandidatRequest;
import com.example.demo.data.ERole;
import com.example.demo.data.Mission;
import com.example.demo.data.Role;
import com.example.demo.data.RoleRepository;
import com.example.demo.data.User;
import com.example.demo.data.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
//@RequiredArgsConstructor
@Component
public class ClientService {
	private final ClientRepository repository;
	private final UserRepository rep;
	private final RoleRepository role;
	public ClientService(ClientRepository repository, UserRepository rep,RoleRepository role) {
		this.repository= repository;
		this.rep=rep;
		this.role=role;
	}
	 public Client createClient(Client createClientRequest,long userid) {
		 User u = rep.findById(userid).orElse(null);
		 User us = rep.getClientByRole(ERole.ROLE_Comerciale);
    	if(u!= null && u==us)
    			 createClientRequest.getClienId();
    			 createClientRequest.getNom();
    			 createClientRequest.getNumerotel();
    			 createClientRequest.getDescription();
    			 createClientRequest.getAdresse();
    			 createClientRequest.getCodepostal();
    			 createClientRequest.getVille();
    			 createClientRequest.getPays();
    			 createClientRequest.getContactname();
    			 createClientRequest.getContactprenom();
    			 createClientRequest.getContacttel();
    			 createClientRequest.setUser(u);
        
    	 
    	return this.repository.save(createClientRequest);
		
    }
	
}

