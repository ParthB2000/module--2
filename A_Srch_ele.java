//Write a Java program to search an element in an array list. 

package module_2;

import java.util.ArrayList;

public class A_Srch_ele 
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
		
		if(al.contains("Java"))
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("elemetn not found ");
		}
	}
}
