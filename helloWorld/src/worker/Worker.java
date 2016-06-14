package worker;

public class Worker {
	private int age;
	private double salary;
	private String name;
	
	public Worker(int age,double salary,String name) {
		this.age = age;
		this.salary = salary;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
