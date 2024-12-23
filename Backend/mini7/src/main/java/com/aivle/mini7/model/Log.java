package com.aivle.mini7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "log")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String datetime;

    @Column(name = "input_text", nullable = false)
    private String inputText;

    @Column(name = "input_latitude", nullable = false)
    private Double inputLatitude;

    @Column(name = "input_longitude", nullable = false)
    private Double inputLongitude;

    @Column(name = "em_class", nullable = false)
    private Integer emClass;

    // 1
    @Column(nullable = false)
    private String hospital1;

    @Column(nullable = false)
    private String tel1_1;

    @Column(nullable = false)
    private Double distance1;

    @Column(nullable = false)
    private String duration1;

    @Column(name = "arrival_time1", nullable = false)
    private String arrivalTime1;

    @Column(nullable = false)
    private String addr1;

    // 2
    @Column(nullable = false)
    private String hospital2;

    @Column(nullable = false)
    private String tel1_2;

    @Column(nullable = false)
    private Double distance2;

    @Column(nullable = false)
    private String duration2;

    @Column(name = "arrival_time2", nullable = false)
    private String arrivalTime2;

    @Column(nullable = false)
    private String addr2;

    // 3
    @Column(nullable = false)
    private String hospital3;

    @Column(nullable = false)
    private String tel1_3;

    @Column(nullable = false)
    private Double distance3;

    @Column(nullable = false)
    private String duration3;

    @Column(name = "arrival_time3", nullable = false)
    private String arrivalTime3;

    @Column(nullable = false)
    private String addr3;
}