//Write a Java program to remove the third element from an array list.

package module_2;

import java.util.ArrayList; 
import java.util.Iterator;

public class A_Rmv_Element 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList<>();
		
		a1.add("Android");
		a1.add("Java");
		a1.add("php");
		a1.add("c,c++");
		
		a1.remove(3);
		
		Iterator i = a1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
