package stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileInOutStream {

	public static void main(String[] args) {
		
//		FileOutputStream foutput = null;
//		
//		try {
//			foutput = new FileOutputStream("a.txt");
//			foutput.write(101);
//			foutput.write(102);
//			foutput.write(103);
//			foutput.write(113);
//			foutput.write(123);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				foutput.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		//FileInputStream finput = null;
//		FileReader finputread = null;
//		//InputStreamReader isr = null;
//		
//		try {
//			finputread = new FileReader("a.txt");
//			//isr = new InputStreamReader(finput);
//			int i;
//			
//			while ((i=finputread.read()) != -1){
//				System.out.print((char)i);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(finputread != null)
//				   finputread.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		FileWriter foutput = null;
		
		try {
			foutput = new FileWriter("a.txt");
			foutput.write(101);
			foutput.write(102);
			foutput.write(103);
			foutput.write(113);
			foutput.write(123);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				foutput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
