package com.example.Deploy_01;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/getDevName")
    public String getDevName(){
        return "Mario";
    }
}
