//Employee.java
public class Employee {	
  private String id; //Attribute  
  private String name; //Attribute
  private Double salary; //Attribute
  
  //Default Constructor
  public Employee(){
  
  }
  //Custom Constructor
  public Employee(String id,String name){

  }
  //Custom Constructor
  public Employee(String id,String name,Double salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
  }

  //Main.java
  public class Main{
    public static void main(String [] args){
  
      Employee e1=new Employee("1","test1",30000.0); //create object Default Constructor
      Employee e2=new Employee(); //create object Custom Constructor
      Employee e1=new Employee("3","test3"); //create object Custom Constructor
    }
  
  }
}
