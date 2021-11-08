package Problem20210503;

import java.util.*;
//이진 변환 반복하기
class Problem2 {
    public int[] solution(String s) {
        int[] answer = {};
        int zero=0, cnt=0;
        while(!s.equals("1")){
            cnt++;
            String removeZero=s.replace("0","");
            zero+=s.length()-removeZero.length();
            s=Integer.toBinaryString(removeZero.length());
        }
        
        answer=new int[2];
        answer[0]=cnt;
        answer[1]=zero;
        return answer;
    }
}
