package day5;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayEX {
	public static void main(String[] args) {
		//3차원
		double[][][] jumsu = { { {1.1, 2.2}, {3.3, 4.4 }, {5.5,6.6 } },
				                 { {7.7, 8.8 }, {9.9,10.10 }, {11.11, 12.12 } }  };
		//5.5를 출력해 보기
		System.out.println(jumsu[0][2][0]);
		//9.9를 출력해 보기
		System.out.println(jumsu[1][1][0]);//1면 1행 0열
		//전체 출력하기  for문
		//면 for 행 for 열 for 
		//면의 길이는 = jumsu.length 배열의 길이,
		// 행의 길이 = 0면의 길이 jumsu[0].length
		// 열의 길이 = jumsu[0][0].length 
		System.out.println(jumsu.length + "  " + jumsu[0].length + "  " +  jumsu[0][0].length+"~~");
		for(int i=0;i<jumsu.length;i++) {
			for(int j=0;j<jumsu[i].length;j++) {
				for(int k=0;k<jumsu[i][j].length;k++) {
					System.out.print(jumsu[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("==============");
		//향상된 for문 출력하기
		for( double[][] j1 : jumsu) {
			for( double[] j11 : j1) {
				for( double j111 : j11) {
					System.out.print(j111 + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
