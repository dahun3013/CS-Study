package Problem20210520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int []numbers = new int[2];
        for(int i=0; i<2; i++){
            numbers[i] = Integer.parseInt(stk.nextToken());
        }

        if(numbers[0]>numbers[1])
            System.out.println(">");
        else if(numbers[0]<numbers[1])
            System.out.println("<");
        else
            System.out.println("==");
    }
}
