package desofexceptionanderrorhandling;

public class ExceptionAndErrorDiference {

	public static void main(String[] args) {
// In Java, an error is typically refers to a serious issue that prevents the program from executing properly. 		

		// It is divided into 2 types:
		
// Compile-time error: This error occurs during the compilation of the code when the syntax of the program is incorrect.
// There are other issues that preventing the compiler from generating the bytecode.
		
                      //int a=10
		// In this example, the compiler will generate an error because the semicolon is missing.
		
		              int a =10;
  
                     //int c=b+a;
        
	  // In this example, local variable b is not initialised              
		              int b = 5;
		              int c = b=a;
		              System.out.println(c);
// Runtime errors: These occur while the program is running. They can be due to a variety of reasons such as dividing by zero, attempting to access an invalid memory location, or trying to perform operations on incompatible data types.
//Both types of errors need to be addressed to ensure the proper functioning of the Java program.

 

 class Exception {
	
	//An exception in Java refers to an event that occurs during the execution of a program that disrupts the normal flow of instructions. When an exceptional condition arises, an object representing that exception is created and thrown in the method that caused the error. The program can then catch and handle the exception, allowing it to gracefully handle errors and potentially recover from them.
	
	//Exceptions in Java are typically categorized into two main types:
	
	// checked exception
	// unchecked exception
	
	// object is the super class likewise throwable is the super super most class o exception and errors.
	 
	// Errors:                                            exception
	 // AssertionError                                   ArithmeticException
	 // OutOfMemoryError                                 ArrayIndexOutOfBoundaryException
     //                                                  NullPointerException
	 //                                                  FileNotFoundException
	 //                                                  ClassNotFoundException
 
 
 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
