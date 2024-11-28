package Probelms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        double harmonic = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonic += 1.0 / i;
        }

        System.out.println("The " + N + "th Harmonic Value is: " + harmonic);
        scanner.close();
    }
}
