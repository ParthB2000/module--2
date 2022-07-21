/*Create a class to print an integer and a character with two methods having  
the same name but different sequence of the integer and the character 
parameters. For example, if the parameters of the first method are of the 
form (int n, char c), then that of the second method will be of the form 
(char c, int n)
*/
package module_2;

public class Char_int_cls 
{
	void print1(int n,char c)
	{
		System.out.println("The number is: "+n+" and character is: "+c);
	}
	void print1(char c,int n)
	{
		System.out.println("The character is: "+n+" and number is: "+n);
	}
	public static void main(String[] args) 
	{
		Char_int_cls s=new Char_int_cls();
		s.print1(5, 'g');
		s.print1('g', 7);
		
		
		
	
		
		
	}
}
