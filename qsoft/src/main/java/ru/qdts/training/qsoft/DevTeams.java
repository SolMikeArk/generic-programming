package ru.qdts.training.qsoft;

import ru.qdts.training.qsoft.model.Developer;
import ru.qdts.training.qsoft.model.Person;

public class DevTeams {
	public static void printTeam(DevTeam<? extends Developer> team) {
		int n = 0;
		for(Developer dev : team) {
			Person pers= (Person) dev;
			System.out.printf("#%d %s %s\n\r", n++, pers.getfName(), pers.getlName());
		}
	}
	
	public static <T extends Developer> DevTeam<T> buildTeam(T[] teamArray) {
		var team = new DevTeam<T>();
		for(Developer dev : teamArray) {
			team.addMember((T)dev); // Исправить на реализацию без Unchecked Cast Warning
		}
		return team;
	}
	
	// Добавить метод, возвращающий копию DevTeam
	
	// Добавть метод, возвращающий DevTeam с инвертированной последовательностью членов
	
	// Добавить метод, сортирующий команду по возрасту
	
	// Добавить метод, сортирующий команду по зарплате
	
	// Добавить метод, сортирующий команду по возрасту
	
	// Добавить метод, вызывающий make[XXX]App() у всех членов команды
}
