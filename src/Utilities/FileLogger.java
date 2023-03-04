package Utilities;

import Abstract.Logger;

public class FileLogger implements Logger {

    @Override
    public void Log(String message) {
        System.out.println("Dosyaya loglandı : " + message);
    }

}
