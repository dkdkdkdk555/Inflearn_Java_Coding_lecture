package 문자열.문자열압축;
import java.util.*;
/**
 * 11. 문자열 압축
 * 설명
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[] str = scn.next().toCharArray();
        String answer = "";
        int count = 0;
        for(int i = 0;i<str.length;i++){

            for(int j = 0;j<str.length;j++){
                if(str[i] == str[j]){
                    count++;
                } else if(j > i && str[j] != str[i]){
                    break;
                }
            }

            if(!answer.contains(Character.toString(str[i])) && count > 1){
                answer += str[i] + "" + count;
            }
            else if(count <= 1){
                answer += str[i];
            }
            else if(answer.contains(Character.toString(str[i]))){ // 포함되어있지만 떨어져있는경
                if(str[i] != str[i-1]){ // 단독
                    answer += str[i];
                } else if (count > 1) { // 복수
                    answer += str[i] + "" + count;
                }
            }
            count = 0;
        }

        System.out.println(answer);
    }
}
