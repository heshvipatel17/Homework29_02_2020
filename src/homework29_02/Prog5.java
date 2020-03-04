package homework29_02;
/* 5. Write a method called isPalindromewith one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it
should return false. Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.*/

public class Prog5 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(9));
    }
    public static boolean isPalindrome(int number) {

        int reverse = 0;

        int num = number;
        while (num>0||num<0) {
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }

        if (reverse == number) {
            return true;
        } else {
            System.out.println(false+" because reverse is "+reverse+" and that is not equal to "+number);

        }return false;
    }
}

