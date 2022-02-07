package com.robo.SmsSender.controller;

import com.robo.SmsSender.objects.SmsRequest;
import com.robo.SmsSender.services.SmsService;
import com.robo.SmsSender.services.interfaces.ISmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SmsController {

    @Autowired
    private ISmsService iSmsService;

    public SmsController(ISmsService iSmsSender) {
        this.iSmsService = iSmsSender;
    }

    public void sendSms() {

        SmsRequest smsRequest = new SmsRequest();

        String sms = "Teste de envio SMS Twilio";
        String phone = ""; // Telefone destino

        smsRequest.setPhoneNumber(phone);
        smsRequest.setMessage(sms);

        iSmsService.send(smsRequest);

    }
}
