package com.portal.salesportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//for solving angular rout with spring issue
//the server not have to recognize this url "/add-product"
@Controller
public class WebController {
    @GetMapping("/add-product")
    public String index(){
        return "forward:/index.html";
    }
}
