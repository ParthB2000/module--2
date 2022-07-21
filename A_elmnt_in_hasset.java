//Write a Java program to get the number of elements in a hash set.

package module_2;

import java.util.HashSet;
import java.util.Iterator;

public class A_elmnt_in_hasset 
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
		
		System.out.println("The size is: "+h.size());
	}
}
