//Write a Java program to shuffle elements in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class A_shuffle 
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
		
		Collections.shuffle(al);
		System.out.println(al);
	}
}
