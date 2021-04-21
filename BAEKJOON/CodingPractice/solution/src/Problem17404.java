import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem17404 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int [][] cost = new int[N][3];
            int [][] dp = new int[N][3];

            for(int i=0; i<N; i++){
                String [] str = br.readLine().split(" ");
                cost[i][0] = Integer.parseInt(str[0]);
                cost[i][1] = Integer.parseInt(str[1]);
                cost[i][2] = Integer.parseInt(str[2]);
            }

            int max = 1000*1001;
            int answer = max;

            for(int k=0; k<3; k++){
                for(int i=0; i<3; i++){
                    if(i==k)
                        dp[0][i] = cost[0][i];
                    else
                        dp[0][i] = max;
                }
                for(int i=1; i<N; i++){
                    dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + cost[i][0];
                    dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + cost[i][1];
                    dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1]) + cost[i][2];
                }
                for(int i=0; i<3; i++){
                    if(i==k)
                        continue;
                    answer = Math.min(answer,dp[N-1][i]);
                }
            }
            System.out.println(answer);
        }
}

