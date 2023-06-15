package 배열.멘토링;

import java.util.*;
public class TMain {
    public int solution(int n, int m, int[][] arr){
        int answer = 0;
        for(int i=1;i<=n;i++){ // 인원수 1
            for(int j=1;j<=n;j++){ // 인원수 1
                int cnt=0;
                for(int k=0;k<m;k++){ // 시험횟수 1
                    int pi=0;
                    int pj=0;
                    for(int s=0; s<n; s++){ // 인원수 0
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt(); // 인원수
        int m= scn.nextInt(); // 시험횟수
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}
