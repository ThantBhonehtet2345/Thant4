package JWD;

import java.util.*;

public class Repeated {
    public static List<Character> findRepeated(String input) {
        // HashMap to store character counts
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            // Autoboxing converts char to Character and int to Integer
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Create list of characters that appear more than once
        List<Character> repeated = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeated.add(entry.getKey());
            }
        }
        
        return repeated;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Get repeated characters
        List<Character> repeatedChars = findRepeated(input);
        
        // Display results
        if (!repeatedChars.isEmpty()) {
            System.out.print("Repeated characters/numbers: ");
            for (int i = 0; i < repeatedChars.size(); i++) {
                System.out.print(repeatedChars.get(i));
                if (i < repeatedChars.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("No repeated characters or numbers found");
        }
        
        scanner.close();
    }
}