/*Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a 
method named 'getBalance'. Call this method by creating an object of 
each of the three classes.*/

package module_2;

abstract interface bank
{
	public void getbalance();
}

class bank1 implements bank
{

	@Override
	public void getbalance() 
	{
		// TODO Auto-generated method stub
		System.out.println("The balance of 1 is " + " $100");
	}
	
}

class bank2 implements bank
{

	@Override
	public void getbalance() 
	{
		// TODO Auto-generated method stub
		System.out.println("The balance of 2 is " + " $150");
	}
	
}

class bank3 implements bank
{

	@Override
	public void getbalance() 
	{
		// TODO Auto-generated method stub
		System.out.println("The balance of 3 is " + " $200");
	}
	
}

public class A_abstract_bank 
{
	public static void main(String[] args) 
	{
		bank1 b1 = new bank1();
		bank2 b2 = new bank2();
		bank3 b3 = new bank3();
		
		b1.getbalance();
		b2.getbalance();
		b3.getbalance();
	}
}
