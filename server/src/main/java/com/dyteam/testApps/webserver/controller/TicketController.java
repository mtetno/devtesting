package com.dyteam.testApps.webserver.controller;

import java.util.List;
import java.util.Optional;

import com.dyteam.testApps.webserver.entity.Tickets;
import com.dyteam.testApps.webserver.entity.Visitors;
import com.dyteam.testApps.webserver.exceptions.ResourceAlreadyExists;
import com.dyteam.testApps.webserver.repository.TicketRepository;
import com.dyteam.testApps.webserver.repository.VisitorRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private TicketRepository ticketRepository;

	@PostMapping("/generateToken")
	public Tickets generateToken(@RequestBody Tickets tickets) throws ResourceAlreadyExists {
		return ticketRepository.save(tickets);
	}

	@PostMapping("/findAllUserTickets/{userId}")
	public List<Tickets> generateToken(@PathVariable(value = "userId") String userId) throws ResourceAlreadyExists {
		return ticketRepository.findByUserId(userId);
	}

}
