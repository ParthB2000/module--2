package module_2;

import java.util.Scanner;

public class TryCatch_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		try 
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.println("Number is ");
				a[i] = sc.nextInt();
				
				if(a[i]>40 && a[i]<10) 
				{
					throw new ArithmeticException();
				}
				else
				{
					System.out.println("Number is "+a[i]);
				}
			}
		} 
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Exicuted");
		}
	}
}
