package desofexceptionanderrorhandling;

public class CheckedAndUncheckedExp {

	public static void main(String[] args) {
	
  //Checked Exceptions/Compile time exception: 
		
		//These are exceptions that are checked at compile-time. This means that the programmer must handle them explicitly using try-catch blocks or declare them in the method signature using the throws keyword.

		
 //Unchecked Exceptions/Runtime Exception: 
		
		//These are exceptions that are not checked at compile-time. They usually occur due to programming errors such as dividing by zero, accessing an invalid index in an array, or attempting to cast an object to an incompatible type. Unchecked exceptions are subclasses of RuntimeException and its subclasses.
		
		
 // Keywords used to handle exception:
		// 1.try- for single try block, we can have multiple catch block. It is used to enclose the exception/error. Exception class will be enclosed at last.
		// 2.catch- used to handle the exception/error
		// 3.finally- it will execute always, whether the exception is getting handle or not
		// 4.throw
		// 5. throws
		
		
	}

}
