package Problem20210423;

//화상 테스트 ### 3점이 주어진 직사각형의 나머지 좌표 구하기
public class Problem1 {
    public int[] solution(int[][] v) {
        int xOther = -1;
        int xOtherIndex = -1;
        int yOther = -1;

        int xFlagIndex = -1;
        for(int i=1; i<3; i++){
            xFlagIndex = i;
            if(v[0][0] == v[i][0]){
                break;
            }
        }
        int xFlag = v[xFlagIndex][0];

        for(int i=0; i<3; i++){
            if(xFlag != v[i][0]){
                xOther = v[i][0];
                xOtherIndex = i;
            }
        }

        for(int i=0; i<3; i++){
            if(xOtherIndex == i)
                continue;
            if(v[xOtherIndex][1] != v[i][1]){
                yOther = v[i][1];
            }
        }

        int[] answer = {xOther,yOther};
        return answer;
    }
}
