package com.example.demo.aggregate;

import java.util.Date;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import com.example.demo.commands.CreateCandidatCommand;
import com.example.demo.event.CandidatCreatedEvent;
@Aggregate
public class CandidatAggregate {
	
	@AggregateIdentifier
	private String CandidatId;
	private String fullName;
	private Date date;
	private String Adresse;
	private int tel;
	public CandidatAggregate(String candidatId, String fullName, Date date, String adresse, int tel) {
		super();
		CandidatId = candidatId;
		this.fullName = fullName;
		this.date = date;
		Adresse = adresse;
		this.tel = tel;
	}
	@CommandHandler
    public CandidatAggregate(CreateCandidatCommand createCandidatCommand) {
      //  log.info("CreateAccountCommand received.");
		System.out.println("created");
        AggregateLifecycle.apply(new CandidatCreatedEvent(
        		createCandidatCommand.getCandidatId(),
        		createCandidatCommand.getFullName(),
        		createCandidatCommand.getDate(),
        		createCandidatCommand.getAdresse(),
        		createCandidatCommand.getTel()));
    }

    @EventSourcingHandler
    public void on(CandidatCreatedEvent candidatCreatedEvent) {
      //  log.info("An AccountCreatedEvent occurred.");
        this.CandidatId = candidatCreatedEvent.getCandidatId();
        this.fullName = candidatCreatedEvent.getFullName();
        this.date = candidatCreatedEvent.getDate();
        this.Adresse =candidatCreatedEvent.getAdresse();
        this.tel=candidatCreatedEvent.getTel();

       // AggregateLifecycle.apply(new AccountActivatedEvent(this.CandidatId, "ACTIVATED"));
    }
//    @CommandHandler
//    public CandidatAggregate(CreateCandidatCommand command) {
//        this.repo = null;
//		//You can perform all the validations
//        AggregateLifecycle.apply(
//                new CandidatCreatedEvent(
//                        command.getFullName(),
//                        command.getAdresse(),
//                        command.getTel()
//                )
//        );
//    }
//    @EventSourcingHandler
//    public void on(CandidatCreatedEvent event) {
//        this.CandidatId = event.getCandidatId();
//        this.fullName = event.getFullName();
//        this.Adresse = event.getAdresse();
//        this.tel = event.getTel();
//    }

     
}

