package com.dyteam.testApps.webserver.repository;

import com.dyteam.testApps.webserver.entity.FileDB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}