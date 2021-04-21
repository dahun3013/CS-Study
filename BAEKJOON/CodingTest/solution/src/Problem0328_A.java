import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Problem0328_A {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] drinks = br.readLine().split(" ");
        int size = drinks.length;
        int[] idrinks = new int[size];
        boolean[] check = new boolean[size];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<size; i++){
            idrinks[i] = Integer.parseInt(drinks[i]);
        }
        for(int i=1; i<size+1; i++) {
            combination(idrinks, check, 0, size, i);
        }
        for(int i=0; i<result.size(); i++){
            int sum = 1;
            for(int num : result.get(i)){
                sum *= num;
            }
            priorityQueue.offer(sum);
        }
        int answer = priorityQueue.peek();
        while(!priorityQueue.isEmpty()){
            int num = priorityQueue.poll();
            System.out.println(answer+", "+num);
            if(num%2==1) {
                answer = num;
                break;
            }
        }
        System.out.println(answer);
    }
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(visited[i]){
                    temp.add(arr[i]);
                }
            }
            result.add(temp);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}
