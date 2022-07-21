/*W.A.J.P to concatenate a given string to the end of another string.*/

package module_2;

public class Concatenate 
{
	
	public static void main(String[] args) 
	{
		String str1 = "Hello";
		String str2 = " I am learning java";
		
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);
		
		String str3 = str1.concat(str2);
		
		System.out.println("The concatnated string is: "+str3);
	}
	
}
