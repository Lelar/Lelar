package com.company;

public class Main {

    public static void main(String[] args) {
        boolean b = true;
        double a = 14;
        for (int i = 1;i <= Math.sqrt(a); i++) {
            if ((a%i == 0) && (b == true ))
              //  System.out.println("Число является целым");
                b = false;
              //  System.out.println("Число не является целым");
        }
        if (b) System.out.println("Число является целым");
        if (b == false) System.out.println("Число не является целым");
    }
}
