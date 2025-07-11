package com.springmvc.controller;

import com.springmvc.Entities.User;
import com.springmvc.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
    @Autowired
    private UserService userService;

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

//    this is used to add attributes to model for all the request so these can be use directly in view
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("city", "vijayawada");
        model.addAttribute("country", "india");
        model.addAttribute("state", "Ap");
    }

//    @RequestMapping(value = "/processForm",method = RequestMethod.POST)
//    public String processForm(
//            @RequestParam("UserName") String name,
//            @RequestParam("UserEmail") String email,
//            @RequestParam("UserPassword") String password,
//            Model model) {
//        System.out.println(name + " " + email + " " + password);
//
//        model.addAttribute("name", name);
//        model.addAttribute("email", email);
//        model.addAttribute("password", password);
//        return "success";
//    }
//    instead of sending data individualy we are sending the data using  object
//    @RequestMapping(value = "/processForm",method = RequestMethod.POST)
//    public String processForm(
//            @RequestParam("UserName") String name,
//            @RequestParam("UserEmail") String email,
//            @RequestParam("UserPassword") String password,
//            Model model) {
//        System.out.println(name + " " + email + " " + password);
//
//        User user = new User(name, email, password);
//        model.addAttribute("user", user);
//        return "success";
//    }
//    now we are using @ModelAttribute to send data to view it is doing more than one work it is doing two work like @RequestParam and @ModelAttribute for adding attributes to model
    @RequestMapping(value = "/processForm",method = RequestMethod.POST)
    public String processForm(@ModelAttribute("user") User user, Model model) {
        System.out.println(user);
        this.userService.createUser(user);
        return "success";
    }

//    this is a old way used in servlets
//    public String fromProcessing(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        System.out.println(name + " " + email + " " + password);
//        return "contact";
//    }
    @RequestMapping(value = "/processForm", method = RequestMethod.GET)
    public String handleBadGet() {
        return "redirect:/contact";
    }
}
