package Utilities;

import Abstract.Logger;

public class DatabaseLogger implements Logger {

    @Override
    public void Log(String message) {
        System.out.println("DataBase loglandı :" + message);
    }

}
