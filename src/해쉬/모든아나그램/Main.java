package 해쉬.모든아나그램;

import java.util.*;
public class Main { // 오답.. 아마 Set객체로 바꾸는 어거지 과정을 넣어서 그런거같다..
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String S = scn.next();
        String T = scn.next();
        int t = T.length();
        // T문자열을 desc 하고 { a, b, c } 이런 set 형식으로 만듬
        char[] tarr = T.toCharArray();
        Arrays.sort(tarr);
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < tarr.length; i++) {
            tmap.put(tarr[i], tmap.getOrDefault(tarr[i], 0)+1);
        }
        String tStr = tmap.keySet().toString();

        // 슬라이딩 윈도우로 탐색
        char[] Sarr = S.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int lt=0, count=0;
        for (int i = 0; i < Sarr.length; i++) {
            map.put(Sarr[i], map.getOrDefault(Sarr[i], 0)+1);
            if(i+1 >= t){ // 정산
                Set set = map.keySet();
                String str = set.toString();
                if(tStr.equals(str)) count++;
                if(map.get(Sarr[lt])==1) map.remove(Sarr[lt]);
                else if(map.get(Sarr[lt])>1) map.put(Sarr[lt], map.get(Sarr[lt])-1);
                lt++;
            }
        }

        System.out.println(count);
    }
}
