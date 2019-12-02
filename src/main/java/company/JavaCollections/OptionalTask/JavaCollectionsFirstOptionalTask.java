package company.JavaCollections.OptionalTask;

import java.util.Scanner;
import java.util.Stack;

public class JavaCollectionsFirstOptionalTask {
    public static void main(String[] args) {
        Scanner scannerToReverse = new Scanner(System.in);
        System.out.println("Add number to reverse");
        Integer numberToReverse = scannerToReverse.nextInt();
        int reverseNumber = 0;
        int i = 1;

        Stack<Integer> stack = new Stack<>();

        while (numberToReverse > 0) {
            stack.push(numberToReverse % 10);
            numberToReverse /= 10;
        }
        while (!stack.isEmpty()) {
            reverseNumber = reverseNumber + (stack.pop() * i);
            i = i * 10;
        }
        scannerToReverse.close();
        System.out.println("Reverse: " + reverseNumber);
    }
}