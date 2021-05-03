import java.util.*;
//쿼드압축 후 개수 세기
class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        int N = arr.length;
        for(int i =0; i< N; i++){
            for(int j = 0; j< N; j++){
                if(arr[i][j]==0)answer[0]++;
                else if(arr[i][j]==1)answer[1]++;
            }
        }
        boolean[][] v = new boolean[N][N];
        for(int n = N; n>1 ; n/=2){
            for(int i = 0; i< N; i+=n){
                for(int j = 0; j< N; j+=n){
                    if(v[i][j])continue;
                    int flag = arr[i][j];
                    int a =i, b = j;
                    loop: 
                    for(a=i; a<i+n; a++){
                        for(b=j; b<j+n; b++){
                           if(flag!=arr[a][b])break loop;
                        }
                    }
                    if(a==i+n && b == j+n){
                        for(a=i; a<i+n; a++){
                            for(b= j ; b<j+n; b++){
                                v[a][b] = true;
                            }
                        }
                        answer[flag]-=n*n;
                        answer[flag]++;
                    }
                }
            }
        }
        return answer;
    }
}
