//Write a Java program to convert a hash set to a List/ArrayList.

package module_2;

import java.util.ArrayList;
import java.util.HashSet;

public class A_hasset_to_arylst 
{
	public static void main(String[] args) 
	{
		HashSet<String> h = new HashSet<String>();
		h.add("Red");
		h.add("Blue");
		h.add("Green");
		h.add("Yellow");
		
		System.out.println("The orignal string is: "+h);
		
		ArrayList<String> a=new ArrayList<>(h);
		System.out.println("The arraylist of hasset is :"+a);
	}
}
