package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean ifContinue = true;
        Party party = new Party();
        Scanner scanner = new Scanner(System.in);


        while (ifContinue){

            System.out.println("Wybierz opcje:");
            System.out.println("1. Wyswietl listę gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyswietl posiłki");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Znajdz po imieniu");
            System.out.println("6. Wyjdź z aplikacji");

            int userChoice = scanner.nextInt();

            switch (userChoice){

                case 1-> party.displayGuest();
                case 2-> party.addGuest();
                case 3-> party.displayMeals();
                case 4-> party.getPhoneToGuest();
                case 5-> party.getNameToGuest();
                case 6-> ifContinue = false;







            }








        }







    }
}
