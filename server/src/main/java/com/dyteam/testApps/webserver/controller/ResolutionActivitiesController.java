package com.dyteam.testApps.webserver.controller;

import java.util.List;
import java.util.Optional;

import com.dyteam.testApps.webserver.entity.ResolutionActivities;
import com.dyteam.testApps.webserver.entity.Tickets;
import com.dyteam.testApps.webserver.entity.Visitors;
import com.dyteam.testApps.webserver.exceptions.ResourceAlreadyExists;
import com.dyteam.testApps.webserver.repository.ResolutionActivitiesRepository;
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
@RequestMapping("/resolutionActivities")
public class ResolutionActivitiesController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ResolutionActivitiesRepository resolutionActivitiesRepository;

	@PostMapping("/addActivity")
	public ResolutionActivities addActivities(@RequestBody ResolutionActivities resolutionActivities)
			throws ResourceAlreadyExists {
		return resolutionActivitiesRepository.save(resolutionActivities);
	}

	@PostMapping("/fetchActivities/{tokenId}")
	public List<ResolutionActivities> fetchActivities(@PathVariable(value = "tokenId") String tokenId)
			throws ResourceAlreadyExists {
		return resolutionActivitiesRepository.findByTokenId(tokenId);
	}

}
