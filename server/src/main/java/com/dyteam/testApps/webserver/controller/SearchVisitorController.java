package com.dyteam.testApps.webserver.controller;

import java.util.List;
import java.util.Optional;

import com.dyteam.testApps.webserver.entity.User;
import com.dyteam.testApps.webserver.entity.Visitors;
import com.dyteam.testApps.webserver.entity.Voters;
import com.dyteam.testApps.webserver.exceptions.ResourceAlreadyExists;
import com.dyteam.testApps.webserver.repository.ApplicationRepository;
import com.dyteam.testApps.webserver.repository.SubscriptionsRepository;
import com.dyteam.testApps.webserver.repository.UserRepository;
import com.dyteam.testApps.webserver.repository.VisitorRepository;
import com.dyteam.testApps.webserver.repository.VotersRepository;
import com.dyteam.testApps.webserver.security.LoginUser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchVisitorController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private VisitorRepository visitorRepository;

	@Autowired
	private VotersRepository votersRepository;

	@PostMapping("/name/{name}")
	public List<Visitors> searchVisitorByName(@PathVariable(value = "name") String name) throws ResourceAlreadyExists {
		List<Visitors> visitor = visitorRepository.findByName(name);
		return visitor;
	}

	@PostMapping("/mobile/{mobile}")
	public List<Visitors> searchVisitorByMobile(@PathVariable(value = "mobile") String mobile)
			throws ResourceAlreadyExists {
		List<Visitors> visitor = visitorRepository.findByMobile(mobile);
		return visitor;
	}

	@PostMapping("/voterId/{voterId}")
	public List<Voters> searchVisitorByVoterId(@PathVariable(value = "voterId") String voterId)
			throws ResourceAlreadyExists {
		List<Voters> voter = votersRepository.findByVoterId(voterId);
		return voter;
	}

}
