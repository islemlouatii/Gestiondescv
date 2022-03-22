package com.example.demo.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.commands.service.UserCommandeService;
import com.example.demo.data.Droits_Speciaux;
import com.example.demo.data.Entite_commerciale;
import com.example.demo.data.Expertise;
import com.example.demo.data.Role_dorigine;
import com.example.demo.data.Titre;
import com.example.demo.data.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	private final UserCommandeService user;

	public UserController(UserCommandeService user) {
		this.user = user;
	}

	
}
