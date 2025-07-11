package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVarable_Controller {

    @RequestMapping("/showPathVarable/{id}")
    public String showPathVarable(@PathVariable("id") int id) {
        System.out.println("id is " + id);
        return "home";
    }

    @RequestMapping("/showPathVarable/{id}/{userName}")
    public String showPathVarable(@PathVariable("id") int id, @PathVariable("userName") String userName) {
        System.out.println("id is " + id);
        System.out.println("userName is " + userName);
        return "home";
    }
}
