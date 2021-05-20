package Problem20210520;

import java.io.*;

public class Probelm1110 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        if(num<10)
            num*=10;

        int tempNum = num;
        int temp1,temp2;

        int count=0;
        do{
            //bw.write("Count : "+count+", "+String.valueOf(tempNum)+"\n");
            temp1 = tempNum%10;
            temp2 = (tempNum/10+tempNum%10)%10;
            tempNum = Integer.parseInt(temp1+""+temp2);
            count++;
        }while(tempNum!=num);
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}
