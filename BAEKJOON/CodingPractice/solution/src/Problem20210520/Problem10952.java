package Problem20210520;

import java.io.*;
import java.util.StringTokenizer;

public class Problem10952 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine()," ");
        int num1 = Integer.parseInt(stk.nextToken());
        int num2 = Integer.parseInt(stk.nextToken());

        do{
            bw.write(String.valueOf(num1+num2)+"\n");
            String temp = br.readLine();
            stk = new StringTokenizer(temp," ");
            num1 = Integer.parseInt(stk.nextToken());
            num2 = Integer.parseInt(stk.nextToken());
        }
        while(num1!=0 && num2!=0);

        bw.flush();
        br.close();
        bw.close();

    }
}
