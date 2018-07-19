import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class arrayListExample {
	
	
	public static void main(String[] args) throws Exception
	{
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	System.out.println("The size of the list is:  " + al.size());
	
	for(int i=0;i<=5;i++) {
		
		al.add(i);
	}
	System.out.println("The size of the list is:  " + al.size());
	System.out.println(al);
	
	//Extracting elements from list through different ways
	
	//Using basic for loop
	
	for(int i=0;i<al.size();i++)
	{
		int n = al.get(i);
		System.out.print(n+"\t");
		Thread.sleep(200);
	}
	
	System.out.println();
	
	//Using extended for loop
	
	for(int n : al)
	{
		System.out.print(n+"\t");
		Thread.sleep(200);
	}
	
	System.out.println();
	//Using Iterator
	
	Iterator<Integer> it = al.iterator();
	while(it.hasNext())
	{
		int n = it.next();
		System.out.print(n+"\t");
		Thread.sleep(200);
	}
	System.out.println();
	
	// Using ListIterator
	//Traversing the list forward
	ListIterator<Integer> lit = al.listIterator();
	while(lit.hasNext())
	{
		int n = lit.next();
		System.out.print(n+"\t");
		Thread.sleep(200);
	}
	System.out.println();
	
	//Traversing the list backward
	
	//ListIterator<Integer> lit1 = al.listIterator();
	while(lit.hasPrevious())
	{
		int n = lit.previous();
		System.out.print(n+"\t");
		Thread.sleep(200);
	}
	System.out.println();
	
	System.out.println(al);
	
//Removing the elements
	Iterator<Integer> it1 = al.iterator();
	while(it1.hasNext())
	{
		int n = it1.next();
		System.out.print(n+"\t");
		Thread.sleep(200);
		it1.remove();
	}
	System.out.println();
	System.out.println(al);
	
	
	}
}

