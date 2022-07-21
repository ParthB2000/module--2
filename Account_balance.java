/*W.A.J.Pto create a custom exception if Customer withdraw amount which 
is greater than account balance then program will show custom exception 
otherwise amount will deduct from account balance.
Account balance is: 2000 Enter withdraw amount: 2500
Sorry, insufficient balance, you need more 500 Rs. To perform this 
transaction.*/

package module_2;

import java.util.Scanner;

public class Account_balance 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a amount to be withdraw: ");
			int b = s.nextInt();
			
			if(b>2000)
			{
				System.out.println("Need more amount of: "+(b-2000));
			}
			else
			{
				System.out.println("Deduct from account & remaining is: "+(2000-b));
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Custom exception");
		}
	}
}
