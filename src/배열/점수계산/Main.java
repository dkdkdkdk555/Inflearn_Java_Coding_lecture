package 배열.점수계산;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int count = 0;
        int total = 0;
        for(int num : arr){
            if(num==1){
                total = 1 + count + total;
                count++;
            } else {
                count = 0;
            }
        }

        System.out.println(total);

    }
}
