package homework29_02;
/* 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/

public class Prog9 {
    public static void main(String[] args) {
        jitu();
    }

    public static void jitu() {
        int a = 1, b = 1;
        System.out.println("Fibonacci Sequence Number :");
        for (int c = 1; c <= 8; c++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}

