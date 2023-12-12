package SetsAndMapsAdvance_Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> phonebook = new HashMap<>();

        while (true) {
            String nameAndNumber = scanner.nextLine();
            if (nameAndNumber.equals("search")) {
                break;
            }
            String name = nameAndNumber.split("-")[0];
            String number = nameAndNumber.split("-")[1];
            phonebook.put(name,number);
        }

        while (true) {
            String names = scanner.nextLine();
            if (names.equals("stop")) {
                break;
            }
            if (phonebook.containsKey(names)) {
                System.out.printf("%s -> %s%n",names,phonebook.get(names));
            } else {
                System.out.printf("Contact %s does not exist.%n",names);
            }
        }
    }
}
