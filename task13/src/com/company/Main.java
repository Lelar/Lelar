package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	boolean b = true;
    	double k = Math.round(65 + Math.random()*25);
    	String Str2 = "" + (char)k;
    	System.out.println(Str2);
		while (b) {
			Scanner in = new Scanner(System.in);
			System.out.println("Введите букву");
			String Str = new String(in.next());
			if ((Str.length() > 1)) System.out.println("Нужна буква!!!");
			else {
				if(Str.equals(Str2)) {
					System.out.print("Right");
					b = false;
				}
				if (Str.compareTo(Str2) > 0)
					System.out.println("You're too high");
				if (Str.compareTo(Str2) < 0)
					System.out.println("You're too low");
			}
		}
	}
}
