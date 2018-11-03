package com.homeloans.helpermethods;

import java.util.Comparator;

import com.homeloans.pojo.Person;

public class NameComparator implements Comparator<Person> {

	public int compare(Person s1, Person s2) {
		return s1.getName().compareTo(s2.getName());
	}

}
