/*Write a Java program to compare two sets and retain elements which are 
same on both sets.*/ 

package module_2;

import java.util.ArrayList;

public class A_retain_elmnt 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println("The elemnt of first list is: "+al);
		
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(4);
		a.add(5);
		a.add(8);
		a.add(9);
		a.add(10);
		
		System.out.println("the elemnt of second list is:"+a);
		
		al.retainAll(a);
		
		System.out.println("Retain element is: "+al);
	}
}
