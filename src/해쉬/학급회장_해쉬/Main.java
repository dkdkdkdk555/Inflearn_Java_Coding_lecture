package 해쉬.학급회장_해쉬;

import java.util.*;
public class Main {  // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String paper = scn.next();
        char[] arr = paper.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        int A=0, B=0, C=0, D=0, E=0;
        for (char c : arr) {
            switch (c){
                case 'A':
                    A++;
                    break;
                case 'B':
                    B++;
                    break;
                case 'C':
                    C++;
                    break;
                case 'D':
                    D++;
                    break;
                case 'E':
                    E++;
                    break;
            }
        }
        map.put('A', A);
        map.put('B', B);
        map.put('C', C);
        map.put('D', D);
        map.put('E', E);
        int max = 0;
        char answer = ' ';
        for (Character character : map.keySet()) {
            int value = map.get(character);
            if(value>max){
                max = value;
                answer = character;
            }
        }
        System.out.println(answer);
    }
}
