package in.hcl.demo4.handson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import in.hcl.demo4.common.Gender;
import in.hcl.demo4.common.Person;

public class Practice01_03 {
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
        //2.declartive way :wt to do , with lambda

	    public static void main(String[] args) {
	        List<Person> people = createPeople();
	        
	        List<String> filteredName_app02 = people.stream()
	                .filter((Person person)-> person.getAge()>6 && person.getGender().equals(Gender.FEMALE))
	                .map((Person person)-> person.getName())
	                .map((String name)-> name.toUpperCase())
	                .collect(Collectors.toList());

	        System.out.println(filteredName_app02);
}
	    }
