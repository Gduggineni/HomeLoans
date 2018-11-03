package com.homeloans.helpermethods;

import java.util.Comparator;

import com.homeloans.pojo.Person;

public class IdComparator implements Comparator<Person> {
	
	public int compare(Person s1,Person s2) {  
		if(s1.getId()==s2.getId())  
		return 0;  
		else if(s1.getId()>s2.getId())  
		return 1;  
		else  
		return -1;  
		}  

}
