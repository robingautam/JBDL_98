package org.gfg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {


    @RequestMapping("/custom/data")
    public String getControllerData(){
        return "Inside the controller data";
    }
}
