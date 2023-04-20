package com.ameda.TestDeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TrialController {

    @GetMapping("/message")
    public String getMessage(){
        return "Kevin Ameda Kisevu.";
    }
}
