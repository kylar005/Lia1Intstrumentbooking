package com.example.lia1instrumentbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lia1InstrumentBookingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Lia1InstrumentBookingApplication.class, args);
        CLI cli = context.getBean(CLI.class);
        cli.testMenu();
    }

}
