package com.company;
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = sc.nextInt();
        int k = num - r;
        System.out.println(" "+permute(num,k));
        System.out.println(" "+combination(num, r, k));
    }

    static int fact(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    static int permute(int num,int k) {
        int result;
        int a = fact(num);
        int c = fact(k);
        result = a / c;
        return result;
    }

    static int combination(int num, int r, int k) {
        int result;
        int a = fact(num);
        int b = fact(r);
        int c = fact(k);
        result = a/(b * c);
        return result;

    }
}
