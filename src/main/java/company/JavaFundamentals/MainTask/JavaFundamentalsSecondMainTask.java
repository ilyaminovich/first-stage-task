package main.java.company.JavaFundamentals.MainTask;

import java.util.Scanner;

public class JavaFundamentalsSecondMainTask {

    public static void main(String[] args) {

        Scanner scannerToReverse = new Scanner(System.in);
        System.out.println("Write number to reverse: ");
        String name = scannerToReverse.nextLine();
        String reverse = new StringBuffer(name).reverse().toString();
        System.out.println("Reverse: " + reverse);
        scannerToReverse.close();
    }
}