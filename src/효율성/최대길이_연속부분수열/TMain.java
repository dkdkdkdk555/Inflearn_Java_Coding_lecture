package 효율성.최대길이_연속부분수열;

import java.util.*;
public class TMain {
    public int solution(int n, int k, int[] arr){
        int answer =0, cnt=0, lt=0;

        for(int rt=0;rt<n;rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1); // rt가 증가할때마다 길이를 구함
        }
        return answer;
    }
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
             arr[i] = scn.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
     }
}
