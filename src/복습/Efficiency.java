package 복습;

import java.util.Arrays;
import java.util.Scanner;

public class Efficiency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nrr = new int[n];
        for (int i = 0; i < n; i++) {
            nrr[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] mrr = new int[m];
        for (int i = 0; i < m; i++) {
            mrr[i] = scn.nextInt();
        }

        int[] arr = new int[n+m];
        for (int i = 0; i < n+m; i++) {
            if(i<n){
                int s = nrr[i];
                arr[i] = s;
            } else {
                int s = mrr[i-n];
                arr[i] = s;
            }
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
