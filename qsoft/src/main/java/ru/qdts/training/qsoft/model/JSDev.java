package ru.qdts.training.qsoft.model;

public class JSDev extends Employee implements Developer {

	public JSDev(String fName, String lName) {
		super(fName, lName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String writeCode(String req) {
		String code = String.format("Dev #%d write some JS code for %s", id, req);
		System.out.println(code);
		return code;
	}

	public void makeJSApps() {
		System.out.println("I made JS App");
	}
}
