package 정렬과탐색.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main { // 못품

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scn.nextInt();

        Arrays.sort(arr);
        n = arr[n/2]; // 22
        int hh = 0; // 7
        while(true){
            if(arr[n-1] > m){
                continue;
            } else if(arr[n-1] < m){
                hh = n/2; //
                n = n + hh; // 15 + 7
//                15 + 7 + 3
            } else if(arr[n-1] == m){
                // 종료
            }
        }
    }
}
