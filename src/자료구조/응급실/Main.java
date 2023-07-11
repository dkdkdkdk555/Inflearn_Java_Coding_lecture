package 자료구조.응급실;

import java.util.*;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}
public class Main {

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.add(new Person(i, arr[i]));
        }
        while(!Q.isEmpty()){
            Person tmp = Q.poll();
            for(Person x : Q){
                if(x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m) return answer;
            }
        }
        return answer; //  여기 올 일은 없음
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < args.length; i++) {
           arr[i] = scn.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
