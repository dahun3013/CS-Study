package day10;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/*
 * �޴� ���� 0 ���� �߰�, 1 �˻�, 2 ����, 3 ����
 * 1.��� ����(�ѱ���, ����)
 * 
 * 
 */
public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int language;
		System.out.print("Choose Language(0.Korean, 1.english):");
		language = sc.nextInt();
		sc.nextLine();
		
		AddressBook ab = null;
		switch(language) {
			case 0:
				ab = new AddressBookKR();
				break;
			case 1:
				ab = new AddressBookEN();
				break;
			default:
				System.out.println("Not Support Language");
				break;
		}
		int option=-1;
		try {
			
			while(true) {
				ab.displayMenu();
				option=sc.nextInt();
				sc.nextLine();
				switch(option) {
					case 0:
						ab.addRecord();
						break;
					case 1:
						ab.getRecord();
						break;
					case 2:
						ab.delRecord();
						break;
					case 3:
						System.exit(3);
						break;
					default:
						System.out.println("ERROR: "+option+".");
						break;
				}
			}
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}

}

class Record{
	private String name;
	private String address;
	
	public Record() {
		name ="";
		address = "";
	}
	
	public Record(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return name+", "+address;
	}
}
abstract class AddressBook{
	protected Vector<Record> vecRs;
	protected Scanner sc;
	public AddressBook(){
		vecRs = new Vector<Record>();
		sc = new Scanner(System.in);
	}
	public void addRecord(){
		Record temp;
		String name, address;
		name=sc.nextLine();
		address=sc.nextLine();
		temp = new Record(name,address);
		vecRs.add(temp);
	}
	
	public void getRecord(){
		Record temp = null;
		String name = sc.nextLine();
		String result = "";
		for(int i=0; i<vecRs.size(); i++) {
			if(vecRs.get(i).getName().equals(name)) {
				temp = vecRs.get(i);
				result += temp.getName()+", "+temp.getAddress()+"\n";
			}
		}
		System.out.print(result);
	}
	public void delRecord() {
		String name = sc.nextLine();
		int index = -1;
		for(int i=0; i<vecRs.size(); i++) {
			if(vecRs.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		if(index>-1) {
			vecRs.remove(index);
		}
	}
	public abstract void displayMenu();
}

class AddressBookKR extends AddressBook{
	public void addRecord() {
		System.out.println("�ּ� �Է�(1.�̸�,2.�ּ� ������ �� 1�پ�)");
		super.addRecord();
		System.out.println("�ּ� �߰� �Ϸ�");
	}
	public void getRecord() {
		System.out.print("�̸� �Է�: ");
		super.getRecord();
		System.out.println("�˻� �Ϸ�");
	}
	public void delRecord() {
		System.out.print("�̸� �Է�: ");
		super.delRecord();
		System.out.println("���� �Ϸ�");
	}
	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		String str = "";
		str +="[�޴�]\n";
		str +="0. �� ������ �߰�\n";
		str +="1. �˻�\n";
		str +="2. ����\n";
		str +="3. ����\n";
		str +="�޴��� �����ϼ���: ";
		System.out.print(str);
	}
}

class AddressBookEN extends AddressBook{
	public void addRecord() {
		System.out.println("input Address(1.name,2.address each 1 Line)");
		super.addRecord();
		System.out.println("Add Complete");
	}
	public void getRecord() {
		System.out.print("input Name: ");
		super.getRecord();
		System.out.println("Search Complete");
	}
	public void delRecord() {
		System.out.print("input Name: ");
		super.delRecord();
		System.out.println("Delete Complete");
	}
	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		String str = "";
		str +="[Menu]\n";
		str +="0. Add new record\n";
		str +="1. Search\n";
		str +="2. Delete\n";
		str +="3. Quit\n";
		str +="Select Menu:";
		System.out.print(str);
	}
}