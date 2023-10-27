package org.example.emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email tosin = new Email("Ajibade","Tosin");

//        tosin.setAlternateEmail("tossynajib@gmail.com");
//        System.out.println("Alternate email is: " + tosin.getAlternateEmail());
        System.out.println(tosin.showinfo());
    }
}
