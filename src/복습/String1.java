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
    public static void main4(String[] args) {
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

    // 9. 숫자만 추출
    public static void main5(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String tobeint = "";
        for (char c :str.toCharArray()) {
            if(!Character.isAlphabetic(c)){
                tobeint += c;
            }
        }

        int result = Integer.parseInt(tobeint);

        System.out.println(result);
    }

    // 10. 가장 짧은 문자거리
    public static void main6(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String[] arr = str.split(" ");
        char[] chars = arr[0].toCharArray();
        char c = arr[1].charAt(0);

        String result = "";
        int d = 100;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if(c == chars[j]){
                   if(Math.abs(i-j) <= d) d = Math.abs(i-j);
                }
            }

            result += d + " ";
            d = 100;
        }

        System.out.println(result);
    }

    // 11. 문자열 압축
    public static void main7(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char[] chars = str.toCharArray();
        int count = 1;
        String result = "";
        char s = '0';

        for (int i = 0; i < chars.length; i++) {
            if (s == chars[i]){
                count++;
                if(i+1 == chars.length) result += (String.valueOf(s) + count);
            } else {
                if(s != '0' && count > 1) {
                    result += (String.valueOf(s) + count);
                } else if(s != '0' && count == 1){
                    result += String.valueOf(s);
                }
                s = chars[i];
                count = 1;

                if(i+1 == chars.length) result += String.valueOf(s);
            }
        }

        System.out.println(result);
    }

    // 12.암호
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();

        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        System.out.println(answer);
    }
}
