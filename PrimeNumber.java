package org.example;

import java.util.Scanner;

public class PrimeNumber {


    public static void main(String[] args) {



        //        ********************** HOMEWORK 1: PRIME NUMBERS ***********************************************

        System.out.println("This program checks if a number is prime.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to check if it is a prime no:");
        int number = input.nextInt();


        boolean Isprime  = true;

        for(int i = 2; i<number; i++){
            if(number%2==0){
                Isprime = false;
                System.out.print("Is number " + number + "prime number ?: (true/false): " + Isprime);
            }
        }System.out.print("Is number " + number + " prime number ?: (true/false) : " + Isprime);






    }
}
