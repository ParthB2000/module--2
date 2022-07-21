/*Write a Java program to replace the second element of an ArrayList with 
the specified element.*/

package module_2;

import java.util.ArrayList;

public class A_replace_elmnt 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Green");
		al.add("Red");
		al.add("Blue");
		al.add("Orange");
		
		System.out.println("Original list is: "+al);
		
		al.set(2, "Black");
		System.out.println("After replasing: "+al);
	}
}
