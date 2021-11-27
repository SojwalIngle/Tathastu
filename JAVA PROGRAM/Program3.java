package com.company;

// calculate a Factorial of a number.
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no whose factorial you want: ");
        n = sc.nextInt();
        int fact=1;
        for (int i = n; i > 0 ; i--)
        {
            fact= fact * i;
        }
        System.out.println("factorial of given number is : "+fact);
    }
}
