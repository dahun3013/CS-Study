package Problem20210520;

import java.io.*;

public class Problem3052 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] answer = new int[42];

        String str = br.readLine();
        while(str!=null && !str.equals("")){
            int index = Integer.parseInt(str)%42;
            answer[index]+=1;
            str = br.readLine();
        }

        int count = 0;
        for(int i=0; i<answer.length; i++){
            if(answer[i]>0)
                count++;
            bw.write(answer[i]+"\n");
        }

        bw.write(count+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
