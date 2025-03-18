package JWD;

import java.util.Scanner;

class CharacterClassifier {
    
   
    public  static Object CDT(char character) {
        if (character >= 65 && character <= 90) {
            return "Capital Letter (A-Z)";
        } else if (character >= 97 && character <= 122) {
            return "Small Letter (a-z)";
        } else if (character >= 48 && character <= 57) {
            return "Digit (0-9)";
        } else {
            return "Special Symbol";
        }
    }

    
    public static  Object dR(char C) {
       
    	System.out.println("Character Type: " + CDT(C));
		return C;
        
    }
}

 public class Character {
    public static  void main(String[] args) {
        Scanner s = new Scanner(System.in);

    
        System.out.print("Enter a character: ");
        char inputChar = s.next().charAt(0);


       
        CharacterClassifier.dR(inputChar);
        s.close();

    
    }

	
	}

