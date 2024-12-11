package com.codefrombasics.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Myfile.txt"))) {
            writer.write("Good Morning Happy Weekend");
            writer.newLine();
            writer.write("Welcome to file handling in Java.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

