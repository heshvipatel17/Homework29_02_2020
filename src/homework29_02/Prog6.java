package homework29_02;
/* 6. Write a program in Java to display the pattern like triangle with a number.
   Input number of rows: 10*/

import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        jitu();
    }

    public static void jitu() {
        int a, b, c;

        System.out.print("Input number of rows: ");
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        sc.close();
        for (a = 1; a <= c; a++) {
            for (b = 1; b <= a; b++)
                System.out.print(b);
            System.out.println();

        }
    }
}