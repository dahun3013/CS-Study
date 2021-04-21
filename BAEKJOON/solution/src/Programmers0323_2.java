import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Programmers0323_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int life = Integer.parseInt(num[1]);
        int[] x = new int[n];
        int[] y = new int[n];
        int[] v = new int[n];
        ArrayList<String> wh = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int index = i + 1;
            num = br.readLine().split(" ");
            x[i] = Integer.parseInt(num[0]);
            y[i] = Integer.parseInt(num[1]);
            v[i] = Integer.parseInt(num[2]);
            //System.out.println("X[" + index + "] : " + x[i] + ", Y[" + index + "] : " + y[i] + ", V[" + index + "] : " + v[i]);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                wh.add(x[i]+" "+y[j]);
            }
        }

        int result = 0;
        for(String str : wh){
            int vSum = 0;
            int count = life;
            num = str.split(" ");
            int xTemp = Integer.parseInt(num[0]);
            int yTemp = Integer.parseInt(num[1]);
            //System.out.println("넓이 : "+rect[0]+", 높이 : "+rect[1]);
            for(int i=0; i<n; i++){
                if(count<0)
                    break;
                if(x[i]<=xTemp && y[i]<= yTemp){
                    vSum+=v[i];
                    count--;
                }
            }
            if(count>=0 && result < vSum){
                result = vSum;
            }
        }
        System.out.println(result);
    }
}