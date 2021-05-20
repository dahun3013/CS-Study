package Problem20210520;

import java.io.*;
import java.util.StringTokenizer;

public class Problem10871 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(stk.nextToken());
        int X = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(stk.nextToken());
            if(X>num) {
                bw.write(String.valueOf(num));
                if(i<N)
                    bw.write(" ");
            }
        }

        bw.write("\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
