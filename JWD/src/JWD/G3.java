package JWD;

public class G3 {

public static void main(String [] args) {

sum(2,3);
sum(2.8,5);
sum(7.9,6.9);

}
public static<T extends Number> void sum(T num1,T num2){
double result=num1.doubleValue()+num2.doubleValue();
System.out.println(result);

}

}