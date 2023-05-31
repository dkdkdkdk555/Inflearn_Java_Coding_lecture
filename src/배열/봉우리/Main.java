package 배열.봉우리;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        //산만들기
        int[][] mount = new int[n+2][n+2];
        for(int i=0;i<n+2;i++) {
            for (int j = 0; j < n+2; j++) {
                if(i<=0 || i>=n+1) {
                    mount[i][j] = 0;
                } else if(j<=0||j>=(n+1)){
                    mount[i][j] = 0;
                } else{
                    mount[i][j] = arr[i-1][j-1];
                }
            }
        }

        // 상 mount[i-1][j]
        // 하 mount[i+1][j]
        // 좌 mount[i][j-1]
        // 우 mount[i][j+1]
        //봉우리검사
        int count = 0;
        for(int i=0;i<n+2;i++) {
            for (int j = 0; j < n+2; j++) {
                if(i<=0 || i>=n+1 || j<=0||j>=(n+1)){
                } else{
                    int peak = mount[i][j];
                    if( peak > mount[i-1][j]
                        && peak > mount[i+1][j]
                        && peak > mount[i][j-1]
                        && peak > mount[i][j+1] ) {
                        count ++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
