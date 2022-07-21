/*Write a Java program to count the number of key-value (size) mappings 
in a map.*/

package module_2;

import java.util.HashMap;

public class A_keyvalue_in_map 
{
	public static void main(String[] args) 
	{
		   HashMap<String , Integer> map=new HashMap<>();
		   map.put("b1",1);
		   map.put("b2",2);
		   map.put("b3",3);
		   map.put("b4",4);
		   map.put("b5",5); 
		   
		   System.out.println("the size of hasmap is : "+map.size());
	}
}
