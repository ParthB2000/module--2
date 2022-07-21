/*W.A.J.P to check whether a given string ends with the contents of another  
string. "Java Exercises" ends with "se"? False "Java Exercise" ends with 
"se"? True*/

package module_2;

public class Start_end 
{
	
	public static void main(String[] args) 
	{
		String s1 ="java excercises";
		String s2 ="java excercise";
		
		System.out.println(s1.endsWith("se"));
		System.out.println(s2.endsWith("se"));
	}

}
