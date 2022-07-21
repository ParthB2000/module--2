//Write a Java program to update specific array element by given element.

package module_2;

import java.util.ArrayList;

public class A_update_specific 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList<>();
		
		al.add("Android");
		al.add("Java");
		al.add("php");
		al.add("ios");
		
		System.out.println(al);
		
		al.set(2, "python");
		System.out.println(al);
	}
}
