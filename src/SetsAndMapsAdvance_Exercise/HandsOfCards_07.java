package SetsAndMapsAdvance_Exercise;

import java.util.*;

public class HandsOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> playerHands = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("JOKER")) {
                break;
            }
            String player = input.split(": ")[0];
            String[] cards = input.split(": ")[1].split(", ");
            if (!playerHands.containsKey(player)) {
                Set<String> handOfCards = new HashSet<>(List.of(cards));
                playerHands.put(player, handOfCards);
            } else {
                Set<String> previousHand = new HashSet<>(playerHands.get(player));
                previousHand.addAll(List.of(cards));
                playerHands.put(player, previousHand);
            }
        }

        for (Map.Entry<String, Set<String>> pc : playerHands.entrySet()) {
            Set<String> currSet = pc.getValue();
            int sum = 0;
            for (String card : currSet) {
                int power = getPower(card.substring(0, card.length() - 1));
                int typeMultiplier = getTypeMultiplier(card.charAt(card.length() - 1));

                sum += power * typeMultiplier;
            }
            System.out.printf("%s: %d%n", pc.getKey(), sum);
        }
    }

    private static int getTypeMultiplier(char type) {
        switch (type) {
            case 'S':
                return 4;
            case 'H':
                return 3;
            case 'D':
                return 2;
            case 'C':
                return 1;
            default:
                return 0;
        }
    }

    private static int getPower(String power) {
        switch (power) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return 0;
        }
    }
}
