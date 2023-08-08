package 정렬과탐색.뮤직비디오;

import java.util.*;

public class Main{ // 오답

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scn.nextInt();

        Arrays.sort(arr);

        int lt = arr[n-1];
        int rt = 0;
        int result = 0;
        for (int i = 0; i < n; i++) rt += arr[i];

        while(lt<=rt){ // 이진검색
            int mid = (lt+rt)/2;
            int s = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                s += arr[i];
                if(s>=mid){
                    count++;
                    s=arr[i];
                }
            }

            if(count==m) {
                result = mid;
                rt = mid-1;
            } else if(count > m) {
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }

        System.out.println(result);
    }
}