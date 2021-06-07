package com.dyteam.testApps.webserver.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dyteam.testApps.webserver.entity.User;
import com.dyteam.testApps.webserver.entity.Visitors;

@Repository
public interface VisitorRepository extends CrudRepository<Visitors, Long> {

    List<Visitors> findByMobile(String mobile);

    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM GrievanceManagement.visitors where name like %:name% ", nativeQuery = true)
    List<Visitors> findByName(String name);

}
