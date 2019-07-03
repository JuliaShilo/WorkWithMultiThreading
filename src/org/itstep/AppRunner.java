package org.itstep;


import org.itstep.model.ConnectionData;
import org.itstep.service.FileManagerService;
import org.itstep.util.Randomizer;

import java.util.Date;

public class AppRunner {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            AppMultiRunner appMultiRunner = new AppMultiRunner();
            appMultiRunner.start();
        }
    }
}
