package USTBATCHNO3.Testng;


public class Employee 
{
   
   @Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
	}
public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDepartment() {
		return department;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
private String name;
    private int age;
       public Employee(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}
	private String department;
    }
    

