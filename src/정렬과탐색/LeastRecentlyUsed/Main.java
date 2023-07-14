package 정렬과탐색.LeastRecentlyUsed;

import java.util.*;
public class Main { // 선생님 풀이
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int n = scn.nextInt();
        int[] cache = new int[s];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scn.nextInt();

        for(int x : arr){
            int pos = -1;
            for(int i=0;i<s;i++) if(x==cache[i]) pos = i; // hit 인지 검사
            if(pos==-1){ // miss 처리
                for(int i=s-1;i>=1;i--){
                    cache[i] = cache[i-1];
                }
            }else { // hit 처리
                for(int i=pos;i>=1;i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        for (int i : cache) {
            System.out.print(i + " ");
        }
    }
}
