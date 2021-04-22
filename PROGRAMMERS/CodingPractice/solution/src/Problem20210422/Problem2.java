package Problem20210422;

//더 맵게
import java.util.*;
public class Problem2 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int i=0; i<scoville.length; i++) {
            minHeap.add(scoville[i]);
        }

        while (minHeap.peek() < K) {
            int min1 = minHeap.poll();
            int min2 = minHeap.poll();


            minHeap.add(min1 + min2*2);
            answer++;

            if (minHeap.peek() >= K) {
                break;
            }

            if (minHeap.peek() < K && minHeap.size() == 1) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
