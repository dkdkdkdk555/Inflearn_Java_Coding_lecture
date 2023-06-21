package 효율성.최대매출;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] narr = new int[n];
        for (int i = 0; i < n; i++) {
            narr[i] = scn.nextInt();
        }
        // i == n-2 stop
        // 방금 더 한 값이 이전에 더 한 값보다 크면 max 갱신
        int max = 0;
        int s = 0;
        int i = 0;
        for (int j = 0; j < k; j++) {
            s += narr[i+j];
            if(s>max) max = s;
            i++;
            if(i==(n-k)) break;
        }

        System.out.println(max);

    }
}
