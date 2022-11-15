package com.example.fursa.JenkinsClosingTask;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@RestController
public class xml {

    @GetMapping
    public ModelAndView table(Model model) throws IOException {
        RR fd = new RR();
        List l = fd.importData();
        model.addAttribute("data",l);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("table");
        return modelAndView;
    }
}