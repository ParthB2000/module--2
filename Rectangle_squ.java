
package module_2;

/*Create a class named 'Rectangle' with two data members 'length' and 
'breadth' and two methods to print the area and perimeter of the 
rectangle respectively. Its constructor having parameters for length and 
breadth is used to initialize the length and breadth of the rectangle. Let 
class 'Square' inherit the 'Rectangle' class with its constructor having a 
parameter for its side (suppose s) calling the constructor of its parent class 
as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/

class Rectangle
{
	int length,breadth;
	public Rectangle(int length,int breadth)
	{
		this.breadth = breadth;
		this.length = length;
	}
	void print_area()
	{
		System.out.println("The area of rectangle is: "+(length*breadth));
	}
	void print_perimeter()
	{
		System.out.println("The perimeter is: "+(2*(length+breadth)));
	}
}
class Square extends Rectangle
{
	public Square(int s)
	{
		super(s, s);
		// TODO Auto-generated constructor stub
	}
}

public class Rectangle_squ 
{
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(5,6);
		Square s = new Square(3);
		
		r.print_area();
		r.print_perimeter();
		s.print_area();
		s.print_perimeter();
	}
}

