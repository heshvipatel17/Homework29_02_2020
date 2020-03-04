package homework29_02;

import java.util.Scanner;

public class ReadingUserInputChallengeExtra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int sum = 0;
        while (x <= 10) {
            System.out.println("Enter number : " + x);
            boolean hasNextInt = sc.hasNextInt();
            x++;
            if (hasNextInt) {
                int number = sc.nextInt();
                sum += number;

            } else {
                System.out.println("Invalid Value ");
            }
            sc.nextLine();
        }
        System.out.println("Your sum is : " + sum);
        sc.close();
    }

}