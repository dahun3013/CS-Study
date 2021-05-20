package Problem20210520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int []numbers = new int[2];
        for(int i=0; i<2; i++){
            numbers[i] = Integer.parseInt(stk.nextToken());
        }

        if(numbers[1]-45>=0){
            System.out.println(numbers[0]+" "+(numbers[1]-45));
        }else{
            if(numbers[0]-1>=0)
                System.out.print((numbers[0]-1)+" ");
            else
                System.out.print((24+(numbers[0]-1))+" ");
            System.out.println((60+(numbers[1]-45)));
        }
    }
}
