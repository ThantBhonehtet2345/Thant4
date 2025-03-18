package JWD;

public class Concatenate1 {
    public static void main(String[] args) {
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi, ").append("mom.");
        String result1 = stringBuilder.toString();
        System.out.println(result1);

      
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hi, ").append("mom.");
        String result2 = stringBuffer.toString();
        System.out.println( result2);

    
        String result3 = String.format("%s%s", "Hi, ", "mom.");
        System.out.println( result3);

     
        String result4 = String.join("", "Hi, ", "mom.");
        System.out.println( result4);
    }
}