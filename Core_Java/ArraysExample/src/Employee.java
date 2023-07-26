
public class Employee {
	
	public int age;
	public float salary;
	public String name;
	public Employee(int age, float salary, String name) {
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
	

}
