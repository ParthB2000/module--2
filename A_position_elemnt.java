/*Write a Java program to print all the elements of an ArrayList using the 
position of the elements.*/ 

package module_2;

import java.util.ArrayList;

public class A_position_elemnt 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Green");
		al.add("Red");
		al.add("Blue");
		al.add("Orange");
		
		System.out.println("Original list is: "+al);
		
		int n = al.size();
		
		for(int i=0;i<n;i++)
		{
			System.out.println(al.get(i));			
		}
		
	}
}
