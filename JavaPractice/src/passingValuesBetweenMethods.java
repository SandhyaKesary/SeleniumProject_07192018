
public class passingValuesBetweenMethods {

	
	public static void test1(String x) {
	
		System.out.println(x);
		
	}
	
	
	public static String test(String i) {
		
		
		test1(i);
		
		
		
		return i;
		
	}
	
	
	public static void main(String[] args)
	{
		
		test("JAVA");
		
	}
	
	
}
