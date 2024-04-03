package 복습;

import java.util.Scanner;

public class Array {

    // 1. 큰 수 출력하기
    public static void main1(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if(i==0) result += arr[i] + " ";
            if(i!=0 && arr[i] > arr[i-1]) {
                result += arr[i] + " ";
            }

        }

        System.out.println(result);
    }


    // 2. 보이는 학생
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int count = 1;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > max) {
                count++;
                max = arr[i];
            }
        }

        System.out.println(count);

    }
}
