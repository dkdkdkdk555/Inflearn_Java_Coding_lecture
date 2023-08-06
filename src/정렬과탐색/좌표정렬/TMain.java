package 정렬과탐색.좌표정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{ // 좌표 정렬 문제는 Comparable 구현 클래스 만들자!

    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override // 정렬기준잡아주기
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y; // 오름차순이면 음수가 리턴되야한다.파라미터로 들어온게 더 커야 오름차순,
        // 내림차순일 경우, 양수가 리턴되야 한다.
        else return this.x-o.x;
    }
}
public class TMain {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr); // 이때 정렬의 기준이 오버라이드한 compareTo..

        for(Point o :arr) System.out.println(o.x + " " + o.y);
    }
}
