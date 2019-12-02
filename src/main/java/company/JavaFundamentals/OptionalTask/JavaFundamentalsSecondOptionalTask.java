package main.java.company.JavaFundamentals.OptionalTask;

import java.util.Scanner;

public class JavaFundamentalsSecondOptionalTask {
    public static void main(String[] args) {
        Scanner scannerForAmountOfNumbers = new Scanner(System.in);
        System.out.println("Введите числа через пробел: ");
        String amountOfNumbers = scannerForAmountOfNumbers.nextLine();
        String[] splitNumbers = amountOfNumbers.split(" ");
        int sumLengthOfAllNumbers = 0;
        float middleLengthForAllNumbers;
        System.out.println(splitNumbers.length);

        for (int i = 0; i < splitNumbers.length; i++) {
            sumLengthOfAllNumbers = sumLengthOfAllNumbers + splitNumbers[i].length();
        }

        middleLengthForAllNumbers = (float) sumLengthOfAllNumbers / splitNumbers.length;
        System.out.println("Средняя длина по всем числам: " + middleLengthForAllNumbers);

        for (int i = 0; i < splitNumbers.length; i++) {
            if (splitNumbers[i].length() > middleLengthForAllNumbers)
                System.out.println("Число, длина которого больше среднего: " + splitNumbers[i] + " ");
            if (splitNumbers[i].length() > middleLengthForAllNumbers)
                System.out.println("Длина данного числа: " + splitNumbers[i].length() + " ");
        }
    }
}