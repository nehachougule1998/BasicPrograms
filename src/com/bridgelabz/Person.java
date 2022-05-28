package com.bridgelabz;

public class Person {
	String name;
	String surname;
	int age;
	char gender;

	void run(){
		System.out.println("Person can run");
	}
	
	static void profession() {
		
	}

	public Person(String name, String surname, int age, char gender) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender + "]";
	}

	public Person() {
		
	}
}