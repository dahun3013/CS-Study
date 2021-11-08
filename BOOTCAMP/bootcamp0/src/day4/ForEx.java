package day4;

public class ForEx {
	public static void main(String[] args) {
		String[] name = {"홍길동", "김유신"};
		int[] scoreLanguage = {100,90};
		int[] scoreEnglish = {90, 85};
		int[] scoreMath = {80,75};
		
		System.out.println("성명\t국어\t영어\t수학");
		for(int i=0; i<name.length; i++)
			System.out.println(name[i]+"\t"+scoreLanguage[i]+"\t"+scoreEnglish[i]+"\t"+scoreMath[i]);
		
	}

}

/*int half = 7/2;
for(int i=0; i<7; i++) {
	if(i<=half) {
		for(int j=7; j>0; j--) {
			if(j==(i*2))
				break;
			System.out.print("*");
		}
	}else {
		for(int j=0; j<7; j++) {
			if(j==(i-half)*2+1)
				break;
			System.out.print("*");
		}
	}
	System.out.println("");
}*/