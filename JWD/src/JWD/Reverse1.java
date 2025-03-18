package JWD;

public class Reverse1 {
    public static void printReverse(String str) {
       
        if (str == null || str.isEmpty()) {
            System.out.println("");
            return;
        }

        // Print characters backwards
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println(); // New line after printing
    }

    public static void main(String[] args) {
      
        printReverse("Hello");       // Should print "olleH"
        printReverse("Java");        // Should print "avaJ"
        printReverse("");            // Should print nothing (empty line)
        printReverse("A");           // Should print "A"
        printReverse("Hi, mom!");   
        StringBuilder sb = new StringBuilder("Hello");
       System.out.println(sb.reverse());
     // Should print "!mom ,iH"
    }
}