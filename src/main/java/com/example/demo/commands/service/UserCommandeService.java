package com.example.demo.commands.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.example.demo.data.Candidat;
import com.example.demo.data.Mission;
import com.example.demo.data.comerciale;
import com.example.demo.data.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserCommandeService {
	private static final Logger l = LogManager.getLogger(MissionCommandService.class);
	private final UserRepository rep;

	public UserCommandeService(UserRepository rep) {
		this.rep = rep;
	}

	

}
