package com.aivle.mini7.client.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class HospitalResponse {
    private Summary summary;
    private int emergency_class;
    private List<Hospital> nearest_hospitals;
}