//Write a Java program to increase the size of an array list.

package module_2;

import java.util.ArrayList;

public class A_increase_size 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>(4);
		al.add("green");
		al.add("red");
		al.add("blue");
		al.add("orange");
		
		System.out.println("The size of element is :"+al);
		System.out.println("");
		
		al.ensureCapacity(6);
		
		al.add("black");
		al.add("white");
		
		System.out.println("The icreasing size of element is :"+al);
	}
}
