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
import lombok.ToString;

@Getter
@Setter
@ToString
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
    @Column(name = "hospital1")
    private String hospital1;

    @Column(name = "addr1")
    private String addr1;

    @Column(name = "tel1")
    private String tel1;

    @Column(name = "distance1")
    private Double distance1;

    @Column(name = "duration1")
    private String duration1;

    @Column(name = "arrival_time1")
    private String arrivalTime1;

    // 2
    @Column(name = "hospital2")
    private String hospital2;

    @Column(name = "addr2")
    private String addr2;

    @Column(name = "tel2")
    private String tel2;

    @Column(name = "distance2")
    private Double distance2;

    @Column(name = "duration2")
    private String duration2;

    @Column(name = "arrival_time2")
    private String arrivalTime2;

    // 3
    @Column(name = "hospital3")
    private String hospital3;

    @Column(name = "addr3")
    private String addr3;

    @Column(name = "tel3")
    private String tel3;

    @Column(name = "distance3")
    private Double distance3;

    @Column(name = "duration3")
    private String duration3;

    @Column(name = "arrival_time3")
    private String arrivalTime3;
}
