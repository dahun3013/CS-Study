package day13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class SerialEX2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".\\FileTest\\UserInfoSer.ser");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		UserInfo u1 = (UserInfo) ois.readObject();
		UserInfo u2 = (UserInfo) ois.readObject();
		List list = (List) ois.readObject();
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(list);
		
		ois.close();
		bis.close();
		fis.close();
		
	}

}
