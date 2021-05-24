package Problem20210520;

import java.io.*;

public class Problem2562 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 9;
        int max=-1, index=0;
        int []numbers = new int[N];

        for(int i=0; i<N; i++){
            numbers[i] = Integer.parseInt(br.readLine());
            if(max<numbers[i]) {
                max = numbers[i];
                index = i+1;
            }
        }
        bw.write(max+"\n");
        bw.write(index+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
