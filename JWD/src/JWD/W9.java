package JWD;

import java.util.Scanner;

public class W9 {
 
    public static String scrambleWord(String word) {
        if (word.length() < 4) {
            return word;
        }

        
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        
 
        String middle = word.substring(1, word.length() - 1);
        char[] middleChars = middle.toCharArray();
        
       
        for (int i = 0; i < middleChars.length / 2; i++) {
            char temp = middleChars[i];
            middleChars[i] = middleChars[middleChars.length - 1 - i];
            middleChars[middleChars.length - 1 - i] = temp;
        } 
        
        
        return first + new String(middleChars) + last;
    }
    
    

    public static String scrambleText(String text) {
        String[] words = text.split(" ");
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(scrambleWord(words[i]));
            
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");

        String input = scanner.nextLine();
        
        

        String scrambled = scrambleText(input);
        System.out.println("Scrambled text: " + scrambled);

        scanner.close();
    }
}