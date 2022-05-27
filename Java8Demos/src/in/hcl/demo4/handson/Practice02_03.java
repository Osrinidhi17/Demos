package in.hcl.demo4.handson;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import in.hcl.demo4.common.Gender;
import in.hcl.demo4.common.Person;

public class Practice02_03 {
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
    people.stream()
    .filter(person->person.getGender().equals(Gender.MALE))
    		.map(person->new Person (person.getName(), person.getAge(), person.getGender()))
         .forEach(new Consumer<Person>() {
        	 public void accept(Person person) {
        		 System.out.println(person.getName()+" : "+person.getAge());
        	 }
         });
}
}
