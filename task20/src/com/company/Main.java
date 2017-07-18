package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String Str[] = new String [a];
        for (int i = 0;i < a;i++) {
            System.out.println("Введите фамилию и число от 1 до 5 через пробел");
            Scanner in1 = new Scanner(System.in);
            Str[i] = in1.nextLine();
        }
        for (int j = 0;j < a;j++){
            char ch1 = Str[j].charAt(Str[j].length() - 1);
            int chr1 = (int)ch1;
            for (int i = j + 1;i < a;i++) {
                char ch = Str[i].charAt(Str[i].length() - 1);
                int chr = (int)ch;
                if (chr >= chr1 ) {
                    chr1 = chr;
                    String Str2 = Str[j];
                    Str[j] = Str[i];
                    Str[i] = Str2;
                }
            }

        }
        for (int i = 0;i < a;i++)
            System.out.println(Str[i]);
    }
}
