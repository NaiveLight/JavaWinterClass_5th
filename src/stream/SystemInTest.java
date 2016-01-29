package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("Enter");
		
		try {
			
			int i;
			InputStreamReader input = new InputStreamReader(System.in);
			
			while ((i=input.read()) != '³¡'){			
					System.out.print((char)i);					
			}
			
			
//			int i = System.in.read();
//			System.out.println((char)i); // "/r"
//			i = System.in.read();
//			System.out.println(i); // "/n"
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
