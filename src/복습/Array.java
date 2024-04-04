package 복습;

import java.util.ArrayList;
import java.util.List;
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
    public static void main2(String[] args) {
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

    // 3. 가위 바위 보
    public static void main3(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) a[i] = scn.nextInt();
        for (int i = 0; i < n; i++) b[i] = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int av = a[i];
            int bv = b[i];

            if(av==bv){
                System.out.println("D");
                continue;
            }

            if (av==1){
                switch (bv){
                    case 2:
                        System.out.println("B");
                        break;
                    case 3:
                        System.out.println("A");
                        break;
                }
            } else if (av==2) {
                switch (bv){
                    case 1:
                        System.out.println("A");
                        break;
                    case 3:
                        System.out.println("B");
                        break;
                }
            } else if (av == 3) {
                switch (bv){
                    case 1:
                        System.out.println("B");
                        break;
                    case 2:
                        System.out.println("A");
                        break;
                }
            }
        }

    }

    // 4. 피보나치 수열
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        for (int i = 2; i < n; i++) {
            list.add(list.get(i-1) + list.get(i-2));
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
