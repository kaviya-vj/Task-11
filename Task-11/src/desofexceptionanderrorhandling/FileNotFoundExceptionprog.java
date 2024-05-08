package desofexceptionanderrorhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionprog {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:\\");
		FileReader fr = new FileReader(file);
		

	}

}
 