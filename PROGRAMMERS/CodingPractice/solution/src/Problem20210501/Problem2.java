package Problem20210501;

//3진법 뒤집기
class Solution {
    public int solution(int n) {
        String str = "";
        int temp = 0;
        int answer = 0;
        while(n / 3 != 0){
            str+=n%3;
            n/=3;
        }
        str+=String.valueOf(n);
        
        for(int i = str.length()-1;i>=0;i--){          
            answer+=((str.charAt(i) - '0') * (int)Math.pow(3,temp));         
            temp++;
        }
        
        return answer;
    }
}
