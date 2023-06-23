package 효율성.연속된_자연수의_합;

import java.util.*;
public class Main2 { // 오답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = 2; // 나누는 수
        int count = 0;
        for (int i = 1; i <=n; i++) {
            int k = 0;
           for(int j=1;j<=m;j++){
               k = n - (m-j);
           }
           int r = k/m; // 나머지
           int nn = 0;
           for(int j=1;j<=m;j++){
               nn += (j+r);
           }
           if(nn==n) count++;
        }

    }
}
