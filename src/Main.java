import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> playerHands = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("JOKER")) {
                break;
            }
            String player = input.split(": ")[0];
            String[] cards = input.split(": ")[1].split(", ");
            if (!playerHands.containsKey(player)) {
                Map<String, Integer> cardValues = new HashMap<>();
                for (String card : cards) {
                    int truePower = getTruePower(card.substring(0, card.length() - 1));
                    char type = card.charAt(card.length() - 1);
                    int typeStrength = getTypeStrength(type);
                    int cardValue = truePower * typeStrength;
                    cardValues.put(card, cardValue);
                }
                playerHands.put(player, cardValues);
            } else {
                Map<String, Integer> previousValues = playerHands.get(player);
                for (String card : cards) {
                    int truePower = getTruePower(card.substring(0, card.length() - 1));
                    char type = card.charAt(card.length() - 1);
                    int typeStrength = getTypeStrength(type);
                    int cardValue = truePower * typeStrength;
                    previousValues.put(card, cardValue);
                }
                playerHands.put(player, previousValues);
            }
        }

        for (Map.Entry<String, Map<String, Integer>> pc : playerHands.entrySet()) {
            Map<String, Integer> cardValues = pc.getValue();
            int sum = cardValues.values().stream().mapToInt(Integer::intValue).sum();
            System.out.printf("%s: %d%n", pc.getKey(), sum);
        }
    }

    private static int getTruePower(String power) {
        switch (power) {
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "10": return 10;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            case "A": return 14;
            default: return 0; // Invalid power, skip
        }
    }

    private static int getTypeStrength(char type) {
        switch (type) {
            case 'S': return 4;
            case 'H': return 3;
            case 'D': return 2;
            case 'C': return 1;
            default: return 0; // Invalid type, skip
        }
    }
}
