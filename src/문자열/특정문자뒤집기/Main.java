package 문자열.특정문자뒤집기;
import java.util.*;
/**
 * 5. 특정 문자 뒤집기
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */
public class Main {
    public static void main(String[] args) {
        // 특수문자포함한 문자열 입력받음
        Scanner scn = new Scanner(System.in);
        char[] chars = scn.next().toCharArray();
        // 하나씩 검사해서 영어면 따로 배열에 저장 그리고 빈자리는 0 으로 만들음
        String alphabet = "";
        for(int i=0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) {
                alphabet += chars[i];
                chars[i] = 0;
            }
        }

        // 0 인 자리에 alphabet 뒤집고 char배열로 만들어서 하나씩 넣어줌
        StringBuffer sb = new StringBuffer(alphabet);
        char[] reverseChar = sb.reverse().toString().toCharArray();
        for(int j=0; j< chars.length; j++){
            for(int i=0; i< chars.length; i++){
                if(chars[i] == 0 && reverseChar[j] != 0){
                   chars[i] = reverseChar[j];
                   reverseChar[j] = 0;
                   break;
                }
            }
        }

        System.out.println(String.valueOf(chars));

    }
}
