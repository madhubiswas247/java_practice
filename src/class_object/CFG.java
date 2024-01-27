package class_object;

public class CFG {
	
	static String Employee_name;
	static float Employee_salary;

	static void set(String n, float p) {
		Employee_name = n;
		Employee_salary = p;
	}

	static void get() {
		System.out.println("Employee name is: " +Employee_name );
		System.out.println("Employee CTC is: " + Employee_salary);
	}

	public static void main(String args[]) {
		CFG.set("Rathod Avinash", 10000.0f);
		CFG.get();
	}
}
/*
 * 
 * Employee name is: Rathod Avinash
   Employee CTC is: 10000.0

 */
