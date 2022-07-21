//Write a Java program to copy one array list into another. 

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class A_copy_array 
{
	public static void main(String[] args) 
	{
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Black");
		c1.add("White");
		
		System.out.println("List of first array: "+c1);
		
		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Blue");
		c2.add("Gray");
		c2.add("Purple");
		
		System.out.println("List of first array: "+c2);
		
		Collections.copy(c1, c2);
		
		System.out.println("After copy one array list into another");
		System.out.println(c1);
		System.out.println(c2);
	}
}
