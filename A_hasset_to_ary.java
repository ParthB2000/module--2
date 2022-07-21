//Write a Java program to convert a hash set to an array.

package module_2;

import java.util.HashSet;

public class A_hasset_to_ary 
{
	public static void main(String[] args) 
	{
		HashSet<String> h = new HashSet<String>();
		h.add("Red");
		h.add("Blue");
		h.add("Green");
		h.add("Yellow");
		
		System.out.println("The orignal element is: "+h);
		
		String array[] = new String[h.size()];
		h.toArray(array);
		
		for(String a:array)
		{
			System.out.println("th eelement of array is :"+h);
		}
		
	}
}
