/*Write a Java program to append the specified element to the end of a 
hash set.*/

package module_2;

import java.util.HashSet;

public class A_append_hasset 
{
	public static void main(String[] args) 
	{
		HashSet<String > h = new HashSet<>();
		
		h.add("Android");
		h.add("Java");
		h.add("php");
		h.add("ios");
		
		System.out.println(h);
	}
}
