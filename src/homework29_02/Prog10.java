package homework29_02;
/*10.	Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:  (1*1*1)=1 (5*5*5)=125 (3*3*3)=27
So:  1+125+27=153  */

import java.util.Scanner;

public class Prog10 {

    public static void main(String[] args) {
        jitu();
    }

    public static void jitu() {

        int num, number, temp, total = 0;

        System.out.println("Enter 3 Digit Number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        number = num;

        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number /= 10;
        }

        if (total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
