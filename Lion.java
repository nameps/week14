package week14;

public class Lion extends Cat {
	public void Sound() {
		System.out.println("Roar");
	}
	public void Sound(int num) {
		for(int i=0;i<num;i++) {
			System.out.println("Roar !!");
		}
	}
}
