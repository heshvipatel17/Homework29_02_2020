package homework29_02;
/*14. Write a program in Java to display the pattern like a diamond.
While loop */
import java.util.Scanner;

public class Prog14 {
    public static void main(String args[]) {
        jitu();
    }
    public static void jitu(){
        int i,j,r;
        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        for(i=0;i<=r;i++)
        {
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=r-1;i>=1;i--)
        {
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}

