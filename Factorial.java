/*Write a program to print the factorial of a number by defining a method 
named 'Factorial'. Factorial of any number n is represented by n! and is 
equal to 1*2*3*. *(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0*/

package module_2;

import java.util.Scanner;

public class Factorial 
{
	int fact = 1;
	public void factorial(int n)
	{
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println("The factorial is: "+fact);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number n");
		int n = s.nextInt();
		Factorial f = new Factorial();
		f.factorial(n);
	}
}
