/*Create a class named 'Member' having the following members:
Data members 
Name
Age
Phone number
Address 5 - Salary
It also has a method named 'printSalary' which prints the salary of the 
members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 
'Employee' and 'Manager' classes have data members 'specialization' and 
'department' respectively. Now, assign name, age, phone number, 
address and salary to an employee and a manager by making an object of 
both of these classes and print the same.
*/
package module_2;

class member
{
	int age;
	String name;
	String phonenumber;
	String address;
	double salary;
	
	public member(String name,String phonenumber,int age,String address,double salary)
	{
		this.address = address;
		this.age = age;
		this.name = name;
		this.phonenumber = phonenumber;
		this.salary = salary;
	}
	public void printsalary()
	{
		System.out.println("salary" + salary);
	}
}
class Employee extends member
{
	private String department;
	public Employee(String name, String phonenumber, int age, String address, double salary) 
	{
		
		super(name, phonenumber, age, address, salary);
		// TODO Auto-generated constructor stub
		this.department = department;
	}
}
class manager extends member
{
	private String specialization;
	public manager(String name, String phonenumber, int age, String address, double salary) 
	{
		super(name, phonenumber, age, address, salary);
		// TODO Auto-generated constructor stub
		this.specialization = specialization;
	}
	
}
public class Member_class 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee("Parth", "6353510043", 21, "Near bus stop", 15000);
		e.printsalary();
		manager m = new manager("Darshit", "6353858130", 21, "At bus stand", 18000);
		m.printsalary();
	}
}
