package homework29_02;
/* Read the numbers from the console entered by the user and print the minimum
 and maximum number the user hasentered.
-Before the user enters the number, print the message •Enter number: •
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.*/
import java.util.Scanner;

public class Prog2 {

    public static void main(String[] args) {
        min();
    }

    public static void min() {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number(to exit enter any letter):");
            boolean isAnint = sc.hasNextInt();
            if (isAnint) {
                int number = sc.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
        }
        System.out.println("min=" + min + " max=" + max);
        sc.close();
    }
}



