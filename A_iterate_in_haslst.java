//Write a Java program to iterate through all elements in a hash list.

package module_2;

import java.util.HashSet;
import java.util.Iterator;

public class A_iterate_in_haslst 
{
	public static void main(String[] args) 
	{
		HashSet<String > h = new HashSet<>();
		
		h.add("Android");
		h.add("Java");
		h.add("php");
		h.add("ios");
		
		System.out.println(h);
		
		Iterator i = h.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
