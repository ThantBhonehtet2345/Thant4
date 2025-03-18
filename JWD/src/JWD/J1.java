package JWD;

public class J1 {
    public static void main(String[] args) {
        int value1 = 10, value2 = 20, value3 = 15;

        
        int max = (value1 > value2) ? value1 : value2;

   
        max = (max > value3) ? max : value3;

 
        System.out.println("The maximum value is: " + max);
    }
}