import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Problem0328_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String check = br.readLine();
        String answer0 = "";
        String answer1 = "";
        String answer2 = "";
        String answer3 = "";
        int max = check.length();
        int count = 0;

        for(int i=0; i<check.length(); i++){
            char temp = check.charAt(i);
            if(temp=='K'){
                answer1 += "5";
                answer0 += "5";
            }
            if(temp=='M'){
                answer0 += "1";
                if(i > 0 && check.charAt(i-1)=='M')
                    answer1 += "0";
                else
                    answer1 += "1";
            }
        }

        int kIndex = check.indexOf("K");
        if(kIndex>=0){
            ArrayList<String> result = new ArrayList<>();
            ArrayList<String> result2 = new ArrayList<>();
            while (check.length() > 1 || count > max) {
                count++;
                String temp = check.substring(0,kIndex+1);
                result.add(temp);
                if(temp.length() > 2){
                    result2.add(check.substring(0,kIndex));
                    result2.add("K");
                }
                else
                    result2.add(temp);
                check = check.substring(kIndex+1);
                kIndex = check.indexOf("K");
            }
            if (check.length() > 0) {
                result.add(check);
            }

            for (int i = 0; i < result.size(); i++) {
                String temp = result.get(i);
                String str = "";
                if (temp.contains("K"))
                    str += "5";
                else {
                    str += "1";
                }
                for (int j = 1; j < temp.length(); j++) {
                    str += "0";
                }
                answer2 += str;
            }
            for (int i = 0; i < result2.size(); i++) {
                String temp = result2.get(i);
                String str = "";
                if (temp.contains("K"))
                    str += "5";
                else {
                    str += "1";
                }
                for (int j = 1; j < temp.length(); j++) {
                    str += "0";
                }
                answer3 += str;
            }
            System.out.println(result);
            System.out.println(result2);
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.offer(answer0);
        priorityQueue.offer(answer1);
        priorityQueue.offer(answer2);
        priorityQueue.offer(answer3);
        System.out.println(priorityQueue.poll());

        priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(answer0);
        priorityQueue.offer(answer1);
        priorityQueue.offer(answer2);
        priorityQueue.offer(answer3);
        System.out.println(priorityQueue.poll());
    }
}
