package com.aivle.mini7.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aivle.mini7.client.dto.Hospital;
import com.aivle.mini7.client.dto.HospitalResponse;
import com.aivle.mini7.dto.LogDto;
import com.aivle.mini7.model.Log;
import com.aivle.mini7.repository.LogRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class LogService {

    private final LogRepository logRepository;

    public List<LogDto.ResponseList> getAllLogs() {
        List<Log> logs = logRepository.findAll();
        return logs.stream()
                .map(LogDto.ResponseList::of)
                .collect(Collectors.toList());
    }

}
