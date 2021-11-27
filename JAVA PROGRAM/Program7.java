package com.company;

import java.util.Scanner;
import java.lang.String;

//reverse the letters present in the given String.
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        char ch;
        String nstr= " ";
        System.out.println("Enter a string");
        String s = sc.next();

        for (int i = 0; i < s.length(); i++)
            {
                ch= s.charAt(i);
                nstr= ch+nstr;
            }
            System.out.println("Reversed word: "+ nstr);


    }
}
