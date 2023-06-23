package 효율성.연속된_자연수의_합;

import java.util.*;
public class Main { // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int lt = 0, count = 0, sum = 0;
        loop:
        for (int rt = 0; rt < arr.length; rt++) {
            sum+=arr[rt];
            if(sum==n) count++;
            else if (sum>n){
                while(sum>n){
                    sum-=arr[lt++];
                    if(sum==n) count++;
                    if(((rt-lt)==1)&&((arr[rt]+arr[lt])>n)) break loop;
                }
            }
        }

        System.out.println(count);
    }
}
