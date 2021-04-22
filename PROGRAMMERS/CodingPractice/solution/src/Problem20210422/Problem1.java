package Problem20210422;

//조이스틱
import java.util.*;
public class Problem1 {
    public int solution(String name) {
        int answer = 0;
        int current = 0;
        int index = name.indexOf('A');
        boolean reverse = false;
        List<Integer> list = new ArrayList<>();

        if(index > -1) {
            for (int i = 0; i < name.length(); i++) {
                if(current > 0 && name.charAt(i) > 65) {
                    list.add(current);
                    current = 0;
                }
                else if(name.charAt(i) == 65) current++;
            }

            list.sort(Comparator.reverseOrder());
            while(!list.isEmpty()) {
                int temp = list.remove(0);
                //1.5 이상 동작
                if(temp == current) {
                    index = name.indexOf(repeat("A",temp), index+1);
                }
                else {
                    index = name.indexOf(repeat("A",temp));
                    current = temp;
                }

                if(index < current + 1) {
                    reverse = true;
                    break;
                }
            }
        }

        for(char i : name.toCharArray()) {
            answer += Math.min(i-'A', 'Z'-i+1);
        }

        if(reverse) {
            if(index > 0) {
                answer += name.length() + index - current - 2;
            }
            else answer += name.length() - index - current;
        }

        else {
            if(index + current == name.length()) {
                answer += name.length() - 1 - current;
                if(answer < 0) answer = 0;
            }
            else {
                answer += name.length() - 1;
            }
        }

        return answer;
    }
    private String repeat(String str, int n){
        String temp = str;
        for(int i=0; i<n; i++){
            temp+=str;
        }
        return temp;
    }
}
