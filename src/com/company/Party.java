package com.company;

import java.util.*;

public class Party {


    List<Guest> guests = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Set<String> meals = new HashSet<>();
    Map<Integer, Guest> phoneToGuest = new HashMap<>();
    Map<String, Guest> nameToGuest = new HashMap<>();
    public void addGuest(){
        System.out.println("Podaj imie");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();

        System.out.println("Podaj jedzenie");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Podaj wiek");
        int age = Integer.valueOf(scanner.nextLine());

        Guest guest = new Guest(name, lastName, age, meal, phoneNumber);
        guests.add(guest);
        meals.add(meal);
        phoneToGuest.put(phoneNumber,guest);
        nameToGuest.put(name, guest);


    }

   public void displayGuest() {
       for (Guest guest : guests) {
           guest.displayInformation();
       }
   }
   public void displayMeals(){
            for (String meal : meals){
                System.out.println(meals);
            }
       }
   public void getPhoneToGuest(){
       System.out.println("Podaj nr telefonu");
        Scanner scanner = new Scanner(System.in);
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());

        Guest guest = phoneToGuest.get(phoneNumber);

        guest.displayInformation();
   }

   public void getNameToGuest(){
       System.out.println("Podaj imie");
       String name = scanner.nextLine();

       Guest guest = nameToGuest.get(name);
       guest.displayInformation();


   }





}
