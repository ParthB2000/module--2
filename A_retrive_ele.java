/*Write a Java program to retrieve an element (at a specified index) from a 
given array list.*/

package module_2;

import java.util.ArrayList;

public class A_retrive_ele 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList<>();
		
		al.add("Java");
		al.add("Java script");
		al.add("Python");
		al.add("php");
		al.add("Android");
		al.add("ios");
		
		System.out.println(al);
		
		String element=(String) al.get(0);
		System.out.println("the first elemet is: "+element);
		element=(String) al.get(3);
		System.out.println("the fourth element is: "+element);
	}
}
