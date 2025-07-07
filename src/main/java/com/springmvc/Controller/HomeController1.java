package com.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home1")
public class HomeController1 {
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
        return "demo";
    }
//    | Method  | Purpose                 | Spring Annotation          |
//    | ------- | ----------------------- | -------------------------- |
//    | GET     | Read / Fetch data       | `@GetMapping`              |
//    | POST    | Create / Submit data    | `@PostMapping`             |
//    | PUT     | Update full resource    | `@PutMapping`              |
//    | PATCH   | Update part of resource | `@PatchMapping`            |
//    | DELETE  | Delete resource         | `@DeleteMapping`           |
//    | HEAD    | Headers only, no body   | (custom `@RequestMapping`) |
//    | OPTIONS | List allowed methods    | (custom `@RequestMapping`) |

}
