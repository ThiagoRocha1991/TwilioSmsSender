package com.robo.SmsSender;

import com.robo.SmsSender.controller.SmsController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmsSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsSenderApplication.class, args);
    }

    @Bean
    CommandLineRunner init(SmsController smsController) {

        return args -> {
            smsController.sendSms();
        };
    }

}
