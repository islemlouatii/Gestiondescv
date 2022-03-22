package com.example.demo.queries;

import java.util.List;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import com.example.demo.data.Client;
import com.example.demo.data.ClientRepository;
import com.example.demo.data.ERole;
import com.example.demo.data.Role;
import com.example.demo.data.RoleRepository;
import com.example.demo.data.User;
import com.example.demo.data.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClientServiceQuery {
	private final ClientRepository cl;
	private final RoleRepository r;
	private final UserRepository us;
	public ClientServiceQuery(ClientRepository cl, RoleRepository r,UserRepository us) {
		this.cl = cl;
		this.r=r;
		this.us=us;
	}

	@QueryHandler
	public Client handle(Client query) {
		// log.info("Handling ...");
		Client client = cl.findById(query.getClienId()).orElse(null);

		return client;
	}

	@QueryHandler
	public List<Role> getrole() {
		// log.info("Handling ...");
		
		List<Role> role = r.findAll();
		return r.find2ByName(ERole.ROLE_Comerciale);
	}
	@QueryHandler
	public User getUserByRole() {
		
		// log.info("Handling ...");
	
	//List<Role> role = r.find2ByName(ERole.ROLE_Candidat);
	return us.getClientByRole(ERole.ROLE_Comerciale);
	}
	@QueryHandler
	public List<Client> getallClinet() {

		return cl.findAll();

	}

}
