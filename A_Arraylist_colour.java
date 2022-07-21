/*Write a Java program to create a new array list, add some colours (string) 
and print out the collection.*/

package module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Arraylist_colour 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Green");
		a1.add("Red");
		a1.add("Blue");
		a1.add("Yellow");
		
		System.out.println(a1);
		
		Iterator i = a1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
