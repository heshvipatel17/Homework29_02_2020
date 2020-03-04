package homework29_02;
/*15.	Display left angle triangle of * using nested for loops*/

public class Prog15 {
    public static void main(String[] args) {
        jitu();
    }

    public static void jitu() {

        // n is number of rows
        final int n = 5;

        // Run loop n times
        for (int i = 1; i <= n; i++) {
            // Loop for printing space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            // Loop for printing '*'
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }

            // Move to the next row
            System.out.print(System.lineSeparator());
        }
    }
}