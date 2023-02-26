package com.example.democontroller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zjj")
public class TestLinuxExceptionController {
    @RequestMapping("/testTop")
    public String testDeadWhile(){
        System.out.println("12345=================");
        while (true){
        }
    }

    @RequestMapping("/test")
    public String est(){

        return "123";
    }
}
