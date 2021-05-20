package Problem20210520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int []numbers = new int[1];
        for(int i=0; i<1; i++){
            numbers[i] = Integer.parseInt(stk.nextToken());
        }

        if(numbers[0]>=90)
            System.out.println("A");
        else if(numbers[0]>=80)
            System.out.println("B");
        else if(numbers[0]>=70)
            System.out.println("C");
        else if(numbers[0]>=60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
