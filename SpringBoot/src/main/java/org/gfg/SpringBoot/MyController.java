package org.gfg.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class MyController {


    @RequestMapping("/get/data")
    public String getData(){
        return "Inside the get data";
    }
}
