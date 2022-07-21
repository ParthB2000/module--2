//Write a Java program of swap two elements in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class A_swap_arylst 
{
	public static void main(String[] args) 
	{
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Black");
		c1.add("White");
		
		System.out.println(c1);
		
		Collections.swap(c1, 2, 0);
		System.out.println(c1);
	}
}
