package mh.cyber.root;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        char grade;
        String message;

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
            message = "Well done";
        } else if (marks >= 80) {
            grade = 'B';
            message = "Well done";
        } else if (marks >= 70) {
            grade = 'C';
            message = "Needs improvement";
        } else if (marks >= 60) {
            grade = 'D';
            message = "Needs improvement";
        } else {
            grade = 'F';
            message = "Failed";
        }


        System.out.println(grade + " : " + message);

        sc.close();
    }
}
