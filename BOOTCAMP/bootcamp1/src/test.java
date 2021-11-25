import java.util.ArrayList;
import java.util.Scanner;

public class test {
	static final int max = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] name = {'정','현','희'};
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<>();
		ArrayList<Integer> arrayC = new ArrayList<>();
		for(int i=0; i<max; i++) {
			String temp = sc.nextLine();
			array.add(temp);
		}
		for(String str :array) {
			int count = 0;
			for(int i=0; i<str.length(); i++) {
				for(int j=0; j<3; j++) {
					if(name[j] == str.charAt(i))
						count++;
				}
			}
			arrayC.add(count);
		}
		for(int i=0; i<array.size(); i++) {
			System.out.println(String.valueOf(name)+"과 "+array.get(i)+"은 "+arrayC.get(i)+"개의 문자가 일치한다.");
		}
	}

}
