package com.nst.eng.rest;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping(path = "/api/public/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "Hello "+name;
    }

    @RequestMapping(path = "/api/hello/currentTime")
    public String currentTime(){
        return "Hello Current Time : "+new Date();
    }
}
