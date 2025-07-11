package com.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

    @RequestMapping("/interceptor")
    public String home() {
        return "homeInterceptor";
    }

    @RequestMapping("/interceptorHome")
    public String interceptorHome(@RequestParam("user") String user, Model model) {
        model.addAttribute("user", user);
        System.out.println("user is " + user);
        return "userHomeInterceptor";
    }
}
