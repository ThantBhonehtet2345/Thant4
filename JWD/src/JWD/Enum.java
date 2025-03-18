package JWD;

enum Season { WINTER, SPRING, SUMMER, FALL }
public class Enum{
public static void main(String[] args) {
	
Season s=Season.WINTER;
System.out.println(s);
for (Season ss : Season.values())
System.out.println(ss);
}
}