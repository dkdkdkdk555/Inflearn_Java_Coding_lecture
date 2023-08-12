package 정렬과탐색.뮤직비디오;

import java.util.*;

class TMain {

    public int count(int[] arr, int capacity){
        int cnt = 1; // dvd 장 수
        int sum = 0;
        for(int x : arr){
            if(sum+x > capacity){ // 한장의 용량보다 넘어가면
                cnt++; // dvd장 수 증가
                sum=x; // 새로운 장의 첫곡이니까..
            } else {
                sum +=x;
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // arr중 최대값, -> 음원은 쪼개질 수 없기때문에 lt됨
        int rt = Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= m){
                answer = mid;
                rt=mid-1;
            }
            else lt=mid+1;
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
        System.out.println(T.solution(n,m,arr));
    }
}

