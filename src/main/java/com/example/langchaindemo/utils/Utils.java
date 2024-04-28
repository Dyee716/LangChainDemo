package com.example.langchaindemo.utils;

import com.example.langchaindemo.AImodel.AImodel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Utils {

    private static String lineSplitter = "==================================================";

    public static void startConversationWith(AImodel model) {
        Logger log = LoggerFactory.getLogger(AImodel.class);
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("User: ");
                String userQuery = scanner.nextLine();
                System.out.println(lineSplitter);

                if ("exit".equalsIgnoreCase(userQuery)) {
                    break;
                }

                String agentAnswer = model.answer(userQuery);
                System.out.println("Assistant: " + agentAnswer);
                System.out.println(lineSplitter);
            }
        }
    }
}
