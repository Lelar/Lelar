package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 5.0;
        if (Math.ceil(a) - a  == 0)
            System.out.println("Число целое");
        else
            System.out.println("Число не целое");
    }
}
