package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        System.out.println("Введите сторону");
        int a = in.nextInt();
        System.out.println("Введите сторону");
        int b = in.nextInt();
        System.out.println("Введите сторону");
        int c = in.nextInt();
        if ((a + b > c)&&(a + c > b)&&(b + c > a)){
            if ((b*b+c*c-a*a>0) && (b*b+a*a-c*c>0) && (a*a+c*c-b*b>0))
                System.out.println("Остроугольный");
            if ((b*b+c*c-a*a==0) ||(b*b+a*a-c*c==0) || (a*a+c*c-b*b==0))
                System.out.println("Прямоугольный");
            if ((b*b+c*c-a*a<0) || (b*b+a*a-c*c<0) || (a*a+c*c-b*b<0))
                System.out.println("Тупоугольный");
        }
        else System.out.print("Неверные данные");
    }
}
