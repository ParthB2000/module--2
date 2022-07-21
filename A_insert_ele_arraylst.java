/*Write a Java program to insert an element into the array list at the first 
position.*/


package module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A_insert_ele_arraylst 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList<>();
		
		a.add(101);
		a.add(102);
		a.add(103);	
		a.add(104);
		a.add("A");
		a.add("B");
		a.add("C");
		
		a.add(1,"D");
		
		Iterator i = a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
