package com.codefrombasics.filehandling.usingthreads.optimized;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentFileWriter {
    public static void main(String[] args) {
        List<String> studentRecords = Arrays.asList(
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
        );

        int batchSize = 2;
        Object lock = new Object();
        ExecutorService executor = Executors.newFixedThreadPool(5);

        long startTimes = System.currentTimeMillis();

        for (int i = 0; i < studentRecords.size(); i += batchSize) {
            List<String> batch = studentRecords.subList(i, Math.min(i + batchSize, studentRecords.size()));
            executor.submit(new WriteTask(batch, lock));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {}

        long endTime = System.currentTimeMillis();
        System.out.println("Optimized Concurrent Write Time: " + (endTime - startTimes) + " ms");
    }
}

