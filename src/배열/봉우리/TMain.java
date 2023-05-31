package 배열.봉우리;

import java.util.*;
public class TMain {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for(int k=0;k<4;k++){
                    int nx= i+dx[k]; // 행좌표
                    int ny= j+dy[k]; // 열좌표
                    if(nx >= 0 && nx < n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
