package 문자열.문자최단거리;

import java.util.*;
/**
 * 10. 가장 짧은 문자거리
 * 설명
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String[] strs = input.split(" "); // 문자열과 문자 나눔
        char[] str = strs[0].toCharArray(); // 주어진 문자열
        char c = strs[1].charAt(0); // 주어진 문자
        String distance = "";
        int d = 100;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length;j++){
                if(str[j] == c){ // e와 같다면
                    if(Math.abs(i - j)<=d) { // 최단거리로 구하기 위한 로직
                        d = Math.abs(i - j);
                    }
                }
            }
            // 더 가까운 애가 있을 수 있으므로 바깥 반복문에서 추가해줘야 함
            distance += d + " ";
            d = 100;
        }
        System.out.println(distance);
    }
}
