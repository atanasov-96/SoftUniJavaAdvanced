package SetsAndMapsAdvance_Exercise;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setsSize = scanner.nextLine();
        int firstSetSize = Integer.parseInt(setsSize.split("\\s+")[0]);
        int secondSetSize = Integer.parseInt(setsSize.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        for (int i = 0; i < firstSetSize; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }

        Set<Integer> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        Set<Integer> repeatingElements = new LinkedHashSet<>();
        for (Integer firsElement : firstSet) {
            if (secondSet.contains(firsElement)) {
                repeatingElements.add(firsElement);
            }
        }
        for (Integer repeatingElement : repeatingElements) {
            System.out.print(repeatingElement + " ");
        }
    }
}
