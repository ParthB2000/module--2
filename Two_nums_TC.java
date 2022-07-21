package module_2;

/*Take two numbers from the user and perform the division operation and 
handle Arithmetic Exception. O/PEnter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero*/

public class Two_nums_TC 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		try 
		{
			System.out.println("Try block start");
			a = 10;
			b = 0;
			c = a/b;
			System.out.println("Try block ended");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Arithmetic exception");
		}
			System.out.println("Success");
	}
}
