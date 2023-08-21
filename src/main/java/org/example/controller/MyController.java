package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/word")
public class MyController {

    @RequestMapping(value="/word", method = RequestMethod.GET)
    public ModelAndView getString() {
        return new ModelAndView("hello");
    }
}
