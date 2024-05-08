package desofexceptionanderrorhandling;
 
//In Java, there are four access modifiers, each governing the accessibility of classes, methods, and variables within a program. Here's a summary of each access modifier and its significance:

//public: The public modifier makes the class, method, or variable accessible from anywhere, both within and outside its package. Classes, methods, and variables marked as public can be accessed by any other class.
//protected: The protected modifier allows access to the class, method, or variable within the same package or by subclasses (even if they are in a different package). This means that classes, methods, or variables marked as protected can be accessed by classes within the same package and by subclasses (regardless of their package).
//default (no modifier): If no access modifier is specified, it means the class, method, or variable has default accessibility, also known as package-private. Classes, methods, or variables with default accessibility are accessible only within the same package. They cannot be accessed by classes outside the package, even if they are subclasses.
//private: The private modifier restricts access to the class, method, or variable to only within the same class. This means that classes, methods, or variables marked as private cannot be accessed by any other class, including subclasses and classes in the same package.

// The following table shows the access to members permitted by each modifiers.

//                       Access levels
// Modifiers    class      package    subclass     World 

// public        Yes         Yes        Yes         Yes
//protected      Yes         Yes        Yes         No
//no modifiers   Yes         Yes        No          No
//private        Yes         No         No          No

class AM {

	public int a = 5;
	protected int b = 10;
	int c = 15;// (default no modifiers)
	private int d = 20;

	public void test() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class FourAccessModifiers {

	public static void main(String[] args) {
// can able to access the four access modifiers variables in the class.
		AM obj = new AM();
	     obj.test();
	     
System.out.println("Accessing four access modifiers in Same package but diferent class:");
		System.out.println(obj.a); //5
		System.out.println(obj.b); //10
		System.out.println(obj.c); //15
// private is not accessible outside the class.
	   //System.out.println(obj.d);
		
	}

}
