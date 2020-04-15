package ru.qdts.training.qsoft;

import java.util.*;
import ru.qdts.training.qsoft.model.*;

public class DevTeam<T extends Developer> implements Iterable<T>{
	List<T> team;

	protected DevTeam() {
		super();
		team = new ArrayList<T>();
	}
	
	public static <T extends Developer> DevTeam<T> createTeam() {
		return new DevTeam<T>();
	}
	
	public boolean addMember(T memb) {
		return team.add(memb);
	}
	
	public void clear() {
		team.clear();
	}
	
	public int size() {
		return team.size();
	}
	
	public T getMember(int index) {
		return team.get(index);
	}
	
	public void setMember(int index, T member) {
		team.set(index, member);
	}
	
	public List<String> writeCode(String req) {
		var codes = new ArrayList<String>();
		for(T memb : team) {
			codes.add(memb.writeCode(req));
		}
		return codes;
	}

	@Override
	public ListIterator<T> iterator() {
		return team.listIterator();
	}
}
