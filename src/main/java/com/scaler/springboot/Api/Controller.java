package com.scaler.springboot.Api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @RequestMapping("/user")
    public String sayhello(){

        return "Deepak" ;
    }
@RequestMapping("/goodnight/{name}")
    public String bye(@PathVariable("name") String name) {
        return "good night.."+name ;
    }
}
