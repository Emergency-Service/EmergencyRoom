package com.aivle.mini7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aivle.mini7.model.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer>{

    
}
