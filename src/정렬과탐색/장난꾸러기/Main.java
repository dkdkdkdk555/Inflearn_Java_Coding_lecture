package 정렬과탐색.장난꾸러기;

import java.util.*;
public class Main { // 오답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scn.nextInt();
        // 큰데 앞으로 온 친구 : 현재+1 < 현재  && 현재+1 > 현재-1
        // 작은데 뒤로 간 친구 : 현제-1 > 현재 &&  현재-1 < 현재+1

        int a = 0;
        int b = 0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>=arr[i+1]){
                a = i +1 ;
                while(arr[i]>=arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    i++;
                }

                if(arr[i]<arr[i+1]){
                    b = i +1;
                }
                break;
            }
        }
        String answer = a + " " + b;
        System.out.println(answer);
    }
}
