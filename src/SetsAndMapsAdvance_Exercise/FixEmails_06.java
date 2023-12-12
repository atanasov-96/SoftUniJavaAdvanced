package SetsAndMapsAdvance_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> userEmails = new LinkedHashMap<>();

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("stop")) {
                break;
            }
            String email = scanner.nextLine();


            String[] emailParts = email.split("\\.");
            String host = emailParts[emailParts.length - 1].toLowerCase();

            if (!host.equals("us") && !host.equals("uk") && !host.equals("com")){
                userEmails.put(name,email);
            }
        }
        for (Map.Entry<String,String> kvp : userEmails.entrySet()) {
            System.out.printf("%s -> %s%n", kvp.getKey(), kvp.getValue());
        }
    }
}
