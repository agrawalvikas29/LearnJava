package com.learn.java;

public class LearnConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		System.out.println(dog.dogName);
		System.out.println(dog.dogColor);
		System.out.println(dog.dogAge);

		Dog dog1 = new Dog("Puppy","Pink",5);
		System.out.println(dog1.dogName);
		System.out.println(dog1.dogColor);
		System.out.println(dog1.dogAge);
	}

}

class Dog{

	String dogName;
	String dogColor;
	int dogAge;


	public Dog(){

		dogName = "defaultName"; 
		dogColor = "defaultColor";
		dogAge = 88; 
	}


	public Dog(String name, String color, int age) {

		dogName = name;
		dogColor =color;
		dogAge = age;

	}
}

