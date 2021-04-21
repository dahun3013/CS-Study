import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem3190 {
    public static class Snake{
        int x,y;
        String dir;
        public Snake(int x, int y, String dir){
            this.x = x;
            this.y = y;
            this.dir = dir;
        }
        public void move(){
            if(dir=="W")
                x += -1;
            else if(dir=="S")
                x += 1;
            else if(dir=="A")
                y += -1;
            else if (dir=="D")
                y += 1;
            else
                System.out.println("뱀 이동량 오류");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int [][]apple = new int[N+1][N+1];
        for(int i=0; i<K; i++){
            String []xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            apple[x][y] = 1;
        }
        int L = Integer.parseInt(br.readLine());
        int []moveTime = new int[L];
        String []moveDir = new String[L];
        String []Direction = {"D","S","A","W"};
        for(int i=0; i<L;i++){
            String []temp = br.readLine().split(" ");
            moveTime[i] = Integer.parseInt(temp[0]);
            moveDir[i] = temp[1];
        }
        ArrayList<Snake> snakes = new ArrayList<>();
        Snake snake = new Snake(1,1,"D");
        snakes.add(snake);
        int time = 0;
        int moveIndex = 0;
        int dirIndex = 0;
        boolean isRun = true;
        while(isRun){
            time++;
            System.out.println(time+"초 진행내역");
            if(moveIndex< moveTime.length && moveTime[moveIndex] == time-1){
                System.out.print("방향변경 전 : "+ Direction[dirIndex]);
                if(moveDir[moveIndex].equals("L")){
                    dirIndex-=1;
                    if(dirIndex<0)
                        dirIndex=3;
                }
                else if(moveDir[moveIndex].equals("D")){
                    dirIndex+=1;
                    if(dirIndex>3)
                        dirIndex=0;
                }else{
                    //System.out.println("없는 방향(L,D 이외) 인자 에러");
                }
                //System.out.println(", 방향변경 후 : "+Direction[dirIndex]);
                moveIndex++;
            }
            snake = new Snake(snake.x,snake.y, Direction[dirIndex]);
            snake.move();
            System.out.println("뱀 머리 이동 : "+snake.x+", "+snake.y+", "+Direction[dirIndex]);

            if((snake.x > N || snake.y > N) || snake.x < 1 || snake.y < 1) {
                System.out.println("게임종료 : "+snake.x+", "+snake.y);
                break;
            }
            for(int i=0; i<snakes.size(); i++){
                if(snakes.get(i).x == snake.x && snakes.get(i).y == snake.y){
                    isRun = false;
                    System.out.println("게임종료 : "+snake.x+", "+snake.y);
                    break;
                }
            }
            if(!isRun)
                break;

            snakes.add(snake);
            if(apple[snake.x][snake.y]!=1){
                snakes.remove(snakes.get(0));
            }else{
                apple[snake.x][snake.y]=0;
                System.out.println("사과먹음 : "+snake.x+", y : "+snake.y);
            }

            System.out.println("뱀 길이 : "+snakes.size());
            for(int i=0; i< snakes.size(); i++){
                System.out.println("x : "+snakes.get(i).x+", y : "+snakes.get(i).y);
            }
        }

        //변수들 출력 확인용 시작
        System.out.println("사과개수 : "+K);

        System.out.println("사과위치");
        for(int i=0; i<N; i++){
            System.out.print("#");
        }
        for(int i=0; i< snakes.size(); i++){
            apple[snakes.get(i).x][snakes.get(i).y] = 2;
        }
        System.out.println("###");
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(apple[i][j]);
            }
            System.out.println("");
        }
        for(int i=0; i<N; i++){
            System.out.print("#");
        }
        System.out.println("###");

        System.out.println("뱀의 이동횟수 : "+L);
        for(int i=0; i<L; i++) {
            System.out.println(moveTime[i]+", "+moveDir[i]);
        }
        System.out.println("종료까지 걸린시간 : "+(time));
        //변수들 출력 확인용 끝
    }
}
