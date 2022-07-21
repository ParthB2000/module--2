/*Write a Java program to get a collection view of the values contained in 
this map.*/

package module_2;

import java.util.HashMap;

public class A_value_contain 
{
	 public static void main(String[] args) 
	 {
		 HashMap<Integer, String> hm = new HashMap<>();
			
			hm.put(1, "A");
			hm.put(2, "B");
			hm.put(3, "C");
			hm.put(4, "D");
			
			System.out.println("The collection view of list is : "+hm.values());
	}
}
