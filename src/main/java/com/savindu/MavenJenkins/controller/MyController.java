package com.savindu.MavenJenkins.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class MyController {
    @GetMapping()
    public String getTest() {
        return "Access getTest() api";
    }
}
