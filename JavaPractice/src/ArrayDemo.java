
public class ArrayDemo {

	public static void main(String[] args) {
		
		//Integer array default values
		//int[] num = new int[5];
		int[] num = {1,2,3,4,5};
		for(int i : num)
		{
			System.out.println(num[i-1]);
		}
		
		//String array default values		
		String[] str = new String[5];
		for(String c : str)
		{
			System.out.println(c);
		}
		
		//Float array default values
		float[] digit = new float[5];
		for(float i : digit)

		{
			System.out.println(i);
		}
	
		//Double array default values
		double[] dnum = new double[5];
		for(double d : dnum)
		{
			System.out.println(d);
		}
	
		//Boolean array default values
		//boolean[] bval = new boolean[5];
		boolean[] bval = {true,true,true,true,true,true};
		for(boolean b : bval)
		{
			System.out.println(b);
		}
		//Non primitive data type using class name
		
		ArrayDemo[] ad = new ArrayDemo[5];
		//ArrayDemo[] ad = {"abc"};
		for(ArrayDemo val : ad)
		{
			System.out.println(val);
		}
	}
	
	

}
