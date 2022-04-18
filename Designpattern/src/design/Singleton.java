package design;

public class Singleton {
	public static void main(String[] args) {
		Employee object = Employee.getObject();
		System.out.println(object);
		Employee object2 = Employee.getObject();
		System.out.println(object2);

		Employee object3 = Employee.getObject();
		System.out.println(object3);
System.out.println("Singleton");
	}

}
