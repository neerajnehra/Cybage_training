package com.cybage;

public class Main {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal lion = new Lion();
		cat.talk();
		dog.talk();
		lion.talk();

		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		System.out.println("Area of circle: " + c.calculateArea(5));
		System.out.println("Area of rectangle: " + r.calculateArea(2,3));
		System.out.println("Area of triangle: " + t.calculateArea(5,10));
		
		Printable p[] = new Printable[5];
		p[0] = (Printable)cat;
		
		Utility u = new Utility();
		u.printAll(p);
	}
}
