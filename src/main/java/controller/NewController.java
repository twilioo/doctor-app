package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import payload.SmsRequest;
import service.SmsService;

@RestController
@RequestMapping("/a")
public class NewController {

    @Autowired
    private SmsService smsService;

    @PostMapping("/send")
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        smsService.sendSms(smsRequest.getTo(), smsRequest.getBody());
    }
}
