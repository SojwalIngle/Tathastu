package com.company;
import java.util.Scanner;
public class Program4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string you want to check: ");
        String s= sc.next();
        boolean flag= true;
        s = s.toLowerCase();

        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1))
            {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}
