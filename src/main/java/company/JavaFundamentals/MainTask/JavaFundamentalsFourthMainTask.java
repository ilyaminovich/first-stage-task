package company.JavaFundamentals.MainTask;

import java.util.Scanner;

public class JavaFundamentalsFourthMainTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of numbers ");
        int amountOfNumbers = scan.nextInt();
        int summa = 0;
        int multiplication = 1;
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.println("Enter a number ");
            int numberForOperation;
            numberForOperation = scan.nextInt();
            summa += numberForOperation;
            multiplication *= numberForOperation;
        }
        System.out.println("Sum of numbers: " + summa);
        System.out.println("Multiplication of numbers:  " + multiplication);
    }
}