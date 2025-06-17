package org.example;

import java.util.Scanner;

public class Sentinel {


    public static void main(String[] args) { //        ********************** HOMEWORK 1: PRIME NUMBERS ***********************************************

        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter any number  to calculate sum(Enter 'n' to stop):  ");
            String userInput = input.next();

            if (userInput.equalsIgnoreCase("n")) {
                break;
            }

            try {
                int number = Integer.parseInt(userInput);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("You entered " + userInput + " which is not a  number.\n" +
                        "Please enter a number to add to the sum, or type 'n' to stop: ");

            }
        }

        System.out.println("The sum of the numbers are : "+ sum);




















    }



}
