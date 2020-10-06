package week14;

public class Cat {
	
	public void Sound(){
		System.out.println("Meow");
	}
	//overloading
	public void Sound(int num) {
		for(int i=0;i<num;i++) {
			System.out.println("Meow !!");
		}
	}
	
}
