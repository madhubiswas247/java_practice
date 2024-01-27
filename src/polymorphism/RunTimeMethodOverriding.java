package polymorphism;
//parent class Shape
class Shape{
	void area(){
		System.out.println("Formula for areas.");
	}
}
//Square class extends Shape class
class Square extends Shape{
 // overriding area method
	void area(){
		System.out.println("Area of square : a * a");
	}
}
//Rectangle class extends Shape class
class Rectangle extends Shape{
 // overriding area method
	void area(){
		System.out.println("Area of rectangle : 2 * (a + b)");
	}
}
//Circle class extends Shape class
class Circle extends Shape{
 // overriding area method
	void area(){
		System.out.println("Area of circle : pi * r * r");
	}
}
public class RunTimeMethodOverriding {
	public static void main(String[] args) {
	     // creating new object of Shape class
	 	Shape S = new Shape();
	 	S.area();
	 	S = new Square();
	 	S.area();
	 	S = new Rectangle();
	 	S.area();
	 	S = new Circle();
	 	S.area();
	}
}
