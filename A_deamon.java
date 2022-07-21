/*W.A.J.P to create 2 threads and make one thread as Daemon Thread by 
using set Daemon () method of Thread class and check whether the thread 
is set daemon or not by using is Daemon () method.
 TestDaemonThread2 t1=new TestDaemonThread2(); 
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();*/

package module_2;

public class A_deamon extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon()) 
		{
			System.out.println("The thread is daemon");
		}
		else
		{
			System.out.println("The thread is not daemon");
		}
	}
	public static  void main(String[] args) 
	{
		A_deamon d1 = new A_deamon();
		A_deamon d2 = new A_deamon();
		
		d1.setDaemon(true);
		
		d1.start();
		d2.start();
	}
}
