package java_tut;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	    String name;
	    int age;
	    String gender;
	    
	    public Person(String name, int age, String gender) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	    }
	    
	    public boolean isEligibleToVote() {
	        return age >= 18;
	    }
	

	    public static void main(String[] args) {
	        // Create some Person objects
	    	List<Person> people = new ArrayList<>();
	    	
	        people.add(new Person("Safa khan", 20, "Male"));
	        people.add(new Person("elham khan", 17, "Female"));
	        people.add(new Person("azlan khan", 30, "Male"));
	        people.add(new Person("ihsan Brown", 16, "Female"));
	        
	        // Check if they are eligible to vote
	        for(Person p: people) {
	        System.out.println(p.isEligibleToVote());
	        };
	        
	    }
	
}

