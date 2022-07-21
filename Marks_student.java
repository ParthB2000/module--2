/*Write a program which will ask 
the user to enter his/her marks (out of 100). Define a method that will 
display grades according to the marks entered as below:
MarksGrade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail
*/

package module_2;

import java.util.Scanner;

public class Marks_student 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		
		if(marks>90 && marks<=100 )
		{
			System.out.println("AA Grade");
		}
		else if(marks>80 && marks<=90)
		{
			System.out.println("AB Grade");
		}
		else if(marks>70 && marks<=80)
		{
			System.out.println("BB Grade");
		}
		else if(marks>60 && marks<=70)
		{
			System.out.println("BC Grade");
		}
		else if(marks>50 && marks<=60)
		{
			System.out.println("CD Grade");
		}
		else if(marks>40 && marks<=50)
		{
			System.out.println("DD Grade");
		}
		else if(marks<=40)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Enter a valid marks: ");
		}
}
}