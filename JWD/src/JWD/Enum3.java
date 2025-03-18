package JWD;
import java.util.Scanner;

public class Enum3 {
enum Day {
SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public static void main(String args[]) {
	try (Scanner s = new Scanner(System.in)) {
		System.out.println("Enter days name");
		  String d = s.next().toUpperCase(); 

		  for (Day day : Day.values()) { 
			    if (!day.name().equals(d)) {  
			        System.out.println(d + " does not match " );
			        return;
			    }
			}
		
Day day = Day.valueOf(d);
switch (day) {
case SUNDAY:
case SATURDAY:
System.out.println("Sunday is best");
break;
case MONDAY:
System.out.println("Monday is bad");
break;
default:
System.out.println("Other day are not bad");



}
	}
}
}