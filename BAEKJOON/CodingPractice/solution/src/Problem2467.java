import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> Numbers = new ArrayList<>();

        while(st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            Numbers.add(temp);
        }

        int answer1=0, answer2=0;
        int check = 1000000000;
        int lIndex = 0;
        int rIndex = N-1;
        while(lIndex<rIndex){
            int pNum = Numbers.get(lIndex);
            int mNum = Numbers.get(rIndex);
            int sum = pNum + mNum;

            if (sum < 0)
                sum *= -1;

            if (check > sum) {
                answer1 = pNum;
                answer2 = mNum;
                check = sum;
            }
            if(pNum + mNum < 0)
                lIndex++;
            else
                rIndex--;
        }

        System.out.println(answer1+" "+answer2);
    }
}
