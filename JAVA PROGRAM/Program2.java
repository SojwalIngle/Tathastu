package com.company;
//calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
import java.util.SortedMap;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0 , y = 1,z = 0;

        System.out.println("Enter the value of n: ");
        int  n = sc.nextInt();
        while(z <= n ) {
            System.out.print(" "+z);
            x = y;
            y = z;
            z = x + y;
        }

    }
}
