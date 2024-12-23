package com.aivle.mini7.dto;

import com.aivle.mini7.model.Log;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LogDto {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ResponseList {
        //        Log의 항목들을 적어야함
        private String inputText;
        private String datetime;
        private Double inputLatitude;
        private Double inputLongitude;
        private Integer emClass;
        // 1
        private String hospital1;
        private String tel1_1;
        private Double distance1;
        private String duration1;
        private String arrivalTime1;
        private String addr1;
        // 2
        private String hospital2;
        private String tel1_2;
        private Double distance2;
        private String duration2;
        private String arrivalTime2;
        private String addr2;
        // 3
        private String hospital3;
        private String tel1_3;
        private Double distance3;
        private String duration3;
        private String arrivalTime3;
        private String addr3;



        public static LogDto.ResponseList of(Log log) {
            return ResponseList.builder()
                    .inputText(log.getInputText())
                    .datetime(log.getDatetime())
                    .inputLatitude(log.getInputLatitude())
                    .inputLongitude(log.getInputLongitude())
                    .emClass(log.getEmClass())

                    // 1
                    .hospital1(log.getHospital1())
                    .tel1_1(log.getTel1_1())
                    .distance1(log.getDistance1())
                    .duration1(log.getDuration1())
                    .arrivalTime1(log.getArrivalTime1())
                    .addr1(log.getAddr1())

                    // 2
                    .hospital2(log.getHospital2())
                    .tel1_2(log.getTel1_2())
                    .distance2(log.getDistance2())
                    .duration2(log.getDuration2())
                    .arrivalTime2(log.getArrivalTime2())
                    .addr2(log.getAddr2())

                    // 3
                    .hospital3(log.getHospital3())
                    .tel1_3(log.getTel1_3())
                    .distance3(log.getDistance3())
                    .duration3(log.getDuration3())
                    .arrivalTime3(log.getArrivalTime3())
                    .addr3(log.getAddr3())
                    .build();
        }
    }
}
