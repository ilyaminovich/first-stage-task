package company.JavaFundamentals.MainTask;

import java.util.Scanner;

public class JavaFundamentalsFirstMainTask {
    public static void main(String[] args) {
        Scanner scannerForUserName = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scannerForUserName.nextLine();
        System.out.println("Hello, " + userName);
        scannerForUserName.close();
    }
}