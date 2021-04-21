import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem0328_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        String [] str = br.readLine().split(" ");

        for(int i=0; i<str.length; i++){
            numbers.add(i+1);
            answer.add(Integer.parseInt(str[i]));
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int k=1; Math.pow(2,k)<N; ++k){
            ArrayList<Integer> temp = new ArrayList<>(numbers);
            int max = Integer.parseInt(String.valueOf(Math.round(Math.pow(2,k))));
            for(int f=0; f<max; f++){
                temp.add(0,temp.get(temp.size()-1));
                temp.remove(temp.size()-1);
            }
            System.out.println(temp);
            sort(temp,k,2);
            result.add(temp);
        }
        for(int k=1; Math.pow(2,k)<N; ++k){
            ArrayList<Integer> temp = new ArrayList<>(result.get(k-1));
            int max = Integer.parseInt(String.valueOf(Math.round(Math.pow(2,k))));
            for(int f=0; f<max; f++){
                temp.add(0,temp.get(temp.size()-1));
                temp.remove(temp.size()-1);
            }
            System.out.println(temp);
            sort(temp,k,2);
        }
    }
    public static void sort(ArrayList<Integer> arr,int k, int i){
        if(2>i || i>k+1){
            return;
        }else{
            int prev = Integer.parseInt(String.valueOf(Math.round(Math.pow(2,k-i+2))))-1;
            int max = Integer.parseInt(String.valueOf(Math.round(Math.pow(2,k-i+1))));
            for(int j=0; j<max; j++){
                System.out.println("k2 : "+max+", j : "+j);
                arr.add(0,arr.get(prev));
                arr.remove(prev+1);
                System.out.println(arr);
            }
            sort(arr,k,i+1);
        }
    }
}
