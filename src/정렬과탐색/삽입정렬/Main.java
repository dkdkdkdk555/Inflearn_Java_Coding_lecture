package 정렬과탐색.삽입정렬;

import java.util.*;
public class Main { // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = scn.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = i-1; j >=0; j--) {
                if(arr[i]<arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i--; // 내부for문 안에서만 i가--
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
