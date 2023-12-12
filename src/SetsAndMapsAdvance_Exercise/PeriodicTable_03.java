package SetsAndMapsAdvance_Exercise;

import java.util.*;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countElements = Integer.parseInt(scanner.nextLine());

        Set<String> periodicTable = new TreeSet<>();

        for (int element = 0; element < countElements; element++) {
            String[] elements = scanner.nextLine().split("\\s+");
            periodicTable.addAll(Arrays.asList(elements));
        }
        periodicTable.forEach(el -> System.out.print(el + " "));
    }
}
