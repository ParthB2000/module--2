//Create a class named 'Shape' with a method to print "This is this is shape".  
//Then create two other classes named 'Rectangle', 'Circle' inheriting the 
//Shape class, both having a method to print "This is rectangular shape" and 
//"This is circular shape" respectively. Create a subclass 'Square' of 
//'Rectangle' having a method to print "Square is a rectangle". Now call the 
//method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
package module_2;

class Shape1 
{ 
	  public void print_shape() 
	  {
		  System.out.println("This is shape"); 
	  } 
} 
class Rectengle1 extends Shape1
{
	  public void print_rectengle() 
	  {
		  System.out.println("This is rectengular shape"); 
	  } 
} 
class Circle1 extends Shape1
{ 
	  public void print_circle() 
	  {
		  System.out.println("This is circular shape"); 
	  } 
}
class Square1 extends Rectengle1 
{ 
	  public void print_rectengle() 
	  {
		  System.out.println("Square is a rectengle"); 
} 
	  } 
	  public class Rectengle_shape 
	  {
		  public static void main(String[] args) 
	  { 
			  Square1 sq = new Square1();
			  sq.print_shape(); 
			  sq.print_rectengle(); 
} 
}
