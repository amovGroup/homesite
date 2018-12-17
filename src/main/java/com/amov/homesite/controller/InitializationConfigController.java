package com.amov.homesite.controller;

import com.amov.homesite.service.InitializationConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/init")
public class InitializationConfigController {

    @Autowired
    private InitializationConfigService initializationConfigService;

    @RequestMapping("/image")
    public String getImage() {
        return initializationConfigService.getImage();
    }
}
