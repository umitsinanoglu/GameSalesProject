package Utilities;

import Abstract.Logger;

public class EmailLogger implements Logger {

    @Override
    public void Log(String message) {
        System.out.println("Email gönderildi : " + message);
    }

}
