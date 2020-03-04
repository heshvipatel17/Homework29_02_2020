package homework29_02;
/*11.	Even DigitSum
Write a method named getEvenDigitSumwith one parameter of type int called number.
 The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.*/

public class Prog11 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-252));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }
}
