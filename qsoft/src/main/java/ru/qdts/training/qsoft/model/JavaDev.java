package ru.qdts.training.qsoft.model;

public class JavaDev extends Employee implements Developer{
	
	public JavaDev(String fName, String lName) {
		super(fName, lName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String writeCode(String req) {
		String code = String.format("Dev #%d write some Java code for %s", id, req);
		System.out.println(code);
		return code;
	}
	
	public void makeJavaApps() {
		System.out.println("I made Java App");
	}
}
