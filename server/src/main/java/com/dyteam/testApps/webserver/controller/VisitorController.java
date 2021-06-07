package com.dyteam.testApps.webserver.controller;

import java.util.Optional;

import com.dyteam.testApps.webserver.entity.Visitors;
import com.dyteam.testApps.webserver.exceptions.ResourceAlreadyExists;
import com.dyteam.testApps.webserver.repository.VisitorRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitor")
public class VisitorController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private VisitorRepository visitorRepository;

	@PostMapping("/addVisitor")
	public Visitors addVisitor(@RequestBody Visitors visitor) throws ResourceAlreadyExists {
		Visitors savedVisitor = visitorRepository.save(visitor);
		return savedVisitor;
	}

	@PostMapping("/editVisitor")
	public Visitors editVisitor(@RequestBody Visitors visitor) throws ResourceAlreadyExists {
		Optional<Visitors> findVisitor = visitorRepository.findById(visitor.getId());
		if (findVisitor.isPresent()) {
			Visitors editedVisitor = findVisitor.get();
			editedVisitor.setAadhar(visitor.getAadhar());
			editedVisitor.setAddress(visitor.getAddress());
			editedVisitor.setAssemblyConstituency(visitor.getAssemblyConstituency());
			editedVisitor.setBooth(visitor.getBooth());
			editedVisitor.setDescription(visitor.getDescription());
			editedVisitor.setGender(visitor.getGender());
			editedVisitor.setLocality(visitor.getLocality());
			editedVisitor.setMobile(visitor.getMobile());
			editedVisitor.setName(visitor.getName());
			editedVisitor.setPurpose(visitor.getPurpose());
			editedVisitor.setSublocality(visitor.getSublocality());
			editedVisitor.setTitle(visitor.getTitle());
			editedVisitor.setVoterId(visitor.getVoterId());
			editedVisitor.setWard(visitor.getWard());
			return visitorRepository.save(editedVisitor);
		}
		return null;
	}
}
