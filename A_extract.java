//Write a Java program to extract a portion of an array list. 

package module_2;

import java.util.ArrayList;
import java.util.List;

public class A_extract 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<>();
		
		a.add("Green");
		a.add("Blue");
		a.add("Red");
		
		System.out.println(a);
		
		List<String> s = a.subList(0, 3);
		System.out.println("First three element is: "+s);
	}
}
