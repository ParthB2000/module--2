/*We have to calculate the percentage of marks obtained in three subjects 
(each out of 100) by student A and in four subjects (each out of 100) by 
student B. Create an abstract class 'Marks' with an abstract method 
'getPercentage'. It is inherited by two other classes 'A' and 'B' each having 
a method with the same name which returns the percentage of the 
students. The constructor of student A takes the marks in three subjects 
as its parameters and the marks in four subjects as its parameters for 
student B. Create an object for each of the two classes and print the 
percentage of marks for both the students
*/
package module_2;

abstract class marks
{
	abstract float getPercentage();
}
class A extends marks
{
	float s1,s2,s3;
	
	A(float sub1,float sub2,float sub3)
	{
		this.s1=sub1;
		this.s2=sub2;
		this.s3=sub3;
	}

	@Override
	float getPercentage() 
	{
		// TODO Auto-generated method stub
		return (s1+s2+s3)/300*100;
	}
}
class B extends marks
{
	float s1,s2,s3,s4;
	B(float sub1,float sub2,float sub3,float sub4)
	{
		this.s1=sub1;
		this.s2=sub2;
		this.s3=sub3;
		this.s4=sub4;
	}

	@Override
	float getPercentage() 
	{
		// TODO Auto-generated method stub
		return (s1+s2+s3+s4)/400*100;
	}
	
}
public class Abstract_student 
{
	public static void main(String[] args) 
	{
		A a = new A(10,20,30);
		B b = new B(40,50,60,70);
		float c = a.getPercentage();
		float d = b.getPercentage();
		
		System.out.println("The percentage of student a is: "+c);
		System.out.println("The percentage of student b is: "+d);
	}
}