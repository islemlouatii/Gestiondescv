package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.commands.CreateClientCommand;
import com.example.demo.commands.service.ClientService;
import com.example.demo.data.Client;
import com.example.demo.data.ERole;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/cliens")
public class ClientCommandController {

	public final ClientService cl;

	public ClientCommandController(ClientService cl) {
		this.cl = cl;
	}

	@PostMapping("/create/{userid}")
	public ResponseEntity<String> createAccount(@RequestBody Client request,@PathVariable long userid  ) {
		try {
			Client response = cl.createClient(request,userid);

			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	
}
