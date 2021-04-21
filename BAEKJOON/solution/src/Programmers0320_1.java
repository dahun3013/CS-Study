import java.io.IOException;
import java.util.*;

public class Programmers0320_1 {
    public static void main(String[] args) throws IOException {
        String result="";
        String[] args1 ={
                "SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"
        };
        String[] args2 ={
                "PHP","SQL"
        };
        int[] args3 ={
                9,2
        };

        Map<String,ArrayList<Item>> table = new HashMap<>();
        Map<String,Integer> request = new HashMap<>();

        for(int i=0; i<args1.length; i++){
            String[] token = args1[i].split(" ");
            ArrayList<Item> str = new ArrayList<>();
            for(int j=1; j<token.length; j++){
                str.add(new Item(token[j],token.length-j));
            }
            table.put(token[0],str);
        }

        for(int i=0; i<args2.length; i++){
            request.put(args2[i],args3[i]);
        }

        int sum =0;

        for(String job : table.keySet()){
            int temp =0;
            System.out.println("job : "+job);
            for(Item it : table.get(job)){
                if(request.containsKey(it.language)){
                    temp += request.get(it.language)*it.score;
                    System.out.println("language : "+it.language+", prep : "+request.get(it.language)+", score : "+it.score+", sum : "+temp);
                }
            }
            if(temp > sum){
                sum = temp;
                result = job;
            }else if (temp == sum){
                String[] compare = {result, job};
                Arrays.sort(compare);
                result= compare[0];
            }
        }

        System.out.println(result);
    }

    public static class Item{
        String language;
        int score;
        Item(String language, int score){
            this.language = language;
            this.score = score;
        }
        @Override
        public String toString(){
            return "language : "+language+", score : "+score;
        }
    }
}
