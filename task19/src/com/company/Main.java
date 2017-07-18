package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int inputNum = getInputNum();
        String roman = getRoman(inputNum);

        System.out.print(roman);
    }
//change
    private static String getRoman(int inputNum) {
        int[] nums = separate(inputNum);

        String STR = "";
        if (inputNum == 100)
            STR = "C";
        else {
            if (inputNum < 100) {
                if (nums.length != 1) {
                    switch (nums[0]) {
                        case 9:STR = STR + "XC";break;
                        case 8:STR = STR + "LXXX";break;
                        case 7:STR = STR + "LXX";break;
                        case 6:STR = STR + "LX";break;
                        case 5:STR = STR + "L";break;
                        case 4:STR = STR + "XXXX";break;
                        case 3:STR = STR + "XXX";break;
                        case 2:STR = STR + "XX";break;
                        case 1:STR = STR + "X";break;
                    }
                    switch (nums[1]) {
                        case 9:STR = STR + "IX";break;
                        case 8:STR = STR + "VIII";break;
                        case 7:STR = STR + "VII";break;
                        case 6:STR = STR + "VI";break;
                        case 5:STR = STR + "V";break;
                        case 4:STR = STR + "IV";break;
                        case 3:STR = STR + "III";break;
                        case 2:STR = STR + "II";break;
                        case 1:STR = STR + "I";break;
                    }
                } else switch (nums[1]) {
                    case 9:STR = STR + "IX";break;
                    case 8:STR = STR + "VIII";break;
                    case 7:STR = STR + "VII";break;
                    case 6:STR = STR + "VI";break;
                    case 5:STR = STR + "V";break;
                    case 4:STR = STR + "IV";break;
                    case 3:STR = STR + "III";break;
                    case 2:STR = STR + "II";break;
                    case 1:STR = STR + "I";break;
                }
            }
        }
        return STR;
    }

    private static int[] separate(int inputNum) {
        int d = inputNum;
        String Str = "" + inputNum;
        int m[] = new int [Str.length()];
        for (int i = Str.length() - 1;i >=0 ;i--) {
            m[i]= d%10;
            d = d/10;
        }
        return m;
    }

    private static int getInputNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        return in.nextInt();
    }
}