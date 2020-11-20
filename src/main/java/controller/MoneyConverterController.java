package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/convert")
public class MoneyConverterController {

    @GetMapping
    public ModelAndView convert(){
        return new ModelAndView("converter");
    }

    @PostMapping
    public ModelAndView convert(@RequestParam double usd, Model model){
        model.addAttribute("usd",usd);
        model.addAttribute("vnd", usd*23000);
        return new ModelAndView("converter");
    }
}
