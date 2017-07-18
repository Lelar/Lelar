package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Введите число");
	double m1 = in.nextDouble();
	double g1,g2;
	g1 = 9.8; g2 = 1.6;
	System.out.println(m1*g1*.17/g2);
    }
}
