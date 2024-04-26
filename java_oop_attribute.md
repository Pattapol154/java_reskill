Class and Field / Attribute

-------------
Employee.java 
-------------
class Employee{
	// Attribute
	private String id;
	private String name;
	private Double salary;
// private,public = modifier
// String,double = data type
// id,name,salary = name
	
	//set method
	public void setID(String id){
		this.id=id;
	}
	
	//set method
	public void setName(String name){
		this.name=name;
	}

	//set method
	public void setSalary(Double salary){
		this.salary=salary;
	}

	public void displayEmployee(){
		System.out.println("ID = "+this.id); //this.id(attribute)
		System.out.println("ID = "+this.name); //this.name(attribute)
		System.out.println("ID = "+this.salary); //this.salary(attribute)
	}
}

-------------
Main.java
-------------
public class Main{
	public static void main(String [] args){
		// create object
		[object name] [key word] [class name]
		Employee e1=new Employee();
		
		//assign value
		[object name] [method name]
		e1.setID("1");
		e1.setName("test1");
		e1.setSalary(30000.0);
		e1.displayEmployee();

		// create object
		[object name] [key word] [class name]
		Employee e2=new Employee();
		
		//assign value
		[object name] [method name]
		e2.setID("2");
		e2.setName("test2");
		e2.setSalary(40000.0);
		e2.displayEmployee();
	}
}
