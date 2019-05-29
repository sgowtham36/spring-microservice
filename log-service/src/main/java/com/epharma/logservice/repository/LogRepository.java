package com.epharma.logservice.repository;

import java.util.UUID;

import com.epharma.logservice.model.Log;

import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log,UUID>{

}