package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		try {
			FileInputStream fls = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("여기도 수행됩니다.");
	}

}
