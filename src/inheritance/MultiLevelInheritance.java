package inheritance;

//parent class Animal
class Animal{
	// creating move method
	void move(){
		System.out.println("Animals can move.");
	}
}
//Tiger class extends Animal class
class Tiger extends Animal{
	// overriding move method
	void move(){
		System.out.println("Tiger can walk as well as run.");
	}
}
//Cub class extends Tiger class
class Cub extends Tiger{
	// overriding move method
	void move(){
		System.out.println("Cub can walk.");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		// creating new object of Animal class
		Animal A = new Animal();
		A.move();
		A = new Tiger();
		A.move();
		A = new Cub();
		A.move();
	}
}
