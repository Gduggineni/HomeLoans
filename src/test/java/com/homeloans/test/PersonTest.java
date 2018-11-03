package com.homeloans.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.homeloans.helpermethods.IdComparator;
import com.homeloans.helpermethods.NameComparator;
import com.homeloans.pojo.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person satya = new Person(1, "Sathya", "Irving");
		Person gopi = new Person(2, "Gopi", "Plano");
		Person sreeni = new Person(21, "Sreeni", "Frisco");

		List<Person> persons = new ArrayList<Person>();

		persons.add(sreeni);
		persons.add(gopi);
		persons.add(satya);

		System.out.println("***** Diplay the names before Sorting: ********");

		for (Person person : persons) {
			System.out.println(person);
		}

		System.out.println("***** Diplay the names after Sorting: ********");

		Collections.sort(persons, new NameComparator());

		// Traversing the elements of list

		for (Person person : persons) {

			System.out.println(person);
		}

		System.out.println("+++++++++ Display the id's after sorting: +++++++");
		
		Collections.sort(persons, new IdComparator());
		// Travering the list again
		
		for (Person person : persons) {
			
			System.out.println(person);
		}

	}

}
