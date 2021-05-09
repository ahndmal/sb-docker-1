package com.anma.sb.sbdocker1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    final Logger LOGGER = LoggerFactory.getLogger(HomeController.class.getName());

    @GetMapping("/")
    public String getHomePage(Model model) {

        List<LocalDate> weekDates = new ArrayList<>();
        LocalDate now = LocalDate.now();
        weekDates.add(now);

        for (int i = 1; i <= 7; i++) {
            weekDates.add(now.minusDays(i));
        }
        model.addAttribute("weekDates", weekDates);

        LOGGER.info(">>>>>>>>>>> Home page opened");

        return "home";
    }
}
