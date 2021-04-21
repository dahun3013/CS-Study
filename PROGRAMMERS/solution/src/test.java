import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test {
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 정점의 개수
        String[] passenger = br.readLine().split(" ");
        String[] trains = br.readLine().split(" ");
        int m = trains.length; // 간선의 개수

        boolean visited[] = new boolean[n + 1]; // 방문 여부를 검사할 배열

        LinkedList<Integer>[] adjList = new LinkedList[n + 1];

        for (int i = 0; i <= n; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        // 두 정점 사이에 여러 개의 간선이 있을 수 있다.
        // 입력으로 주어지는 간선은 양방향이다.
        for (int i = 0; i < m; i++) {
            int v1 = Integer.parseInt(trains[i].split(",")[0]);
            int v2 = Integer.parseInt(trains[i].split(",")[1]);
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        for (int i = 1; i <= n; i++) { // 방문 순서를 위해 오름차순 정렬
            Collections.sort(adjList[i]);
        }

        /*
        for(LinkedList<Integer> temp : adjList){
            for(int number : temp)
                System.out.print(number+" ");
            System.out.println();
        }*/

        int [] values = new int[passenger.length];
        for(int i=0; i<passenger.length; i++){
            values[i]=Integer.parseInt(passenger[i]);
        }

        System.out.println("DFS - 인접리스트");
        int []answer = new int[2];
        int check = 0;
        for(int i=n; i>0; i--) {
            dfs_list(i, adjList, visited);
            System.out.println();
            int count =0;
            while(!queue.isEmpty()){
                int index = queue.poll();
                count += values[index-1];
            }
            System.out.println("승객 수 : "+count);
            if(check<count) {
                answer[0] = i;
                answer[1] = count;
                check = count;
            }
            visited = new boolean[n + 1];
        }
        System.out.println(answer[0]+", "+answer[1]);

    }

    // DFS - 인접리스트 - 재귀로 구현
    public static void dfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
        visited[v] = true; // 정점 방문 표시
        System.out.print(v + ", "); // 정점 출력
        queue.add(v);
        if(v == 1) {
            for(int i=0; i<visited.length; i++)
                visited[i] = true;
        }

        Iterator<Integer> iter = adjList[v].listIterator(); // 정점 인접리스트 순회
        while (iter.hasNext()) {
            int w = iter.next();
            //System.out.print(w + "| "); // 정점 출력
            if (!visited[w]) // 방문하지 않은 정점이라면
                dfs_list(w, adjList, visited); // 다시 DFS
        }
    }
}