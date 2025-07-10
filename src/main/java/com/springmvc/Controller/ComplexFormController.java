package com.springmvc.Controller;

import com.springmvc.Entities.ComplexForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;

@Controller
public class ComplexFormController {

    @RequestMapping(value = "/ComplexForm", method = RequestMethod.GET)
    public String complexForm(Model model) {
        model.addAttribute("complexForm", new ComplexForm());
        return "ComplexForm";
    }

    @RequestMapping(value = "/ComplexForm", method = RequestMethod.POST)
    public String complexFormSubmit(
            @ModelAttribute("complexForm") @Valid ComplexForm complexForm,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "ComplexForm";
        }

        model.addAttribute("complexForm", complexForm);
        return "outComplexForm";
    }

}

