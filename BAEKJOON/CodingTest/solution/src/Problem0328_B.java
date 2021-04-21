import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem0328_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String answer = "";
        if(N%2==0){
            for(int i=0; i<N; i++){
                if(i%2==0)
                    answer+="1 ";
                else{
                    answer+="2 ";
                }
            }
            answer = answer.substring(0,answer.length()-1);
        }else{
            for(int i=0; i<N-1; i++){
                if(i%2==0)
                    answer+="1 ";
                else{
                    answer+="2 ";
                }
            }
            answer+="3";
        }
        System.out.println(answer);
    }
}
