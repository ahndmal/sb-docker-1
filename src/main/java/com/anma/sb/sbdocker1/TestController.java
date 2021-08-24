package com.anma.sb.sbdocker1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final Logger LOGGER = LogManager.getLogger(TestController.class);

    @Value("${db.url}")
    private String DB_URL;

    @Value("${db.name}")
    private String DB_NAME;

    @GetMapping("/test")
    public String testPage() {
        LOGGER.info("********* Property DB Name is " + DB_NAME);
        LOGGER.info("********* Property DB URL is " + DB_URL);
        return "{\"name\": \"Vasyl\"}";
    }
}
