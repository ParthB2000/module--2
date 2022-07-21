/*Create a class named 'PrintNumber' to print various numbers of different 
data types by creating different methods with the same name 'printn' 
having a parameter for each data type.
*/

package module_2;

public class Print_number_cls 
{
	void printn(int n)
	{
		System.out.println("The number is: "+n);
	}
	void printn(float a)
	{
		System.out.println("The value of float is: "+a);
	}
	void printn(double b)
	{
		System.out.println("The value of double is: "+b);
	}
	public static void main(String[] args) 
	{
		Print_number_cls p = new Print_number_cls();
		
		p.printn(5.0);
		p.printn(8.8);
		p.printn(7);
	}
}
