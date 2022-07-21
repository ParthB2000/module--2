package module_2;

import java.util.Scanner;

/*W.A.J.P to read 10 integer values using Scanner class from keyboard. 
Generate the exception if the entered value is less than 10 and or greater 
than 40. Program should display appropriate message as and when this 
exception occurs otherwise it will display all the entered values*/

public class TC_10_integer 
{
	public static void main(String[] args) 
	{
		int b[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter a number: ");
			b[i] = sc.nextInt();
			try 
			{
				if(b[i]>=40||b[i]<=10)
				{
					System.out.println("The out of bound value error: ");
				}
				else
				{
					System.out.println("The number is: "+b[i]);
				}
			}
			catch (Exception e) 
			{
				// TODO: handle exception
				System.out.println("Exception occurs");
			}
		}
	}
}
