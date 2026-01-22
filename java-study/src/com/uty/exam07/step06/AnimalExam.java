package com.uty.exam07.step06;

public class AnimalExam {
	public static void main(String[] args) {
		Animal puppy = new Dog();
		Animal sparrow = new Bird();

		puppy.sound();
		sparrow.sound();
		sparrow.eat();
		
		puppy.eat();
		
		System.out.println(Animal.name);
	}
}
