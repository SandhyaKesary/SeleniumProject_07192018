
public class varargs {
	
	
	
	public static void largest(int...num)
	{
		if(num.length == 0)
		{
			System.out.println("no arguments passed");
			return;
		}
		else
		{
		int lar = num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>lar)
			lar=num[i];
		}
		System.out.println(lar);
		}
		
	}

	public static void main(String[] args) {

		
		largest(1,2,3);
		largest(12,11,0);
		largest();
		
		

	}

}
