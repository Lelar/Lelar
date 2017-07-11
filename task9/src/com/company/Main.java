package com.company;
public class Main {

    public static void main(String[] args) {
        boolean b;
        for (int i = 2; i <= 100; i++) {
            b = true;
            for (int j = 2; j <= Math.sqrt(i); j++)
                if ((i%j == 0) && b )
                    b = !b;
            if (b)
            System.out.print(i + " ");
        }
    }
}