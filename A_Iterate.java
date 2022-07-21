//Write a Java program to iterate through all elements in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Iterate 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList<>();
		
		a.add(101);
		a.add(102);
		a.add(103);
		a.add("A");
		a.add("B");
		a.add("C");
		
		Iterator i = a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.hasNext());
		}
	}
}
