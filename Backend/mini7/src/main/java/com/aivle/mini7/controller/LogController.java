package com.aivle.mini7.controller;

import com.aivle.mini7.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping("/logs")
    public String showLogs(Model model) {
        model.addAttribute("logs", logService.getAllLogs());
        return "admin/logs";
    }
}
