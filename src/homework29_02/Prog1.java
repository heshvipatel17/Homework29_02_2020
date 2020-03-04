package homework29_02;
/* 1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number•. Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message •Enter number #x:•
where x represents the count, i.e. 1, 2, 3, 4, etc. */

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        reading();
    }

    public static void reading() {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        while (a <= 10) {
            System.out.println("Enter number : " + a);
            boolean hasNextInt = sc.hasNextInt();
            a++;
            if (hasNextInt) {
                int number = sc.nextInt();
                sum = sum + number;
            } else {
                System.out.println("Invalid Value ");
            }
            sc.nextLine();
        }
        System.out.println("Your sum is : " + sum);
        sc.close();
    }
}
