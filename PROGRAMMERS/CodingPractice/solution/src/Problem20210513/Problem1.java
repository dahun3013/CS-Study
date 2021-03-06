package Problem20210513;

import java.util.*;
//짝지어 제거하기
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
