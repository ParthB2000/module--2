/*We have to calculate the area of a rectangle, a square and a circle. Create 
an abstract class 'Shape' with three abstract methods namely 
'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
taking one parameter each. The parameters of 'RectangleArea' are its 
length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' 
is its radius. Now create another class 'Area' containing all the three 
methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 
'Area' and call all the three methods. 
*/
package module_2;

abstract class shape
{
	abstract void RectengleArea(int length,long breadth);
	abstract void SquareArea(int sides);
	abstract void CircleArea(float radius);
}
class Area extends shape
{

	@Override
	void RectengleArea(int length, long breadth) 
	{
		// TODO Auto-generated method stub
		System.out.println("The area of Rectengle is: "+(length*breadth));
	}

	@Override
	void SquareArea(int sides) 
	{
		// TODO Auto-generated method stub
		System.out.println("The area of Square is: "+(sides*sides));
	}

	@Override
	void CircleArea(float radius) 
	{
		// TODO Auto-generated method stub
		System.out.println("The area of Circle is: "+(3.14*radius*radius));
	}
	
}

public class Abstract_cir_squ_rect 
{
	public static void main(String[] args) 
	{
		Area a = new Area();
		
		a.RectengleArea(10,10);
		a.SquareArea(7);
		a.CircleArea(6f);
	}
}
