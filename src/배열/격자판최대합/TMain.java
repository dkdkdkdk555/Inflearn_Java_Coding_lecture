package 배열.격자판최대합;

import java.util.*;
public class TMain {
    public static void main(String[] args) {
        TMain t = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int j=0;j<n;j++) {
            for (int i = 0; i < n; i++) {
                arr[j][i] = scn.nextInt();
            }
        }
        System.out.println(t.solution(n, arr));
    }
    public int solution(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;
        // 행과 열 각 합 구해서 answer 보다 크면 바꿔주기
        int sum1, sum2; // 행의합, 열의합
        for(int i=0; i<n; i++){
            sum1 = sum2 = 0;
            for(int j=0;j<n;j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer= Math.max(answer, sum1);
            answer= Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer= Math.max(answer, sum1);
        answer= Math.max(answer, sum2);

        return answer;
    }
}
