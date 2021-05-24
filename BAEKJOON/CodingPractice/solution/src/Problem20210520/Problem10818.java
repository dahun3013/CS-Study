package Problem20210520;

import java.io.*;
import java.util.StringTokenizer;

public class Problem10818 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;

        int N = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine()," ");

        int max=-1000001,min=1000001;
        int []numbers = new int[N];
        for(int i=0; i<N; i++){
            numbers[i] = Integer.parseInt(stk.nextToken());
            if(max<numbers[i])
                max = numbers[i];
            if(min>numbers[i])
                min = numbers[i];
        }
        bw.write(min+" "+max +"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
