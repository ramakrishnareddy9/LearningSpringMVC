package com.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class HomeController {
//    sending data from controller to view
    @RequestMapping({"/", "/home"})
    public String home(Model model) {
        model.addAttribute("city", "vijayawada");
        List<String> friends = List.of("suraya", "Bharath", "Vishnu");
        model.addAttribute("friends", friends);
        return "home";
    }

    @RequestMapping("/about")
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView("about");
        //modelAndView.setViewName("about"); either constructor or this method
        modelAndView.addObject("name", "Ramakrishnareddy");
        modelAndView.addObject("city", "vijayawada");

        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time", now.toString());

        List<Integer> marks = List.of(90, 80, 70, 60);
        modelAndView.addObject("marks", marks);
        return modelAndView;
    }

//    getting data from view to controller

}

