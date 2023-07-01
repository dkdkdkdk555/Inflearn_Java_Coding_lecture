package 해쉬.모든아나그램;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main2 {// 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String S = scn.next();
        String T = scn.next();
        int t = T.length();
        char[] Tarr = T.toCharArray();
        HashMap<Character, Integer> tm = new HashMap<>();
        for (int i = 0; i <t; i++) {
            tm.put(Tarr[i], tm.getOrDefault(Tarr[i], 0)+1);
        }

        // 슬라이딩 윈도우로 탐색
        char[] Sarr = S.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int lt=0, count=0;
        for (int i = 0; i < Sarr.length; i++) {
            map.put(Sarr[i], map.getOrDefault(Sarr[i], 0)+1);
            if(i+1 >= t){ // 정산
                if(tm.equals(map)) count++;
                if(map.get(Sarr[lt])==1) map.remove(Sarr[lt]);
                else if(map.get(Sarr[lt])>1) map.put(Sarr[lt], map.get(Sarr[lt])-1);
                lt++;
            }
        }

        System.out.println(count);
    }
}
