package javaOOP.Inheritance;

public class Runable {
	public Runable() {
		System.out.println("Parent's constructor");
	}

	public Runable(String name) {
		System.out.println("Parent's constructor - " + name);
	}

	public Runable(String name, String age) {
		System.out.println("Parent's constructor - " + name + " - " + age);
	}

}
