package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean b = true;
        System.out.println("Введите число");
        int a = in.nextInt();
        for (int i = 2;i <= Math.sqrt(a); i++)
            if ((a%i == 0) && b)
                b = !b;


        if (b) System.out.println("Число простое");
        if (!b) System.out.println("Число составное");
    }
}
