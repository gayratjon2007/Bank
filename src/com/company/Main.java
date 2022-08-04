package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(in);
        System.out.println("Welcom to our bank");
        for (; ; ) {
            System.out.println("Next -> 1");
            System.out.println("Exit -> 0");
            System.out.println("= ");
            int n = scanner.nextInt();
            if (n == 1) {
            System.out.println("Name write: ");
            scanner = new Scanner(in);
            String Name = scanner.nextLine();
            System.out.println("Cart number write: ");
            int cart = scanner.nextInt();
            System.out.println("Write money: ");
            int money = scanner.nextInt();
            System.out.println("Year write: ");
            int year = scanner.nextInt();
            double p = 25;
            double res = 0;
            double q = money * p / 100;


            for (int i = 1; i <= year; i++) {
                q *= i;
                res = q + money;


            }

            System.out.println("Mr " + Name + " " + res + " $ ");
        } else if (n == 0 ) {
            break;
        }else {
            System.out.println("Write incorrect number");
        }







    }
}
}