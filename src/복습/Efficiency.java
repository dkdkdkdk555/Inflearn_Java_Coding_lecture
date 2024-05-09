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
    public static void main2(String[] args) {
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

    // 3. 최대 매출
    // Sliding Window 문제..
    public static void main3(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int lt = 0;
        int rt = k-1;

        int sum = 0;
        int max = 0;

        while (rt < (n-1)){
            sum += arr[lt];
            if(lt==rt){
                if(sum>max){
                    max = sum;
                }

                sum = 0;
                rt++;
                lt = rt - (k-1);
            } else {
                lt++;
            }
        }

        System.out.println(max);
    }


    // 4. 연속 부분 수열 -> 오답.. 접근방식은 맞았음..로직이 틀림
    public static void main4(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int cnt = 0;
        int sum = 0;
        int lt=0, rt=0;

        while (rt <= n){
            if(sum < m) {
                sum = sum + arr[rt];
                rt++;
            } else if (sum > m) {
                sum = sum - arr[lt];
                lt++;
            } else if (sum == m) {
                cnt++;
                sum = sum - arr[lt];
                lt++;
            }
        }

        System.out.println(cnt);
    }

    // 5. 연속된 자연수의 합
    public static void main5(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int sum = 0;
        int lt=0, rt=0;
        int answer = 0;
        while (rt<n-1){
            if(sum<n){
                sum += arr[rt++];
            } else if(sum==n){
                answer++;
                sum -= arr[lt++];
            } else if(sum>n){
                sum-=arr[lt++];
            }
        }

        System.out.println(answer);
    }

    // 6. 최대 길이 연속부분수열->오답,,
    // <= rt가 0을 만났을때 0이 k 이상일때만 길이를 구함..
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int lt=0, rt=0, max=0, kr=0, kl=0;
        while(rt<n){ // 13 = i
           rt++;
           if(rt>=n) break;
           if(arr[rt]==0){
               if(kr==k){ // kr == 2
                   rt--;
                   max = (rt-lt)+1;
                   kr=0;
                   while(kl<=k){
                       lt++;
                       if(arr[lt]==0){
                           if(kl==k){
                               kl=0;
                               break;
                           }else {
                               kl++;
                           }
                       } else {
                           if (kl==k){
                               kl=0;
                               break;
                           }
                       }
                   }
               } else {
                   kr++; //2
               }
           }
        }

        System.out.println(max);


    }

}
