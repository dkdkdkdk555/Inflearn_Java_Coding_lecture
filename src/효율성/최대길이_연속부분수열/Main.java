package 효율성.최대길이_연속부분수열;

import java.util.Scanner;

public class Main { // 오답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int m=0, rt=0, lt=0, max=0;
        while (rt<n) {
            if(arr[rt]==1){
                if(max<(rt-lt)) max = (rt-lt);
                rt++;
            } else if(arr[rt]==0){
                if(k>=m){
                    m++;
                    if(max<(rt-lt)) max = (rt-lt);
                    rt++;
                } else if(k<m){
                    while(k<m){
                        lt++;
                        if(arr[lt] == 0) m--;
                    }
                }
            }
        }

        System.out.println(max+1);

    }
}
