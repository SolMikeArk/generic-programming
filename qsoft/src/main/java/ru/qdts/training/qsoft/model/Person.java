package ru.qdts.training.qsoft.model;

public class Person {
	private String fName;
	private String lName;
	private int age;
	
	public Person(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.setAge(age);
	}

	public Person(String fName, String lName) {
		this(fName, lName, 0);
	}

	public Person() {
		this("", "", 0);
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
