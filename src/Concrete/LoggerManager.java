package Concrete;

import Abstract.Logger;

public class LoggerManager {
    public static void run(Logger logger, String message) {
        logger.Log(message);
    }
}
