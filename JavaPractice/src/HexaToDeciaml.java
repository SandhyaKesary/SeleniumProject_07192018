
public class HexaToDeciaml {
	
	public int hexa(String s)
	{
		
		String digits = "0123456789ABCDEF";
		int p =0;
		int decimal = 0;
		
		
		s = s.toUpperCase();
		//System.out.println("The value is****** " + s);
		
		//return s;
	while(true)
	{
	
			if(s==null)
			{
				decimal = -2;
				
			}
			else
			{
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			System.out.println("The index of a char is    "+ d);
			decimal += d*Math.pow(16, p);
			System.out.println("The decimal value is   "+ decimal);
			p++;
		}
		
			}	
			return decimal;
				
	}
	

	}
	
	

	public static void main(String[] args) {
		
		HexaToDeciaml hd = new HexaToDeciaml();
		System.out.println("The decimal number for 2A5 is   " + hd.hexa("2A5"));
		System.out.println("The decimal number for Z is   " + hd.hexa("Z"));

	System.out.println("***********");
	}

}
