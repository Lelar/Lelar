package com.company;

public class Main {

    public static void main(String[] args) {
	final int n = 50000;
	int j = 0;
	for (int i = 1 ; i <= n ; i++) {
		int k = i;
		boolean b = true;
	    while(k > 0) {
	        if ((k%10 == 2) && (b)) {
				j = j + 1;
				b = !b;
			}
	        k = k/10;
        }
    }
    System.out.print(j);
    }
}
