package 문자열.문자열압축;
import java.util.*;
public class TeacherMain {

    public static void main(String[] args) {
        TeacherMain t = new TeacherMain();
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(t.solution(str));
    }

    public String solution(String s) {
        String answer = "";
        // 맨뒤에 빈문자 추가
        s = s + "";
        int cnt = 1;
        for( int i=0; i<s.length()-1; i++){ // i는 빈문자 전 까지만 가야된다.
            if(s.charAt(i) == s.charAt(i+1)) cnt ++; // i 와 i+1과 같은면 cnt 증가
            else { // 같지않으면 문자열에 추가
                answer += s.charAt(i);
                if(cnt>1) answer += String.valueOf(cnt);
                cnt=1; // cnt 초기화
            }
        }

        return answer;
    }
}
