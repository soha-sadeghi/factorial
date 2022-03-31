package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i,fact=1 ;
        for ( i=1; i<=number; i++)
        {
             fact= i * fact;
        }
        System.out.println(fact);
    }
    }
