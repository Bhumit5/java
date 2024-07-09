package Recursion;

import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = input.nextInt();
        input.close();

        int current = N * (N + 1) / 2;

        for (int i = 1; i <= N; i++) {
            int value = current;
            int spaces = N - i;

            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(value);
                if (j < i) {
                    System.out.print(" ");
                }
                value--;
            }

            System.out.println();
            current -= i;
}
}
}