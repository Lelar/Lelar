package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 2 до 100");
        int a = in.nextInt();
        if ((a <= 100) && (a >= 2)) {
            int f, g;
            f = 0;
            g = 1;
            System.out.print(f + " " + g + " ");
            for (int i = 3; i <= a; i++) {
                if (f <= g) {
                    f = f + g;
                    System.out.print(f + " ");
                } else {
                    g = g + f;
                    System.out.print(g + " ");
                }
            }
        }
    }
}
