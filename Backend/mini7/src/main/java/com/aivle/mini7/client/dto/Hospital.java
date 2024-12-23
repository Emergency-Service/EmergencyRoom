package com.aivle.mini7.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hospital {
    private String hospital_name;
    private String tel1;
    private double distance_km;
    private String duration;
    private String arrival_time;
    private String address;
}