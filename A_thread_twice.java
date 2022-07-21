/*W.A.J.P to start the same Thread twice by calling start () method twice.
Test ThreadTwice1 t1=new TestThreadTwice1(); 
t1.start ();
t1.start ();*/

package module_2;

public class A_thread_twice  extends Thread
{
	public void run()
	{
		System.out.println("Running");
	}
	public static void main(String[] args) 
	{
		A_thread_twice t = new A_thread_twice();
		
		t.start();
		t.start();	
	}
}
