package com.robo.SmsSender.services;

import com.robo.SmsSender.configuration.TwilioConfiguration;
import com.robo.SmsSender.objects.SmsRequest;
import com.robo.SmsSender.services.interfaces.ISmsService;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService implements ISmsService {

    @Autowired
    private TwilioConfiguration twilioConfiguration;

    public SmsService(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void send(SmsRequest smsRequest) {

        Message message = Message.creator(
                        new PhoneNumber(smsRequest.getPhoneNumber()),
                        new PhoneNumber(twilioConfiguration.getTrialNumber()),
                        smsRequest.getMessage())
                .create();

    }
}
