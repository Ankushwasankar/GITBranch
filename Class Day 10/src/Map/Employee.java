package Map;

public class Employee
{
	int empid;
	String name;
	int salary;
	
	public Employee(int empid, String name, int salary) 
	{
		this.empid = empid;
		this.name =  name;
		this.salary = salary;
	}
	
	//Its should be Exactly Same	
	public String toString()
	{
		return name+" "+empid+" "+salary;	
	}
}
