/*W.A.J.P to check whether a given string starts with the contents of 
another string. Red is favourite color. Starts with Red? True Orange is also 
my favorite color. Starts with Red? False I3.*/

package module_2;

public class Red_orange 
{
	public static void main(String[] args) 
	{
		String s1 = "Red is favorite colour";
		String s2 = "Orange is also my favorite colour";
		
		System.out.println(s1.startsWith("Red"));
		System.out.println(s2.startsWith("Red"));
	}
}
