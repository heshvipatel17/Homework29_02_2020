package homework29_02;
/*13.	SharedDigit
Write a method named hasSharedDigitwith two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false. */

public class Prog13 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(10, 22));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99)
            return false;
        while (number1 > 0) {
            int secondNumber = number2;
            int firstNumber = number1 % 10;
            while (secondNumber > 0) {
                if (firstNumber == secondNumber % 10) {
                    return true;
                }
                secondNumber /= 10;
            }
            number1 /= 10;
        }
        return false;
    }
}