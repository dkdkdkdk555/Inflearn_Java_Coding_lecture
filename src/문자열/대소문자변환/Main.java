package 문자열.대소문자변환;

import java.util.*;
/**
 * 2. 대소문자 변환
 *
 * 설명
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next().toString();
        char[] charArr = str.toCharArray();
        String answer = "";
        String s = "";
        for(char c : charArr){
            if (Character.isUpperCase(c)) { // 대문자 이면 --> 선생님은 isUpperCase 함수 이용했다.
                s = String.valueOf(c).toLowerCase();
            } else if(c >= 'a' && c <= 'z') { // 소문자 이면
                s = String.valueOf(c).toUpperCase();
            }
            answer += s; // 응답에 추가
        }

        System.out.println(answer);
    }

}
