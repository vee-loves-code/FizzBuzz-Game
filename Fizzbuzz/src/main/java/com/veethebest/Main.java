package com.veethebest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number ");
        number = scanner.nextByte();

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("Fizzbuzz");
        else if (number % 3 == 0)
            System.out.println("Fizz");
        else if (number % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
