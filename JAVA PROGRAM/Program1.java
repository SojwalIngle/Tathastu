package com.company;

import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b ,c ;
        System.out.println("Enter two nos: ");
        a = sc.nextInt();
        b = sc.nextInt();

        //Addtion
        c = a + b;
        System.out.println("Addition is: "+c);

        c = a - b;
        System.out.println("Subtraction is: "+c);

        c = a * b;
        System.out.println("Multiplication is: "+c);

        c = a/b;
        System.out.println("Division is : "+ c);

        c = a % b;
        System.out.println("Modulo is : "+ c);


    }
}
