package 복습;

import java.util.Scanner;

public class String1 {

    // 4. 단어 뒤집기
    public static void mains(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            String str = scn.next();
            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb.reverse().toString());
        }
    }

    // 5. 특정 문자 뒤집기
    public static void main1(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char[] chars = str.toCharArray();

        String t = "";

        for (int i = 0; i < chars.length; i++) {
            if(Character.isAlphabetic(chars[i])){
                t += chars[i];
                chars[i] = '0';
            }
        }

        StringBuffer sb = new StringBuffer(t);
        char[] reverseChars = sb.reverse().toString().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '0'){
                for (int j = 0; j < reverseChars.length; j++) {
                    if(reverseChars[j] != '0') {
                        chars[i] = reverseChars[j];
                        reverseChars[j] = '0';
                        break;
                    }
                }
            }
        }

        String result = String.valueOf(chars);
        System.out.println(result);

    }

    // 6. 중복문자제거
    public static void main2(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        char[] chars = str.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if(!result.contains(String.valueOf(chars[i]))){
                result += chars[i];
            }
        }

        System.out.println(result);
    }

    // 7. 회문 문자열
    public static void main3(String[] args) {
        Scanner scn = new Scanner(System.in);
        String next = scn.next();
        String text = next.toUpperCase();
        StringBuffer sb = new StringBuffer(text);
        String str = sb.reverse().toString();

        if(text.equals(str)){
            System.out.print("YES");
        } else {
            System.out.println("NO");
        }
    }

    // 8. 팰린드롬
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine().toUpperCase();
        char[] arr = str.toCharArray();
        String str2 = "";
        for (char c : arr) {
            if(Character.isAlphabetic(c)) str2 += c;
        }

        StringBuffer sb = new StringBuffer(str2);
        String streverse = sb.reverse().toString();


        if(str2.equals(streverse)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
