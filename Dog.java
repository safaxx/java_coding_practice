package java_tut;

public class Dog {
	
	String breed;
	String gender;
	int age;
	
	public void run() {
		System.out.println("running");
	}
	public void bark() {
		System.out.println("barking");
	}
	
	

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "german shepherd";
		dog1.age = 8;
		dog1.gender = "male";
		dog1.bark();

	}

}
