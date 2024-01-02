package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import payload.SmsRequest;
import service.SmsService;
@RestController
@RequestMapping("/api/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping("/send")
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        smsService.sendSms(smsRequest.getTo(), smsRequest.getBody());
    }


}
