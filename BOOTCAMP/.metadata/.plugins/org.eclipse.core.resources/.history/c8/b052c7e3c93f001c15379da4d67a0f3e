package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork2 {
	static int maxLine = 120;
	static int maxProperty = 6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> array = new ArrayList<>();
		String option = "Y";
		int count = 1;
		printLine("-");
		while(option.equals("Y")) {
			print(count+" 번째 제품 정보를 입력해주세요.\n");
			array.add(new Product(maxProperty));
			print("제품을 추가 하시겠습니까?(Y/N): ");
			option = sc.nextLine();
			count++;
		}
		printLine("-");
		
		printLine("=");
		print("\t\t\t\t\t하이마트 제품 코드별 보고서\n");
		printLine("-");
		print("제품코드\t\t생산원가\t\t입고량\t\t판매량\t\t재고량\t\t판매금액\t\t수입금액\n");
		printLine("-");
		for(Product p : array) {
			printRole(p.getCode(),p.getValues());
		}
		printLine("-");
		
		int[] values = new int[maxProperty];
		int size = array.size();
		for(Product p : array) {
			for(int i=0; i<p.getValues().length; i++) {
				values[i] = p.getValues(i);
			}
		}
		printRole("합계",values);
		
		for(int i=0; i<values.length; i++) {
			values[i] /= size;
		}
		
		printRole("평균",values);
		
		values = new int[maxProperty];
		for(int i=0; i<size; i++) {
			if(values[0]<array.get(i).getValues(0))
				values[0] = array.get(i).getValues(0);
			if(values[1]<array.get(i).getValues(1))
				values[1] = array.get(i).getValues(1);
			if(values[2]<array.get(i).getValues(2))
				values[2] = array.get(i).getValues(2);
			if(values[3]<array.get(i).getValues(3))
				values[3] = array.get(i).getValues(3);
			if(values[4]<array.get(i).getValues(4))
				values[4] = array.get(i).getValues(4);
			if(values[5]<array.get(i).getValues(5))
				values[5] = array.get(i).getValues(5);
		}
		
		printRole("최대값",values);
		printLine("=");
	}
	public static void printLine(String str) {
		for(int i=0; i<maxLine; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	public static void print(String str) {
		System.out.print(str);
	}
	public static String printRole(String str, int[] values) {
		String temp = "";
		ArrayList<String> array = new ArrayList<>();
		array.add(str);
		for(int i=0; i<values.length; i++) {
			array.add(Integer.toString(values[i]));
		}
		for(int i=0; i<array.size(); i++) {
			temp += array.get(i)+"\t";
			if(array.get(i).length()<8)
				temp+="\t";
		}
		temp+="\n";
		print(temp);
		return temp;
	}
}
class Product{
	private String code;
	private int[] values;
	public Product(int size) {
		values = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.print("제품코드\t입력: ");
		code = sc.nextLine();
		System.out.print("생산원가\t입력: ");
		values[0] = sc.nextInt();
		System.out.print("입고량\t입력: ");
		values[1] = sc.nextInt();
		System.out.print("판매량\t입력: ");
		values[2] = sc.nextInt();
		init();
	}
	public void init() {
		values[3] = values[1] - values[2];
		values[4] = (int)(values[0] * 1.2) * values[2];
		values[5] = values[4] - (values[0] * values[2]);
	}
	public String getCode() {
		return code;
	}
	public int getValues(int index) {
		if(index<values.length && !(index<0))
				return values[index];
		return -1;
	}
	public int[] getValues() {
		return values;
	}
}
