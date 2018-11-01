package com.homeloans.test;

import java.util.ArrayList;
import java.util.List;

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
		
		for(Person person: persons) {
			System.out.println(person);
		}
		
		

	}

}
