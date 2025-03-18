package JWD;


import java.util.Scanner;

class CharacterCounter {
   String word;
   char character;

  
    public CharacterCounter(String word, char character) {
        this.word = word;
        this.character = character;
    }

    public int countOccurrences() {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

 
    public void displayCount() {
        System.out.println("The character '" + character + "' appears " + countOccurrences() + " time(s).");
    }
}

public class Tfile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String inputWord = scan.next();

        System.out.print("Enter the character you'd like to count: ");
        char inputChar = scan.next().charAt(0);

  
        CharacterCounter counter = new CharacterCounter(inputWord, inputChar);
        counter.displayCount();

        scan.close();
    }
}