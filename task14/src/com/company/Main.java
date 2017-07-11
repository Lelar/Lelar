package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		System.out.println("Введите переменную при X^2");
		double a = in.nextDouble();
		System.out.println("Введите переменную при X");
		double b = in1.nextDouble();
		System.out.println("Введите переменную при 1");
		double c = in2.nextDouble();
		if (a == 0) {
			if (b != 0)
				System.out.println("x = " + -c / b);
			else System.out.println("Корней нет");
		}
		else {
			if (b == 0) {
				if (-c / a > 0) {
					System.out.println("x1 = " + Math.sqrt(-c / a));
					System.out.println("x2 = " + -Math.sqrt(-c / a));
				}
				else if (-c / a == 0)
					System.out.println("x = " + 0.0);
				else
					System.out.println("Корней нет");
			}
			else {
				double D = b*b - 4*a*c;
				if (D > 0) {
					System.out.println("x1 = " + (-b + Math.sqrt(D)) / 2 * a);
					System.out.println("x2 = " + (-b - Math.sqrt(D)) / 2 * a);
				}
				if (D == 0)
					System.out.println("x = " + -b/2*a);
				if (D < 0)
					System.out.println("Корней нет");
			}
		}
	}
}
