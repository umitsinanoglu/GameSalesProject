package Utilities;

import Abstract.Logger;

public class SmsLogger implements Logger {

    @Override
    public void Log(String message) {
        System.out.println("SMS gönderildi : " + message);
    }
}
