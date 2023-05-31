package 문자열.암호;

import java.util.*;
public class TeacherMain {
    public static void main(String[] args) {
        TeacherMain t = new TeacherMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        System.out.println(t.solution(n, str));
    }

    public String solution(int n, String s){
        String answer = "";
        for(int i=0;i<n;i++){
            // 2진수로 변환
            String tmp = s.substring(0, 7).replace("#", "1").replace("*", "0");
            // 2진수 -> 아스키코드
            int num = Integer.parseInt(tmp, 2);
            // 아스키코드 -> 문자
            answer += (char) num;
            // 변환 안한부분만 남도록 index 7부터 끝까지 남기기
            s = s.substring(7);
        }

        return answer;
    }
}
