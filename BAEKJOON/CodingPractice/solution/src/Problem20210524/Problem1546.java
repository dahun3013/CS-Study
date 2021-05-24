package Problem20210524;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1546 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;
        int N = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine()," ");
        int max = -1;
        double sum = 0;
        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(stk.nextToken());
            if(temp> max)
                max = temp;
            sum += temp;
        }
        double answer = (sum/max*100)/N;
        bw.write(String.valueOf(answer));
        bw.flush();
        br.close();
        bw.close();
    }
}
