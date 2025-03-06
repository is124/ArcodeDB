package com.arcode.app;

import com.arcode.engine.BPlusTree;
import com.arcode.engine.StorageEngine;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("🔹ArcodeDB - Simple NoSQL Database🔹");

        StorageEngine storageEngine = new StorageEngine("database_log.txt", "database_index.txt");


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose operation: [1] Insert, [2] Retrieve, [3] Exit");
            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    // Store data
                    case "1":
                        System.out.print("Enter data to store: ");
                        String data = scanner.nextLine();
                        storageEngine.storeData(data);
                        System.out.println("✅ Data stored successfully.");
                        break;

                    // Retrieve data
                    case "2":
                        System.out.print("Enter key to retrieve: ");
                        String key = scanner.nextLine();
                        String result = storageEngine.retrieveData(key);
                        if (result != null) {
                            System.out.println("🔎 Found: " + result);
                        } else {
                            System.out.println("❌ No record found.");
                        }
                        break;

                    // Exit
                    case "3":
                        storageEngine.close();
                        System.out.println("🚀 Exiting ArcodeDB.");
                        return;

                    default:
                        System.out.println("❌ Invalid choice. Try again.");
                }
            } catch (IOException e) {
                System.out.println("⚠️ Error: " + e.getMessage());
            }
        }
    }
}
