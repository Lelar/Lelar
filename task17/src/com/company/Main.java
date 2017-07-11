package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int k[] ;
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        String a = new String(""+b);
        k = new int [a.length()];
        String MM [][] = {{"  ***  "," *   * ","*     *","*     *","*     *"," *   * ","  ***  "}
        ,{"  *  "," **  ","  *  ","  *  ","  *  ","  *  "," *** "},{" *** ","*   *","*   *","   * "," *   ","*    ","*****"}
        ,{" *** ","*   *","    *"," *** ","    *","*   *"," *** "},{"    *","   **","  * *"," *  *","*****","    *","    *"}
        ,{"*****","*    ","*    ","**** ","    *","*   *"," *** "}
        ,{" *** ","*   *","*    ","**** ","*   *","*   *"," *** "},{"*****","    *","   * ","  *  "," *   ","*    ","*    "}
        ,{" *** ","*   *","*   *"," *** ","*   *","*   *"," *** "},{" *** ","*   *","*   *"," ****","    *","*   *"," *** "}};
         for(int i = a.length()-1;i >= 0;i--){
            k[i] = b%10;
            b = b/10;
        }
            for (byte i = 0; i < 7; i++) {
                for (byte j = 0;j < a.length();j++) {
                    System.out.print(MM[k[j]][i] + '\t');
                }
                System.out.println();
            }
        }
    }
