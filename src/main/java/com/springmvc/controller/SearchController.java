package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping(value = "/search",params = "!queryBox")
    public String search() {
        return "Search";
    }

    @RequestMapping(value="/search" ,params = "queryBox")
    public RedirectView search(@RequestParam(value = "queryBox") String query) {
        RedirectView redirectView = new RedirectView();
        String url = "https://www.google.com/search?q=" + query;
        redirectView.setUrl(url);
        return redirectView;
    }

}
