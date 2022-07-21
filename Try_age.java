/*W.A.J.P to create the validate method that takes integer value as a 
parameter. If the age is less than 18, then throw an ArithmeticException 
otherwise print a message welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. lang. ArithmeticException: not valid*/

package module_2;

import java.util.Scanner;

public class Try_age 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try 
		{
//			int age = Integer.parseInt(args[0]);
			
			if(age<18)
				throw new ArithmeticException("Not valid");
			
			else
				System.out.println("Welcome to vote");
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
