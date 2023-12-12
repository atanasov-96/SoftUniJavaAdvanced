package SetsAndMapsAdvance_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        Map<Character, Integer> symbols = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            char currChar = string.charAt(i);
            if (symbols.containsKey(currChar)) {
                symbols.put(currChar, symbols.get(currChar) + 1);
            } else {
                symbols.put(currChar, 1);
            }
        }

        for (Map.Entry<Character, Integer> symbol : symbols.entrySet()) {
            System.out.printf("%s: %d time/s%n",symbol.getKey(),symbol.getValue());
        }
    }
}
