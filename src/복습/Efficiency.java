package 복습;

import java.util.*;

public class Efficiency {

    // 1. 두 배열 합치기
    public static void main1(String[] args) {
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

    // 2. 공통원소 구하기
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

        Arrays.sort(nrr);
        Arrays.sort(mrr);

        List<Integer> arr = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1<n && p2 < m){
            if(nrr[p1] == mrr[p2]){
                arr.add(nrr[p1++]); // 추가한다음에 p1증가
                p2++; // 오름차순으로 정렬을 해뒀으니 다음 nrr[p1]은 무조건 현재 mrr[p2] 보다 큼, 그러므로 증가시켜야함
            } else if (nrr[p1] < mrr[p2]){
                p1++; // 자기보다 큰것들과 비교할 필요 없으니 자신의 반복자를 증가시킴
            } else if (nrr[p1] > mrr[p2]){
                p2++; // 자기보다 작은것과 비교할 필요 없으니 비교군의 반복자를 증가시킴
            }
        }

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }


    }

}
