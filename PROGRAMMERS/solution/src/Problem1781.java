import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;

class Problem1781 {
    static class Item implements Comparable<Item>{
        int deadline;
        int cup;

        public Item(int deadline, int cup){
            this.deadline=deadline;
            this.cup=cup;
        }
        public Item(Item it){
            this.deadline=it.deadline;
            this.cup=it.cup;
        }

        @Override
        public String toString(){
            return "deadline : "+deadline+", cup : "+cup;
        }

        @Override
        public int compareTo(Item target) {
            if(this.deadline > target.deadline)
                return 1;
            else
                return -1;
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Item> temp = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0; i<N; i++){
            String[] token = br.readLine().split(" ");
            Item item = new Item(Integer.parseInt(token[0]),Integer.parseInt(token[1]));
            temp.add(item);
        }

        Collections.sort(temp);

        for (int i = 0; i < N; i++) {
            int deadLine = temp.get(i).deadline;
            int cup = temp.get(i).cup;
            queue.add(cup);
            while (!queue.isEmpty() && queue.size() > deadLine) queue.poll();
        }

        while (!queue.isEmpty()){
            sum += queue.poll();
        }

        System.out.println(sum);
    }
}