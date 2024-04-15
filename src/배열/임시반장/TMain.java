package 배열.임시반장;

import java.util.*;
public class TMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1;i<=n;i++) {
            for (int j =1; j <=5; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int answer = 0, max=Integer.MIN_VALUE;
        for(int i=1; i<=n;i++){
            int cnt = 0;
            for(int j=1;j<=n;j++){
                for(int k=1;k<=5;k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break; // break해줘야 j가 넘어가면서 다른 열의 k 와 비교해준다 ->
                        // 열끼리 비교하기 때문에 비교학생(열)과 같은 반이었던 적이 있는지만 확인하는것 그러므로 더 볼 필요 없이
                        // 바로 다음 열 보면 되니까
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }

        System.out.println(answer);
    }
}
