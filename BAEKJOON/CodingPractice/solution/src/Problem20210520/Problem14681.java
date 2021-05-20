package Problem20210520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int []numbers = new int[2];
        for(int i=0; i<2; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        if(numbers[0]>0){
            if(numbers[1]>0)
                System.out.println("1");
            else
                System.out.println("4");
        }else{
            if(numbers[1]>0)
                System.out.println("2");
            else
                System.out.println("3");
        }
    }
}
