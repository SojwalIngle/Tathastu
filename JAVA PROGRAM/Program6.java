package com.company;
import java.util.Scanner;
public class Program6 {
        public static void main(String[] ar) {
            int n=4;
            for(int i=1;i<=n;i++){
                for(int j=5;j>i;j--){
                    System.out.print(" ");
                }

                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");

                }
                System.out.println("");
            }

            for(int i=5;i>1;i--){
                for(int j=5;j>i;j--){
                    System.out.print(" ");
                }

                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");

                }
                System.out.println("");
            }
        }
    }

