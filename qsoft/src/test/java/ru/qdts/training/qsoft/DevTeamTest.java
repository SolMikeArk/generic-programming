package ru.qdts.training.qsoft;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ru.qdts.training.qsoft.model.JSDev;
import ru.qdts.training.qsoft.model.JavaDev;
import ru.qdts.training.qsoft.model.PythonDev;

public class DevTeamTest {
	@Test
	public void testJavaDevTeam() {
		DevTeam<JavaDev> team = DevTeam.<JavaDev>createTeam();
		team.addMember(new JavaDev("Ivan", "Ivanov"));
		team.addMember(new JavaDev("Petr", "Petrov"));
		team.addMember(new JavaDev("Aleksey", "Alekseev"));
		assertNotNull(team.writeCode("Printing"));
	}
	
	@Test
	public void testJSDevTeam() {
		DevTeam<JSDev> team = DevTeam.<JSDev>createTeam();
		team.addMember(new JSDev("Ivan", "Ivanov"));
		team.addMember(new JSDev("Petr", "Petrov"));
		team.addMember(new JSDev("Aleksey", "Alekseev"));
		assertNotNull(team.writeCode("Printing"));
	}
	
	@Test
	public void testPythonDevTeam() {
		DevTeam<PythonDev> team = DevTeam.<PythonDev>createTeam();
		team.addMember(new PythonDev("Ivan", "Ivanov"));
		team.addMember(new PythonDev("Petr", "Petrov"));
		team.addMember(new PythonDev("Aleksey", "Alekseev"));
		assertNotNull(team.writeCode("Printing"));
	}
}
