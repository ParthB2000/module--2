//W.A.J. P to create one thread by extending Thread class in another Class .

package module_2;

class A1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("thread A1: "+i);
		}
	}	
}
class B1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("thread B1: "+i);
		}
	}
}

public class Thread_extend 
{
	public static void main(String[] args) 
	{
		A1 a = new A1();
		B1 b = new B1();
		
		a.start();
		b.start();
	}
}
