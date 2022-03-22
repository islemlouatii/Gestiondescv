package com.example.demo.queries;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Client;
import com.example.demo.data.Role;
import com.example.demo.data.User;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/client")
@AllArgsConstructor
public class ClientController {

	private final ClientServiceQuery c;

	public ClientController(ClientServiceQuery c) {
		this.c = c;
	}

	@GetMapping("/clients")
	public List<Client> getSummary() {
		return this.c.getallClinet();
	}

	@GetMapping("/role")
	public List<Role> getrole() {
		return this.c.getrole();
	}

	@GetMapping("/roleuser")
	public User getuserrole() {
		return this.c.getUserByRole();
	}
}
