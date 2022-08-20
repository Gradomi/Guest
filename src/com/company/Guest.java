package com.company;

public class Guest {

    private String name;
    private String lastName;
    private int age;
    private String meal;
    private int phoneNumber;


    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Guest(String name, String lastName, int age, String meal, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
    }

    public void displayInformation(){
        System.out.println("Imie  " + getName());
        System.out.println("Nazwisko  " + getLastname());
        System.out.println("Wiek  " + getAge());
        System.out.println("Posiłek  " + getMeal());
        System.out.println("Numer telefonu  " + getPhoneNumber());

    }


}
