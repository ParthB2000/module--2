//Write a Java program to compare two array lists.

package module_2;

import java.util.ArrayList;

public class A_compare_arylst 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> c1 = new ArrayList<>();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		
		ArrayList<Integer> c2 = new ArrayList<>();
		c2.add(1);
		c2.add(2);
		c2.add(3);
		c2.add(4);
		
		Boolean b = c1.equals(c2);
		System.out.println(b);
	}
}
