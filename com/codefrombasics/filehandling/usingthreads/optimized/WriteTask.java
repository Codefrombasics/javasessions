package com.codefrombasics.filehandling.usingthreads.optimized;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteTask implements Runnable {
    private final List<String> records;
    private final Object lock;

    public WriteTask(List<String> records, Object lock) {
        this.records = records;
        this.lock = lock;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students_concurrent.txt", true))) {
            synchronized (lock) {
                for (String record : records) {
                    writer.write(record);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
