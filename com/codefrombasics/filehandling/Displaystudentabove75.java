package com.codefrombasics.filehandling;

import com.codefrombasics.filehandling.model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Displaystudentabove75 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Read the file and store records in the ArrayList
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\javasessions\\com\\codefrombasics\\filehandling\\students.txt"))) {
            String line;
            boolean isHeader = true; // Flag to skip the header line
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue; // Skip the header line
                }
                String[] parts = line.split(",");
                int studentId = Integer.parseInt(parts[0]);
                String studentName = parts[1];
                int marks = Integer.parseInt(parts[2]);
                String subject = parts[3];
                students.add(new Student(studentId, studentName, marks, subject));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print students who scored more than 75 marks
        for (Student student : students) {
            if (student.marks() > 75) {
                System.out.println("Student ID: " + student.studentId()
                        + ", Name: " + student.studentName()
                        + ", Marks: " + student.marks()
                        + ", Subject: " + student.subject());
            }
        }
    }
}
