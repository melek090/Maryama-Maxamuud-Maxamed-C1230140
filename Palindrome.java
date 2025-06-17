package org.example;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {






            //        ********************** HOMEWORK 2: Palindrom ***********************************************




            System.out.println("------ This program will check if string is palindrom--------");
            System.out.println();

            Scanner input = new Scanner(System.in);

            System.out.println("Enter anythis to check if it a palindrom: ");

            String palindrom = input.nextLine();

            String IsPalindrom = palindrom.toLowerCase();

            int lcv = 0, Backword = IsPalindrom.length() - 1;
            while (lcv < Backword) {

                if (IsPalindrom.charAt(lcv) != IsPalindrom.charAt(Backword)) {

                    System.out.println("Oops!!!!  NOT a palindrom");
                    break;
                }

                lcv++;
                Backword--;

                if (lcv >= Backword) {
                    System.out.println("GREAT WORK!!!!!!!!!!!!!!!  it is a palindrom");
                }
            }


        }

    }


