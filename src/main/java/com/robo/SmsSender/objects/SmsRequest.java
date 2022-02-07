package com.robo.SmsSender.objects;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SmsRequest {

    private String phoneNumber;
    private String message;
}
