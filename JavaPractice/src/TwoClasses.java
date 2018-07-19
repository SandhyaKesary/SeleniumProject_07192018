
public class TwoClasses {
	
	int i;
	double j;
	String name;
	
	public void set()
	{
		i = 10;
		j= 12.5;
		name = "Java";
	}
	
	public void get()
	{
		System.out.println(i+ "   "+ j + "   "+ name);
	}

}

class objective
{
	public static void main(String[] args)
	{
	TwoClasses c = new TwoClasses();
	System.out.println(c.i+ "  "+ c.j+ "   "+c.name);
	c.get();
	c.set();
	c.get();
	}
	
}
