package org.example;

import java.util.Scanner;

public class StudentsGradingMnagementSystem {


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        String[] names = new String[100];
        int[] marks = new int[100];
        int totalStudents = 0;
        int option;

        do {
            System.out.println(
                    "\n------ Student Grading Management System -----------\n" +
                            "1. Add Student\n" +
                            "2. Show Report\n" +
                            "3. Search Student\n" +
                            "4. Exit"
            );

            System.out.print("Enter your option (1-4): ");
            option = input.nextInt();

            if (option == 1) {
                System.out.print("How many students do you want to add? ");
                int num = input.nextInt();

                for (int i = 0; i < num; i++) {
                    System.out.print("Enter student name (no spaces are allowed): ");
                    String studentName = input.next();

                    System.out.print("Enter student grade (0 - 100): ");
                    int grade = input.nextInt();

                    if (grade < 0 || grade > 100) {
                        System.out.println("Invalid grade! Please enter between 0 and 100.");
                        i--;
                        continue;
                    }

                    names[totalStudents] = studentName;
                    marks[totalStudents] = grade;
                    totalStudents++;
                }

            } else if (option == 2) {
                if (totalStudents == 0) {
                    System.out.println("no students data is found because you never added one in the first place ");
                }

                else
                {
                    int total = 0;
                    int highest = marks[0];
                    int lowest = marks[0];

                    for (int i = 0; i < totalStudents; i++) {
                        total += marks[i];
                        if (marks[i] > highest) highest = marks[i];
                        if (marks[i] < lowest) lowest = marks[i];
                    }

                    double average = (double) total / totalStudents;

                    System.out.println("\n--- Report ---");
                    System.out.println("Average Grade: " + average);
                    System.out.println("Highest Grade: " + highest);
                    System.out.println("Lowest Grade: " + lowest);
                }

            }
            else if (option == 3) {

                if (totalStudents == 0) {
                    System.out.println("No students data is found because you never stored it ");
                } else {
                    System.out.print("Enter student name to search: ");
                    String searchName = input.next();

                    boolean found = false;

                    for (int i = 0; i < totalStudents; i++) {
                        if (names[i].equalsIgnoreCase(searchName)) {
                            System.out.println("Student is found: " + names[i] + " - Grade: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student aint found.");
                    }
                }

            } else if (option == 4) {
                System.out.println("Exiting the program i seeeeeeeee. Goodbye!!!!!!");
            } else {
                System.out.println("Invalid option!!!!!!. Pls choose between 1 and 4.");
            }

        }
        while (option != 4);

















    }
}
