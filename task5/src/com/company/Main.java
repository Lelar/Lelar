package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        String s = "" + a;
        int [] b = new int [s.length()];
        int c = 0;
        for (int i = 0; i<s.length() ;i++){
            b[i] = a%10;
            a = a/10;
            c = c + b[i];
        }
        System.out.println(c);
    }
}
