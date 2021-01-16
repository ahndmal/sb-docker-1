package com.anma.sb.sbdocker1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePgae(Model model) {
        model.addAttribute("date", LocalDate.now().toString());
        return "home";
    }
}
