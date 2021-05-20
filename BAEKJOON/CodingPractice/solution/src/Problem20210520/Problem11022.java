package Problem20210520;

import java.io.*;
import java.util.StringTokenizer;

public class Problem11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;

        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<N+1; i++){
            stk = new StringTokenizer(br.readLine()," ");
            int num1 = Integer.parseInt(stk.nextToken());
            int num2 = Integer.parseInt(stk.nextToken());
            bw.write("Case #"+i+": "+num1+" + "+num2+" = "+(num1+num2)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
