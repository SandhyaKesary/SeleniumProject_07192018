
import java.util.Scanner;
public class NumberToWord {

	public static void main(String[] args) {
		
		String n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		
		n = sc.nextLine();
		
		String s = " ";
		for(int i =0;i<n.length();i++)
		{
		
			char c = n.charAt(i);
			
			switch(c)
			
			{
			
				case '0' :
					//System.out.println("ZERO");
					s = s+" ZERO ";
					break;
				
				case '1' :
					//System.out.println("One");
					s = s+" ONE ";
					break;
				case '2' :
					//System.out.println("Two");
					s = s+" TWO ";
					break;
				case '3' :
					//System.out.println("Three");
					s = s+" THREE ";
					break;
				case '4' :
					//System.out.println("Four");
					s = s+" FOUR ";
					break;
				case '5' :
					//System.out.println("Five");
					s = s+" FIVE ";
					break;
				case '6' :
					//System.out.println("Six");
					s = s+" SIX ";
					break;
				case '7' :
					//System.out.println("Seven");
					s = s+" SEVEN ";
					break;
				case '8' :
					//System.out.println("Eight");
					s = s+" EIGHT ";
					break;
				case '9' :
					//System.out.println("Nine");
					s = s+" NINE ";
					break;
				default:
					System.out.println("Enter appropriate number");
					break;
				
			}
			
		
			
			//s = s+c;
			//System.out.print(s);
			
		}
		
		
		System.out.print(s);
	

	}

}
