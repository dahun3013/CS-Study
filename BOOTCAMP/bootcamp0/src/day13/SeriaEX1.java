package day13;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SeriaEX1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream(".\\FileTest\\userInfoSer.ser");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
		UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);
		
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		
		//Á÷·ÄÈ­
		oos.writeObject(u1);
		oos.writeObject(u2);
		oos.writeObject(list);
		
		oos.close();
		bos.close();
		fos.close();
	}

}

class UserInfo implements Serializable{
	String name;
	String password;
	int age;
	int score;
	static final long serialVersionUID = 19238491204325681L;
	UserInfo(){
		this("Unknown","1111",0);
	}
	UserInfo(String name, String password, int age){
		this.name = name;
		this.password = password;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+" "+password+" "+age;
	}
}
