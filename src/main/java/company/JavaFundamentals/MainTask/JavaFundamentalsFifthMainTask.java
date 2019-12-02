package main.java.company.JavaFundamentals.MainTask;

import java.util.Scanner;

public class JavaFundamentalsFifthMainTask {
    public static void main(String[] args) {
        Scanner scannerForMonthNumber = new Scanner(System.in);
        System.out.println("Введите число месяца: ");
        int monthNumber = scannerForMonthNumber.nextInt();
        String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("Необходимо ввести число соответствующее числу месяца");
        } else {
            System.out.println("Месяц: " + month[monthNumber - 1]);
        }
    }
}