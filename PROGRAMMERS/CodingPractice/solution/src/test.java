import Problem20210423.Problem1;


public class test {
    public static void main(String args[]){
        int [][] testCase1 = {{1, 4}, {3, 4}, {3, 10}};
        Problem1 p1 = new Problem1();
        int [] result = p1.solution(testCase1);
        System.out.println(result[0]+ ", " + result[1]);
    }
}
