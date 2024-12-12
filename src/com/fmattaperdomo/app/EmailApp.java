package com.fmattaperdomo.app;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Francisco","Matta");
        email.setAlternateEmail("fmp@gmail.com");
        System.out.println(email.getAlternateEmail());
        System.out.println(email.showInfo());
    }
}
