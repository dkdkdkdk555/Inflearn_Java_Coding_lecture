package 문자열.문자열압축;

import java.util.Scanner;

/**
 * 11. 문자열 압축
 * 설명
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.

 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 */
public class Main2 {
    public static void main(String[] args) {
        // 입력
        Scanner scn = new Scanner(System.in);
        char[] charArray = scn.next().toCharArray();
        // 연속된 같은 문자별로 분리시키기
        String answer = ""; // k2
        for(int i=0; i<charArray.length; i++){ // 현재 k s t t s4 s e

                for (int j = 0; j < charArray.length; j++) { // 비교 k0 s1 t2 t3 s4 s5 e6
                    if (charArray[j] > charArray[i] && charArray[i] != charArray[j]) { // 다르다면
                        if (charArray[j] > charArray[i] + 1) { // 두개 이상
                            answer += charArray[i]; // + "" + ((j - i) + 1);
                        } else if (charArray[i] == charArray[j] - 1) { // 단개
                            answer += charArray[i];
                        }
                    }
                }

        }
        System.out.println(answer);
    }
}
