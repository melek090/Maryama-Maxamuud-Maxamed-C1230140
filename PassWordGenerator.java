package org.example;

import java.util.Scanner;

public class PassWordGenerator {

    public static void main(String[] args) {



        // HOMEWORK 4: PASSWORD GENEREATOR



        Scanner input = new Scanner(System.in);

        // ask the users name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // ask ths user the lenght of their password
        System.out.print("Enter the lenght  ");
        int passwordLength = input.nextInt();


        // all the passible cases as variables

        String lowercases = "abcdefghijklmnopqrstuvwxyz";
        String uppercases = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()-_=+[]{};:,.<>?|`~";

        String allCharacters = lowercases + uppercases + numbers + symbols;

        String finalPassword = " ";

        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = (int)(Math.random() * allCharacters.length());
            char randomCharacter = allCharacters.charAt(randomIndex);
            finalPassword = finalPassword + randomCharacter;
        }

        System.out.println("Hello " + name + "! Your password is: " + finalPassword);








    }
}
