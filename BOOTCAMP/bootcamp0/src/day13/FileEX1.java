package day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEX1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".\\FileTest\\fileTest.txt");
		FileOutputStream fos = new FileOutputStream(".\\FileTest\\fileCopy.txt");
		
		int data = 0;
		while((data=fis.read()) != -1){
			fos.write(data);
			char c = (char)data;
			System.out.print(c);
		}
		fos.close();
		fis.close();
	}

}
