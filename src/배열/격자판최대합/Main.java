package 배열.격자판최대합;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int j=0;j<n;j++) {
            for (int i = 0; i < n; i++) {
                arr[j][i] = scn.nextInt();
            }
        }
        int best = 0;
        // 연산
        // 각행, 각항
        for(int j=0;j<n;j++) {
            int arrsam = 0;
            for (int i = 0; i < n; i++) {
                arrsam += arr[j][i];
            }
            if(arrsam > best){
                best = arrsam;
            }
            arrsam = 0;
        }
        // 두대각선
//        if(n>=5) {
            int arrsam = 0;
            for (int i = 0; i < n; i++) {
                arrsam += arr[i][i];
            }
            if(arrsam > best){
                best = arrsam;
            }
            arrsam = 0;
            for (int i = n-1; i >= 0; i--) {
                arrsam += arr[i][i];
            }
            if(arrsam > best){
                best = arrsam;
            }
//        }

        System.out.println(best);
    }
}
