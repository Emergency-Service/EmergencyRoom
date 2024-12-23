package com.aivle.mini7.service;

import java.util.Date;
import java.util.List;

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

    @Transactional(readOnly = true)
    public Page<LogDto.ResponseList> getLogList(Pageable pageable) {
        Page<Log> logs = logRepository.findAll(pageable);

        return logs.map(LogDto.ResponseList::of);
    }

    /**
     * 원래 이렇게 나쁜 모듈로 구현하면 안된다.
     * 현재 프로젝트 완료를 위해 급급한 소스이다.
     * @param hostpitalList
     * @param request
     * @param latitude
     * @param longitude
     */
    public void saveLog(List<Hospital> hospitalList, String request, double latitude, double longitude, int emClass) {
        Log hospitalLog = Log.builder()
                .inputText(request)
                .inputLatitude(latitude)
                .inputLongitude(longitude)
                .emClass(emClass)
                .datetime(String.valueOf(new Date()))
                .build();
        int count = 1;
        for(Hospital hospital : hospitalList) {
            log.info("hospital: {}", hospital);
            switch (count) {
                case 1:
                    hospitalLog.setHospital1(hospital.getHospital_name());
                    hospitalLog.setTel1_1(hospital.getTel1());
                    hospitalLog.setDistance1(hospital.getDistance_km());
                    hospitalLog.setDuration1(hospital.getDuration());
                    hospitalLog.setArrivalTime1(hospital.getArrival_time());
                    hospitalLog.setAddr1(hospital.getAddress());
                    break;
                case 2:
                    hospitalLog.setHospital2(hospital.getHospital_name());
                    hospitalLog.setTel1_2(hospital.getTel1());
                    hospitalLog.setDistance2(hospital.getDistance_km());
                    hospitalLog.setDuration2(hospital.getDuration());
                    hospitalLog.setArrivalTime2(hospital.getArrival_time());
                    hospitalLog.setAddr2(hospital.getAddress());
                    break;
                case 3:
                    hospitalLog.setHospital3(hospital.getHospital_name());
                    hospitalLog.setTel1_3(hospital.getTel1());
                    hospitalLog.setDistance3(hospital.getDistance_km());
                    hospitalLog.setDuration3(hospital.getDuration());
                    hospitalLog.setArrivalTime3(hospital.getArrival_time());
                    hospitalLog.setAddr3(hospital.getAddress());
                    break;
            }
            count++;

        }
        logRepository.save(hospitalLog);
    }

}
