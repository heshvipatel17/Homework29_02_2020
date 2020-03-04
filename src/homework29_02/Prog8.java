package homework29_02;
/*8. Display right angle triangle of @ using nested for loops*/

public class Prog8 {
    public static void main(String[] args) {
        Prog8 obj = new Prog8();
        obj.jitu();

    }

    public void jitu() {
        for (int a = 0; a <= 5; a++) {
            for (int b = 0; b < 0; b++) {
                System.out.println("");
            }
            for (int c = 0; c < (a * 1 - 0); c++) {
                System.out.print("@");
            }
            System.out.println();

        }
    }
}