/*Create a class with a method that prints "This is a parent class" and its 
subclass with another method that prints "This is child class". Now, create 
an object for each of the class and call 1 - method of parent class by object 
of parent class 2 - method of child class by object of child class 3 - method 
of parent class by object of child class.
*/

package module_2;

class parent
{
	void print()
	{
		System.out.println("This is a parent class");
	}
}
class child extends parent
{
	void print1()
	{
		System.out.println("This is child class");
	}
}
public class Parent_child_cls 
{
	public static void main(String[] args) 
	{
		parent p = new parent();
		child c = new child(); 
		
		p.print();
		c.print();
		c.print1();
	}
}
