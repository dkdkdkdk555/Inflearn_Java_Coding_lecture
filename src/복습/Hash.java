package 복습;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash {

    // 1. 학급회장
    /*
        이전 내 풀이 : 각 후보들의 변수 싹 만들고 which문으로 ++하는 식 배열도 두번 돌리고
                    HashMap이 필요 없는 방식인데도 Map을 씀
        선생님 풀이 : Map객체를 이용하는 목적은 나와 같지만 배열을 두번 돌림
        현재 내 풀이 : 투표정산에 Map객체를 활용하는 동시에 최다득표 후보를 찾아냄
                    배열을 한번 돌려서 선생님 풀이 보다 더 효율적
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        char[] arr = str.toCharArray();

        int max=0;
        char maxc = ' ';
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(String.valueOf(arr[i]))){
                int k = map.get(String.valueOf(arr[i]));
                k++;
                if(k>max) {
                    max=k;
                    maxc=arr[i];
                }
                map.replace(String.valueOf(arr[i]),k);
            } else {
                map.put(String.valueOf(arr[i]), 1);
            }
        }

        System.out.println(maxc);
    }
}
