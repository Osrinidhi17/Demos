package in.hcl.demo4.handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import in.hcl.demo4.common.Gender;
import in.hcl.demo4.common.Person;

public class Practice01 {
	    public static List<Person> createPeople(){
	        return Arrays.asList(
	                new Person("pankaj", 38, Gender.MALE),
	                new Person("Manvi", 6, Gender.FEMALE),
	                new Person("Aman", 34, Gender.MALE),
	                new Person("Bindu", 23, Gender.FEMALE),
	                new Person("Kabir", 45, Gender.MALE),
	                new Person("Monika", 45, Gender.FEMALE),
	                new Person("Monika", 35, Gender.FEMALE),
	                new Person("Vijay", 34, Gender.MALE),
	                new Person("Priyanka", 35, Gender.FEMALE));
	    }
	        
	    public static void main(String[] args) {
	        List<Person> people = createPeople();
	        
	        //1.Imperative way of doing : what to do , How to do this
	        List<String> filteredName = new ArrayList<>();
	        for(Person person : people ) {
	        	if(person.getAge()>6 && person.getGender().equals(Gender.FEMALE)) {
	        		filteredName.add(person.getName());
	        	}
	        }
	        System.out.println(filteredName);
	    }}
