package 해쉬.아나그램;

import java.util.*;
public class Main { // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sorted1 = String.valueOf(arr1);
        String sorted2 = String.valueOf(arr2);

        System.out.println(sorted1.equals(sorted2) ? "YES" : "NO");
    }
}
