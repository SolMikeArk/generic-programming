package ru.qdts.training.qsoft.model;

public class PythonDev extends Employee implements Developer {

	public PythonDev(String fName, String lName) {
		super(fName, lName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String writeCode(String req) {
		String code = String.format("Dev #%d write some Python code for %s", id, req);
		System.out.println(code);
		return code;
	}
	
	public void makePythonApps() {
		System.out.println("I made Python App");
	}
}
