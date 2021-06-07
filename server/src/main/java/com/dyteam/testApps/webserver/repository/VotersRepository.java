package com.dyteam.testApps.webserver.repository;

import java.util.List;

import com.dyteam.testApps.webserver.entity.Voters;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotersRepository extends CrudRepository<Voters, Long> {

	List<Voters> findByVoterId(String voterid);

}
