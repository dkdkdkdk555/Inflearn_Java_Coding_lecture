package 정렬과탐색.선택정렬;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scn.nextInt();

        int idx = 0;
        for (int i = 0; i < n-1; i++) { // 마지막꺼는 안돌아도 됨
            idx = i; // 이미 정렬된거는 비교하지 않기
            for (int j=i+1; j <n;j++){ // 가장 작은수 구하기
                if(arr[j]<arr[idx]) {
                    idx = j;
                }
            }
            // 바꿔주기
            int k = arr[i];
            arr[i] = arr[idx];
            arr[idx] = k;
        }

        for (int c : arr) {
            System.out.print(c + " ");
        }
    }
}
