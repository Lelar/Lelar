package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Введите первое число");
       int a = in.nextInt();
       Scanner in1 = new Scanner(System.in);
       System.out.println("Введите второе число");
       int b = in1.nextInt();
       if (a > b) {
           int k = b;
           b = a;
           a = k;
       }
       new Random().
       double i = a + Math.random() * (b - a);
       System.out.print(Math.floor(i));
    }
}
