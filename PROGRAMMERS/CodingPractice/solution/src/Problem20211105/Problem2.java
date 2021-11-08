package Problem20211105;
import java.util.*;
public class Problem2 {
    /*
    주식 가격 배열 prices(초 단위로 기록)
    가격이 떨어지지 않은 기간(초 단위 index?) return
    Stack에 비교할 인덱스를 담음 후입선출 임으로 최근 순으로 비교가능 i<i-1,i-2,i-3...
    기간 = 가격이 떨어진 시점 인덱스 - 비교 인덱스(가격이 떨어지지 않은 인덱스는 전체 길이 - 비교 인덱스 -1)
*/
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        //가격이 떨어진 경우
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                answer[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        //가격이 방어된 경우
        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.pop() - 1;
        }

        return answer;
    }
}
