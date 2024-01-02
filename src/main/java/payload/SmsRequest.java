package payload;

public class SmsRequest {
    private String to;
    private String body;

    // Default constructor for JSON serialization/deserialization
    public SmsRequest() {
    }

    // Constructor with fields
    public SmsRequest(String to, String body) {
        this.to = to;
        this.body = body;
    }

    // Getters and Setters
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

