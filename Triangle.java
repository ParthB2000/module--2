package module_2;

/*Write a program to print the area and perimeter of a triangle having 
sides of 3, 4 and 5 units by creating a class named 'Triangle' without any 
parameter in its constructor*/

public class Triangle 
{
	int t1 = 6;
	int t2 = 7;
	int t3 = 8;
	
	public static void main(String[] args) 
	{
		Triangle r1 = new Triangle();
		int peri = (r1.t1+r1.t2+r1.t3);
		System.out.println("The perimeter of triangle is: "+peri);
		
		int sp = (peri/2);
		int ar = ((((sp*(sp-r1.t1)*(sp-r1.t2)*(sp-r1.t3)))));
		int area = (int)Math.sqrt(ar);
		System.out.println("The area of triangle is: "+area);
	}
}
