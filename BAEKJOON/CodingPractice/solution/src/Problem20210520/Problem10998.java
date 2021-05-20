package Problem20210520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int []numbers = new int[2];
        for(int i=0; i<2; i++){
            numbers[i] = Integer.parseInt(stk.nextToken());
        }
        System.out.println(numbers[0]*numbers[1]);
    }
}
