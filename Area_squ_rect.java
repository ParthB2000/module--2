/*Create a class to print the area of a square and a rectangle. The class has 
two methods with the same name but different number of parameters. 
The method for printing area of a rectangle has two parameters which are 
length and breadth respectively while the other method for printing area 
of square has one parameter which is side of square.
*/
package module_2;

public class Area_squ_rect 
{
	void Area(int length,int width)
	{
		System.out.println("The area of rectengle is: "+(length*width));
	}
	void Area(int side)
	{
		System.out.println("The area of square is: "+(side*side));
	}
	public static void main(String[] args) 
	{
		Area_squ_rect a = new Area_squ_rect();
		a.Area(20,10);
		a.Area(30);
	}
}
