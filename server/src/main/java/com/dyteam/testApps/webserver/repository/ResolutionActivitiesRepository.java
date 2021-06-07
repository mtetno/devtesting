package com.dyteam.testApps.webserver.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.dyteam.testApps.webserver.entity.ResolutionActivities;
import com.dyteam.testApps.webserver.entity.Tickets;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResolutionActivitiesRepository extends CrudRepository<ResolutionActivities, Long> {

    List<ResolutionActivities> findByTokenId(String tokenId);

}
