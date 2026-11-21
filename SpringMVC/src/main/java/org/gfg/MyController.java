package org.gfg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class MyController {

   // @GetMapping(value = "/get/data")
    @RequestMapping("/get/data")
    public String getData(){
        return "data";
    }

    @RequestMapping("/home")
    @ResponseBody
    public String getHome(){
        return "This is home page";
    }

//    @RequestMapping("/show/data")
//    public String showData(){
//        return "sata";
//    }
}
