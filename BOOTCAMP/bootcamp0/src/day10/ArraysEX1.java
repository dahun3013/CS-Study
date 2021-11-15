package day10;

import java.util.Arrays;

public class ArraysEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4};
		int[] arr2 = Arrays.copyOfRange(arr,2,4);
		for(int a2 : arr2) {
			System.out.println(a2+" ");
		}
		System.out.println();
		
		int[] arr3 = new int[5];
		Arrays.fill(arr3, 9);
		for(int a3 : arr3) {
			System.out.println(a3+" ");
		}
		Arrays.setAll(arr3, i ->(int)(Math.random()*5)+1);

	}

}
