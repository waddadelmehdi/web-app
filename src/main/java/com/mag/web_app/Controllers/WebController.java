package com.mag.web_app.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping(path = "/home")
    public String welcome(){
        return "Welcome To App";
    }
}
