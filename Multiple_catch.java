/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by 
zero exception and another one is to handle 
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;
*/

package module_2;

public class Multiple_catch 
{
	public static void main(String[] args) 
	{
		int i;
		try 
		{
			int []number = new int[5];
			number[5] = 30/0; 
			
			System.out.println("The number of divison is: "+number[5]);
		} 
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("Zero can not devide by any value");
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index out of bound");
		}
		
	}
}
