package com.codefrombasics.filehandling.usingthreads;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentFileWriter {
    public static void main(String[] args) {
        String[] records = {
                "1,Rajesh Kumar,82,Math",
                "2,Pooja Singh,74,Science",
                "3,Amit Sharma,89,History",
                "4,Anita Desai,65,English",
                "5,Vikram Rao,92,Math",
                "6,Neha Verma,78,Science",
                "7,Ravi Patel,55,History",
                "8,Deepika Mehta,80,English",
                "9,Arjun Gupta,70,Math",
                "10,Kavita Reddy,85,Science"
        };

        long startTime = System.currentTimeMillis();

        Object lock = new Object();
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (String record : records) {
            executor.submit(new WriteTask(record, lock));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {}

        long endTime = System.currentTimeMillis();
        System.out.println("Concurrent Write Time: " + (endTime - startTime) + " ms");
    }
}

class WriteTask implements Runnable {
    private final String record;
    private final Object lock;

    public WriteTask(String record, Object lock) {
        this.record = record;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("students_concurrent.txt", true))) {
                writer.write(record);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

