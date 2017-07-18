package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        boolean bool = true;
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = in.nextInt();
        double [] arr = new double [a];
        for (int i = 0 ; i < a ; i++){
            arr [i] = r.nextInt();
        }
        while (bool) {
            System.out.println("1.Вывести массив\n2.Увеличить выбранный элемент на 10%\n3.Выход");
            System.out.println("Введите номер действия");
            int b = in.nextInt();
            if (b == 1) {
                for (int i = 0; i < a; i++) {
                    System.out.println(arr[i]);
                }
            }

            if (b == 2) {
                System.out.println("Введите номер элемента");
                int c = in.nextInt();
                arr[c-1] = arr[c-1] * 1.1;
            }

            if (b == 3) bool = !bool;
        }
    }
}
