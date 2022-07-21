/*W.A.J. P to demonstrate try catch block, take two numbers from the user    
by Command line argument and perform the division operation and 
handle Arithmetic
O/P Exception in thread main java. Lang. ArithmeticException:/ by zero*/

package module_2;

import java.util.Scanner;

public class Division_operation_catch 
{
	public static void main(String[] args) 
	{
		try 
		{
			int a,b,c;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter first number");
			a = sc.nextInt();
			
			System.out.println("Enter second number");
			b = sc.nextInt();
			
			c = a/b;
			System.out.println("Result: "+c);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
}
