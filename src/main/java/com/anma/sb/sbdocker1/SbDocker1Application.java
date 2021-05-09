package com.anma.sb.sbdocker1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SbDocker1Application {

    public static void main(String[] args) {
        SpringApplication.run(SbDocker1Application.class, args);
    }

}
