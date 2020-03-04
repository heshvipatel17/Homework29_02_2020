package homework29_02;
/*12. Write a programme to input any number and check if it is prime number or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only.
In other words, prime numbers can't be divided by other numbers than itself or 1.
For example 2, 3, 5, 7, 11, 13, 17	are the prime numbers.) */
import java.util.Scanner;

public class Prog12 {
    public static void main(String args[]) {
        jitu();
    }

    public static void jitu() {
        int a;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        sc.close();
        for (int i = 2; i <= num / 2; i++) {
            a = num % i;
            if (a == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}

