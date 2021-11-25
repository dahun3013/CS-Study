package chap01;
// 3媛쒖쓽 �젙�닽媛� 媛��슫�뜲 理쒕뙎媛믪쓣 援ы븯�뿬 異쒕젰�빀�땲�떎.

class Max3m {
	// a, b, c�쓽 理쒕뙎媛믪쓣 援ы븯�뿬 諛섑솚�빀�땲�떎.
	static int max3(int a, int b, int c) {
		int max = a;						// 理쒕뙎媛�
		if (b > max) 
			max = b;
		if (c > max) 
			max = c;

		return max;
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min) {
			min = b;
		}
		if(c<min) {
			min = c;
		}
		return min;
	}
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));		// [A] a竊얺竊얿
		System.out.println("max3(3,2,2) = " + max3(3, 2, 2));		// [B] a竊얺竊쓈
		System.out.println("max3(3,1,2) = " + max3(3, 1, 2));		// [C] a竊얿竊얺
		System.out.println("max3(3,2,3) = " + max3(3, 2, 3));		// [D] a竊쓈竊얺
		System.out.println("max3(2,1,3) = " + max3(2, 1, 3));		// [E] c竊얷竊얺
		System.out.println("max3(3,3,2) = " + max3(3, 3, 2));		// [F] a竊쓇竊얿
		System.out.println("max3(3,3,3) = " + max3(3, 3, 3));		// [G] a竊쓇竊쓈
		System.out.println("max3(2,2,3) = " + max3(2, 2, 3));		// [H] c竊얷竊쓇
		System.out.println("max3(2,3,1) = " + max3(2, 3, 1));		// [I] b竊얷竊얿
		System.out.println("max3(2,3,2) = " + max3(2, 3, 2));		// [J] b竊얷竊쓈
		System.out.println("max3(1,3,2) = " + max3(1, 3, 2));		// [K] b竊얿竊얷
		System.out.println("max3(2,3,3) = " + max3(2, 3, 3));		// [L] b竊쓈竊얷
		System.out.println("max3(1,2,3) = " + max3(1, 2, 3));		// [M] c竊얺竊얷
	}
}
