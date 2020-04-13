package ru.qdts.training.qsoft.model;

public class Employee extends Person{
	private static int curMaxId = 1;
	
	protected int id;
	private int salary = 0;
		
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String fName, String lName) {
		super(fName, lName);
		id = curMaxId++;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
