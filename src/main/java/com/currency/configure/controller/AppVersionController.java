package com.currency.configure.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppVersionController {

    @Value("${app.version}")
    String version;

    @GetMapping("/api/v1/release")
    public Map getAppVersion(){
        Map map = new HashMap();
        map.put("version", version);
        return map;
    }

}
