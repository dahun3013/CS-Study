package Problem20210520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();
        int[] numbers = new int[3];

        int sum = 0;
        for(int i=1; i<4; i++){
            int num = num2.charAt(3-i)-'0';
            System.out.println(num);
            sum += num1*num*Math.pow(10,i-1);
        }
        System.out.println(sum);
    }
}
