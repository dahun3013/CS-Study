package day5;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayEX {
	public static void main(String[] args) {
		//3����
		double[][][] jumsu = { { {1.1, 2.2}, {3.3, 4.4 }, {5.5,6.6 } },
				                 { {7.7, 8.8 }, {9.9,10.10 }, {11.11, 12.12 } }  };
		//5.5�� ����� ����
		System.out.println(jumsu[0][2][0]);
		//9.9�� ����� ����
		System.out.println(jumsu[1][1][0]);//1�� 1�� 0��
		//��ü ����ϱ�  for��
		//�� for �� for �� for 
		//���� ���̴� = jumsu.length �迭�� ����,
		// ���� ���� = 0���� ���� jumsu[0].length
		// ���� ���� = jumsu[0][0].length 
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
		//���� for�� ����ϱ�
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
