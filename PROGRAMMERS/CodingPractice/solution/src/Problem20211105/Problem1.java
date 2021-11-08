package Problem20211105;
import java.util.*;
public class Problem1 {
    /*
    가장많이 재생된 노래 2개 씩 짝지어 앨범 출시
    고유번호 존재
    노래가 많이 재생된 장르 우선
    장르 내 많이 재생된 노래 우선
    장르 내 재생 횟수가 같은 노래는 고유번호 낮은 순 우선
    장르 genres, 횟수 plays

    먼저 가장 먼저 장르 구분
    장르 내 횟수 구분
    */
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer> hm = new HashMap<>();

        //장르 구분
        for(int i=0; i<genres.length; i++){
            if(!hm.containsKey(genres[i])){
                hm.put(genres[i],0);
            }
            hm.put(genres[i],hm.get(genres[i])+plays[i]);
        }
        //내림차순 정렬
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(hm.entrySet());
        entryList.sort(((o1, o2) -> hm.get(o2.getKey()) - hm.get(o1.getKey())));

        //장르별 노래 구분
        ArrayList<Integer> result = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : entryList){
            PriorityQueue<Song> array = new PriorityQueue<>();
            for(int i=0; i<genres.length; i++){
                if(!genres[i].equals(entry.getKey()))
                    continue;
                Song s = new Song(genres[i],plays[i],i);
                array.offer(s);
            }
            //2개 또는 1개 선정
            if(array.size()>1){
                result.add(array.poll().index);
            }
            result.add(array.poll().index);
        }
        int[] answer = new int[result.size()];
        int index =0;
        for(int num :result){
            answer[index] = num;
            index++;
        }
        return answer;
    }
    //노래 별 정렬을 위한 노래 클래스
    class Song implements Comparable<Song> {
        String genres;
        int plays;
        int index;

        public Song(String genres, int plays, int index) {
            this.genres = genres;
            this.plays = plays;
            this.index = index;
        }

        @Override
        public int compareTo(Song target) {
            if (this.plays < target.plays || (this.plays == target.plays) && this.index > target.index)
                return 1;
            return -1;
        }

        @Override
        public String toString() {
            return "genres: " + genres + ", plays: " + plays + ", index: " + index;
        }
    }
}
