//ตัวอย่างการสร้าง Class เเละ Field / Attribute

//Employee.java
public class Employee {	
  private String id; //Attribute  
  private String name; //Attribute
  private Double salary; //Attribute

	
	//Create method
	public void setId(String id) {
		this.id=id; //key word [this] การใช้คีย์เวิร์ด this คือ เมื่อต้องการเรียกใช้ constructor อื่นๆ ที่อยู่ภายใน class เดียวกัน
	}

	//Create method
	public void setName(String name) {
		this.name=name; //key word [this] การใช้คีย์เวิร์ด this คือ เมื่อต้องการเรียกใช้ constructor อื่นๆ ที่อยู่ภายใน class เดียวกัน
	}

	//Create method
	public void setSalary(String salary) {
		this.salary=salary; //key word [this] การใช้คีย์เวิร์ด this คือ เมื่อต้องการเรียกใช้ constructor อื่นๆ ที่อยู่ภายใน class เดียวกัน
	}
}

//private,public = modifier
//String,double = data type
//id,name,salary = name

//Main.java
public class Main{
	public static void main(String [] args){
		Employee e1=new Employee(); //create object

		e1.setID("1"); //assign method
		e1.setName("test1"); //assign method
		e1.setSalary(30000.0); //assign method
		
	}
}
