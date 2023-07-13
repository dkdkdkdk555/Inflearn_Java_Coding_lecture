package 정렬과탐색.버블정렬;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scn.nextInt();

        int i = 0;
        int s = 0;
        while(s<n*n){
            if(arr[i]>arr[i+1]){
                int k = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = k;
                s--;
            } else{
                s++;
            }
            i++;
            if(i>n-2) i=0;
        }

        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
    }
}
