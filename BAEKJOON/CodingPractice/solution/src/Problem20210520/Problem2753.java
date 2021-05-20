package Problem20210520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int []numbers = new int[1];
        for(int i=0; i<1; i++){
            numbers[i] = Integer.parseInt(stk.nextToken());
        }

        if(numbers[0]%4==0 && (numbers[0]%100>0 || numbers[0]%400==0))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
