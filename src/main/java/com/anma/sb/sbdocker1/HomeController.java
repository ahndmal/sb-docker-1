package com.anma.sb.sbdocker1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage(Model model) {

        List<LocalDate> weekDates = new ArrayList<>();
        LocalDate now = LocalDate.now();
        weekDates.add(now);

        for (int i = 1; i <= 7; i++) {
            weekDates.add(now.minusDays(i));
        }
        model.addAttribute("weekDates", weekDates);

        return "home";
    }
}
