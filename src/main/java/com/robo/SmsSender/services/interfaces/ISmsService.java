package com.robo.SmsSender.services.interfaces;

import com.robo.SmsSender.objects.SmsRequest;

public interface ISmsService {

  void send(SmsRequest smsRequest);
}
