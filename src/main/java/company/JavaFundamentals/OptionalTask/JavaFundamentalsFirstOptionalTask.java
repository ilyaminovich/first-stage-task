package main.java.company.JavaFundamentals.OptionalTask;

import java.util.Scanner;

public class JavaFundamentalsFirstOptionalTask {
    public static void main(String[] args) {
        Scanner scannerForNumbers = new Scanner(System.in);
        System.out.println("Введите числа через пробел: ");
        String amountOfNumbers = scannerForNumbers.nextLine();
        String[] splitNumbers = amountOfNumbers.split(" ");
        String theLongestNumber;
        String theShortestNumber;
        theLongestNumber = theShortestNumber = splitNumbers[0];

        for (int i = 1; i < splitNumbers.length; i++) {
            if (splitNumbers[i].length() < theShortestNumber.length()) theShortestNumber = splitNumbers[i];
            if (splitNumbers[i].length() > theLongestNumber.length()) theLongestNumber = splitNumbers[i];
        }
        int lengthOfTheShortestNumber = theShortestNumber.length();
        int lengthOfTheLongestNumber = theLongestNumber.length();

        System.out.println("Самое короткое число: " + theShortestNumber);
        System.out.println("Длина самого короткого числа: " + lengthOfTheShortestNumber);
        System.out.println("Самое длинное число: " + theLongestNumber);
        System.out.println("Длина самого длинного числа: " + lengthOfTheLongestNumber);
    }
}