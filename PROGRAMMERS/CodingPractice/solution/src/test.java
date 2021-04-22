import Problem20210422.Problem1;
import Problem20210422.Problem2;
import Problem20210422.Problem3;

public class test {
    public static void main(String args[]){
        String testCase1 = "JEROEN";
        Problem1 p1 = new Problem1();
        System.out.println(p1.solution(testCase1));

        int [] testCase2 = {1,2,3,9,10,12};
        int testCase3 = 7;
        Problem2 p2 = new Problem2();
        System.out.println(p2.solution(testCase2,testCase3));

        String testCase4 = "(()(";
        Problem3 p3 = new Problem3();
        System.out.println(p3.solution(testCase4));

    }
}
