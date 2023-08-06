package 정렬과탐색.좌표정렬;

import java.util.Scanner;

public class Main2 { // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
            b[i] = scn.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j<n-1-i;j++){
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;

                    int tmp2 = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = tmp2;
                } else if (a[j] == a[j + 1]) {
                    if (b[j] > b[j + 1]) {
                        int tmp = b[j];
                        b[j] = b[j + 1];
                        b[j + 1] = tmp;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " " + b[i]);
        }

    }
}
