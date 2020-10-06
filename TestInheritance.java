package week14;

public class TestInheritance {
	static String name;
	
	public TestInheritance(String c) {
		String color;
		color = c;
		System.out.println("Color : " + color);
	}
	public static void main(String[]args) {
		TestInheritance test1 = new TestInheritance("red");
		test1.eat();//1
		Dog2 d1 = new Dog2();
		d1.eat("Lilies");
		eat();//3
		eat("Luca");//4
	}
	static void eat() {
		System.out.println("Test Inheritance");
	}
	static void eat(String n) {
		System.out.println("Name :" + n);
	}
}

class Animal{
	String color;
	
	public void eat() {
		
	}
}
class Dog2{
	String name;
	String bread;
	public void eat(String l) {
	System.out.println(l + " : " + "Dog eat food " );
	}
}
