package PatternPrinting.SQUARE.NumberPyramid;

import java.util.Scanner;

public class SquareBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        for (int i = 1; i <= (2 * n - 1); i++) {
            System.out.print("* ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = 4; j <= 4; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
