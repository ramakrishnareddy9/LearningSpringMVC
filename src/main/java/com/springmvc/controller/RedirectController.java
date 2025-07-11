package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController
{
//    using redirect in return to redirect to other page
    @RequestMapping("/first")
    public String firstHandller() {
        System.out.println( "Redirecting to second page");
        return "redirect:/second";
    }

    @RequestMapping("/second")
    public String secondHandller() {
        System.out.println( "redirected to second page");
        return "";
    }
//    using redirect view in return to redirect to other page
//    @RequestMapping("/first")
//    public RedirectView firstHandller() {
//        System.out.println( "Redirecting to second page");
//        RedirectView redirectView = new RedirectView();
//        redirectView.setUrl("/second");
//        return redirectView;
//    }
//
//    @RequestMapping("/second")
//    public String secondHandller() {
//        System.out.println( "redirected to second page");
//        return "";
//    }
//    using HttpServletResponse in return to redirect to other page this is old methond used in serlvets not recommended
//    @RequestMapping("/first")
//    public void firstHandler(HttpServletResponse response) {
//        System.out.println("Redirecting to second page");
//        try {
//            response.sendRedirect("/second");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @RequestMapping("/second")
//    public String secondHandller() {
//        System.out.println( "redirected to second page");
//        return "";
//    }
}
