package 정렬과탐색.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class TMain {

    public int solution(int n, int m , int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(arr[mid]==m){
                answer = mid+1;
                break;
            }

            if(arr[mid]>m) rt = mid -1;
            else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scn.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
