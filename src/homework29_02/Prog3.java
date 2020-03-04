package homework29_02;
/* 3. Write a Java program that takes the user to provide a single character from the alphabet.
 Print Vowel of Consonant, depending on the user input. If the user input Is not a letter
 (between a and z or A and Z), or is a string of length > 1, print an error message.
For eg: Input an alphabet: p
Expected Output: Input letter is Consonant */

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Prog3 obj = new Prog3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an Alphabet : ");
        char c = sc.next().charAt(0);
        obj.jitu(c);
        sc.close();
    }

    public void jitu(char c) {

        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            System.out.println("Input letter is Vowel");
        } else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            System.out.println("Input letter is Consonant");

        } else
            System.out.println("error: Enter Alphabet only");
    }
}

