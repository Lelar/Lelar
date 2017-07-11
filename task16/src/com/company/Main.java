package com.company;

public class Main {

    public static void main(String[] args) {
        double k [][] = new double [6] [7];
        int l = 0;
        for (int j = 0;j < 6;j++) {
            for (int i = 0; i < 7; i++) {
                k[j][i] = Math.random() * 9;
                System.out.print(k[j][i] + " ");
            }
            System.out.println();
        }
        for (int j = 0;j < 6;j++) {
                double max = k[j][0];
            for (int i = 1;i < 7;i++){
                if (max < k[j][i]){
                    max = k[j][i];
                    l = i;
                }
            }
            k[j][l] = k[j][0];
            k[j][0] = max;
        }
        System.out.println();
        for (int j = 0;j < 6;j++) {
            for (int i = 0; i < 7; i++) {
                System.out.print(k[j][i] + " ");
            }
            System.out.println();
        }
    }
}
