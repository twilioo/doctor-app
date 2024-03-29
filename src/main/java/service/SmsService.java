package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SmsService {

    @Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    @Value("${twilio.phoneNumber}")
    private String twilioPhoneNumber;

    public void sendSms(String to, String body) {

        try {
            Twilio.init(accountSid, authToken);


            Message message = Message.creator(
                            new PhoneNumber(to),
                            new PhoneNumber(twilioPhoneNumber),
                            body)
                    .create();

            System.out.println("SID: " + message.getSid());
        } catch (Exception e) {
            // Handle the exception (e.g., log it)
            e.printStackTrace();
        }
    }
}
