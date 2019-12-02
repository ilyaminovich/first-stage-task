package main.java.company.JavaCollections.OptionalTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaCollectionThirdOptionalTask {
    public static void main(String[] args) {
        try {
            File file = new File("E:/Projects/src/main/java/company/JavaCollections/OptionalTask/newfile.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<String> list = new ArrayList<>();
            System.out.println("Strings in the file: ");
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
                System.out.println(list.get(list.size() - 1));
            }
            scanner.close();
            System.out.println("Strings in the reverse order: ");
            FileWriter fileWriter = new FileWriter(file);
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
                fileWriter.append(list.get(i) + "\n");
            }
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
