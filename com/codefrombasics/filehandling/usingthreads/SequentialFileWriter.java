package com.codefrombasics.filehandling.usingthreads;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SequentialFileWriter {
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

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students_sequential.txt"))) {
            for (String record : records) {
                writer.write(record);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Sequential Write Time: " + (endTime - startTime) + " ms");
    }
}

