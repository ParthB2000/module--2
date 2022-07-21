//Write a Java program to reverse elements in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class A_Revcerse 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(101);
		a.add(102);
		a.add(103);
		a.add(104);
		a.add(105);
		a.add(106);
		
		Iterator i = a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.hasNext());
		}
		Collections.reverse(a);
		System.out.println(a);
	}
}
