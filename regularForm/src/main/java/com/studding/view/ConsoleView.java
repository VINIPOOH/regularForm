package com.studding.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConsoleView {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ukr", "UKR"));  // Ukrainian
    //new Locale("en"));        // English

    public void printMessage(String message){
        System.out.println(message);
    }

}
