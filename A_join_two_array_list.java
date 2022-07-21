//Write a Java program to join two array lists.

package module_2;

import java.util.ArrayList;

public class A_join_two_array_list 
{
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
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
		
		ArrayList<String> c = new ArrayList<String>();
		c.addAll(c1);
		c.addAll(c2);
		
		System.out.println("New array is: "+c);

	}
}
