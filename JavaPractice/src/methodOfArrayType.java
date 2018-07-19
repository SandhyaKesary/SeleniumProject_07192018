
public class methodOfArrayType {
	
	//As the sample method is non static method we cannot call in the main method without creating instance of the class or we have to make the nonstatic method to static which does not require a object
	public  int[] sample() {
		
		int[] a = {1,2,3,4};
		
		return a;
		
			
	}
	
	public static void main(String[] args) {
		
		methodOfArrayType obj = new methodOfArrayType();
		
		int[]i = obj.sample();
		
		System.out.println(i.length);
		
		
		
	}
	

}
