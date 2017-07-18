package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s2 = "";
        System.out.println("Введите число");
        int a = in.nextInt();
        String s1 = "" + a;
        int b = s1.length();
        int [] c = new int[b];
        for (int i = 0;i < b ; i++) {
            c[i] = a%10;
            a = a/10;
            s2 = s2 + c[i] ;
        }
        //System.out.println(s2);
        if (s2.equals(s1))
            System.out.println("Палиндром");
        else
            System.out.println("Не палиндром");
    }
}
