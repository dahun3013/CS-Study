package Problem20210520;

import java.io.*;

public class Problem2577 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int multi = 1;
        String str = br.readLine();
        while(str!=null && !str.equals("")){
            int temp = Integer.parseInt(str);
            multi*=temp;
            str = br.readLine();
        }

        int[] answer = new int[10];
        while(multi!=0){
            int index = multi%10;
            answer[index]+=1;
            multi/=10;
        }

        for(int i=0; i<answer.length; i++){
            bw.write(answer[i]+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
