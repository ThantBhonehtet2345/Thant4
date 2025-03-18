package JWD;


public class MethodAndParam {
	public static void main(String[] agrs) {
		System.out.println(methodA("David"));
		
		MethodAndParam2 obj1=new MethodAndParam2();
		System.out.println(obj1.methodB("David"));
		
		
		MethodAndParam obj=new MethodAndParam();
		System.out.println(obj.methodC("David"));
	}

	public static String methodA(String s) {
		return "Hello " + s;
	}
	
	
	public String methodC(String s) {
		return "Hello " + s;
	}
}
