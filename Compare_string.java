/*W.A.J.P to compare a given string to the specified character sequence. 
Comparing topsint.com and topsint.com: true Comparing Topsint.com 
and topsint.com: false*/

package module_2;

public class Compare_string 
{
	public static void main(String[] args) 
	{
		String s1 = "topsint.com";
		String s2 = "Topsint.com";
		String s3 = "topsint.com";
				
			System.out.println(s1.equals(s3));
			System.out.println(s1.equals(s2));
			
	}
}
