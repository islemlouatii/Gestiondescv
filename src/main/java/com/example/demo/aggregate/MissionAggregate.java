package com.example.demo.aggregate;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import com.example.demo.commands.CreateMissionCommand;
import com.example.demo.data.Etat;
import com.example.demo.event.MissionCreatedEvent;

@Aggregate
public class MissionAggregate {
	@AggregateIdentifier
	private int missionId;
	private String description;
	private Date datedebut;
	private Date datefin;
	@Enumerated(EnumType.STRING)
	private Etat etat;

	public MissionAggregate(int missionId, String description, Date datedebut, Date datefin, Etat etat) {
		super();
		this.missionId = missionId;
		this.description = description;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.etat = etat;
	}

	@CommandHandler
	public MissionAggregate(CreateMissionCommand createMissionCommand) {
		// log.info("CreateAccountCommand received.");
		System.out.println("created");
		AggregateLifecycle.apply(new MissionCreatedEvent(createMissionCommand.getMissionId(),
				createMissionCommand.getDescription(), createMissionCommand.getDatedebut(),
				createMissionCommand.getDatefin(), createMissionCommand.getEtat()));
	}
}
