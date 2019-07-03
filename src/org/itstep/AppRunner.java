package org.itstep;


import org.itstep.model.ConnectionData;
import org.itstep.service.FileManagerService;
import org.itstep.util.Randomizer;

import java.util.Date;

public class AppRunner {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ConnectionData connectionData = new ConnectionData();
            connectionData.setSessionId(Randomizer.getRandomNumber(10_000_000, 99_999_999));
            connectionData.setUserLogin(Randomizer.gerRandomString(10));
            connectionData.setTime(new Date() .getTime() - Randomizer.getRandomNumber(0, 1000 * 60 * 60 * 24)) ;
            connectionData.setIp(Randomizer.getRandomNumber(100,225) + "." +
                    Randomizer.getRandomNumber(100,225) + "." +
                    Randomizer.getRandomNumber(100,225) + "." +
                    Randomizer.getRandomNumber(100,225));
            FileManagerService.writeDatatoFile(connectionData, true);

        }
    }
}
