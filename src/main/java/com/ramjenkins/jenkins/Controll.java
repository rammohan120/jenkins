package com.ramjenkins.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controll {

    @GetMapping("/")
    public String wellCome(){
        return "Wellcome rammohan jenkins ci/cd";
    }
}
