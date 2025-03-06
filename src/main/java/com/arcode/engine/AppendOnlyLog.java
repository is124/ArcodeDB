package com.arcode.engine;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Append-only log to write data
 * Dummy implementation to demonstrate the concept using a simple BufferedWriter
 * It appends data to the log file
 */
public class AppendOnlyLog {

    private BufferedWriter writer;

    public AppendOnlyLog(String filePath) {
        try {
            writer = new BufferedWriter(new FileWriter(filePath, true)); // Keeping the file open for appending
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Append data to the log file
    public void append(String data) throws IOException {
        writer.write(data);
        writer.newLine();
        writer.flush();
    }


    public void close() throws IOException {
        if (writer != null) {
            writer.close();
        }
    }
}
