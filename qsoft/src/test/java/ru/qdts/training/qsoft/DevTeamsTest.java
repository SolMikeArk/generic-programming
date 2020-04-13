package ru.qdts.training.qsoft;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ru.qdts.training.qsoft.model.*;

public class DevTeamsTest {
	@Test
	public void testPrint() {		
		DevTeam<JavaDev> team = DevTeam.<JavaDev>createTeam();
		team.addMember(new JavaDev("Ivan", "Ivanov"));
		team.addMember(new JavaDev("Petr", "Petrov"));
		team.addMember(new JavaDev("Aleksey", "Alekseev"));
		DevTeams.printTeam(team);
		assertTrue(true);
	}
}
