package main.java.company.JavaFundamentals.MainTask;

import java.util.Scanner;

public class JavaFundamentalsThirdMainTask {
    public static void main(String[] args) {
        Scanner scannerForRandom = new Scanner(System.in);
        System.out.println("Enter the amount of random numbers:");
        int amountOfRandomNumbers = scannerForRandom.nextInt();
        int maximumValueForRandom = 100;
        int minimumValueForRandom = 0;
        for (int i = 0; i < amountOfRandomNumbers; i++) {
            int randomResult = minimumValueForRandom + (int) (Math.random() * maximumValueForRandom);
            System.out.print(randomResult + " ");
        }
        for (int i = 0; i < amountOfRandomNumbers; i++) {
            int rnd = minimumValueForRandom + (int) (Math.random() * maximumValueForRandom);
            System.out.println("\n Random number:" + rnd);
            scannerForRandom.close();
        }
    }
}