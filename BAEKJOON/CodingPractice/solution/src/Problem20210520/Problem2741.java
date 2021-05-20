package Problem20210520;

import java.io.*;

public class Problem2741{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<N+1; i++){
            bw.write(i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
