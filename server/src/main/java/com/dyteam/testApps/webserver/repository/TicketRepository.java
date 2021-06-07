package com.dyteam.testApps.webserver.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.dyteam.testApps.webserver.entity.Tickets;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Tickets, Long> {

    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM GrievanceManagement.tickets where user_id = :userId ", nativeQuery = true)
    List<Tickets> findByUserId(String userId);

}
