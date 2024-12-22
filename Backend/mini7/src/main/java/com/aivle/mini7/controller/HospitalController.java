package com.aivle.mini7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aivle.mini7.client.dto.HospitalResponse;
import com.aivle.mini7.service.HospitalService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HospitalController {
    private final HospitalService hospitalService;
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/recommend_hospital")
    public ModelAndView recommendHospital(
        @RequestParam String request,
        @RequestParam double latitude,
        @RequestParam double longitude,
        @RequestParam int count
    ){
        HospitalResponse hospitalList = hospitalService.getNearestHospitals(request, latitude, longitude, count);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("recommend_hospital");
        mv.addObject("hospitalList", hospitalList);
        return mv;
    }

}
