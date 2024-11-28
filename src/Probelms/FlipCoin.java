package Probelms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int flips = scanner.nextInt();
        if (flips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int heads = 0;
        for (int i = 0; i < flips; i++) {
            if (Math.random() < 0.5) {
                heads++;
            }
        }

        int tails = flips - heads;
        System.out.println("Heads: " + heads + ", Tails: " + tails);
        System.out.println("Percentage of Heads: " + (heads * 100.0 / flips) + "%");
        System.out.println("Percentage of Tails: " + (tails * 100.0 / flips) + "%");
        scanner.close();
    }
}
