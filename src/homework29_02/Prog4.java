package homework29_02;
/*4.	Digit SumChallenge
Write a method with the name sumDigits that has one int parameter called number.
If parameter is >= 10 then the method should process the number and return sum
of all digits, otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't
 want to process negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that
it is working correctly for valid and invalid values passed as arguments. */

public class Prog4 {
    public static void main(String[] args) {
        System.out.println(sumDigit(9));
    }

    public static int sumDigit(int number) {
        int num = number;
        int LastDigit, count = 0;

        if (num>=0&&num<=9)
        System.out.println(" as per requirements");

        while (num >= 10) {
            LastDigit = num % 10;
            num = number / 10;
            number = num;
            count = count + LastDigit;

        }
        return count - 1;
    }
}


