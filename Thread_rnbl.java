/*W.A.J. P to create one thread by implementing Runnable interface in  
Class.*/

package module_2;

class C1 implements Runnable{

	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread C1: "+i);
		}
		
	}
	
}
class D1 implements Runnable
{

	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) 
		{
			System.out.println("Thread D1: "+i);
		}
	}
	
}
public class Thread_rnbl 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new C1());
		Thread t2 = new Thread(new D1());
		
		t1.start();
		t2.start();
	}
}
