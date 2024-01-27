package Abstraction;

//Interface
interface Animal_interface{
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Pigg implements Animal_interface {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

public class Test_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pigg myPig = new Pigg();  // Create a Pig object
		myPig.animalSound();
		myPig.sleep();

	}
}

/*
 *The pig says: wee wee
  Zzz
 * */
 