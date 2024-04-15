package 복습;

import 배열.멘토링.TMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {

    // 1. 큰 수 출력하기
    public static void main1(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if(i==0) result += arr[i] + " ";
            if(i!=0 && arr[i] > arr[i-1]) {
                result += arr[i] + " ";
            }

        }

        System.out.println(result);
    }


    // 2. 보이는 학생
    public static void main2(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int count = 1;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > max) {
                count++;
                max = arr[i];
            }
        }

        System.out.println(count);

    }

    // 3. 가위 바위 보
    public static void main3(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) a[i] = scn.nextInt();
        for (int i = 0; i < n; i++) b[i] = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int av = a[i];
            int bv = b[i];

            if(av==bv){
                System.out.println("D");
                continue;
            }

            if (av==1){
                switch (bv){
                    case 2:
                        System.out.println("B");
                        break;
                    case 3:
                        System.out.println("A");
                        break;
                }
            } else if (av==2) {
                switch (bv){
                    case 1:
                        System.out.println("A");
                        break;
                    case 3:
                        System.out.println("B");
                        break;
                }
            } else if (av == 3) {
                switch (bv){
                    case 1:
                        System.out.println("B");
                        break;
                    case 2:
                        System.out.println("A");
                        break;
                }
            }
        }

    }

    // 4. 피보나치 수열
    public static void main4(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        for (int i = 2; i < n; i++) {
            list.add(list.get(i-1) + list.get(i-2));
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    // 5. 소수
    public static void main5(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n+1];
        int answer = 0;
        for (int i = 2; i <=n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j+i) {
                    arr[j] =1;

                }
            }
        }

        System.out.println(answer);
    }

    // 6. 뒤집은 소수
    public static void main6(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }

        String answer = "";

        for (String num : arr) {
            StringBuffer sb = new StringBuffer(num);
            int rnum = Integer.valueOf(sb.reverse().toString());
            for (int i = 2; i <= rnum; i++) {
                if(i==rnum){
                    answer += rnum + " ";
                }
                if(rnum%i == 0){
                    break;
                }

            }
        }

        System.out.println(answer);
    }

    // 7. 점수계산
    public static void main7(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int total = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==1){
                cnt++;
                total += cnt;
            } else {
                cnt = 0;
            }

        }

        System.out.println(total);
    }


    // 8. 등수구하기
    public static void main8(String[] args) {
        /*
            한번에 등수를 매기는게 아닌 개별 점수별로
            등수를 파악
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(arr[j] > arr[i]) cnt++; // 비교군이 자기보다 큰게 있을때마다 등수 밀림
            }

            answer[i] = cnt;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    // 9.격자판 최대합
    public static void main9(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int max = 0;
        int LtoR = 0;
        int RtoL = 0;
        for (int i = 0; i < n; i++) {
            int sumH = 0;
            int sumY = 0;
            for (int j = 0; j < n; j++) {
               sumH += arr[i][j];
               sumY += arr[j][i];
               if(i==j) LtoR += arr[i][j];
               if(i+j == (n-1)) RtoL += arr[i][j];
            }

            if(sumH > max) max = sumH;
            if(sumY > max) max = sumY;

        }

        if(LtoR > max) max = LtoR;
        if(RtoL > max) max = RtoL;

        System.out.println(max);

    }

    // 10.봉우리
    public static void main10(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n+2][n+2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n){ // 가장자리가 아니여야 함
                        if(arr[nx][ny] >= arr[i][j]) {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) answer++;
            }
        }

        System.out.println(answer);
    }

    // 11. 임시반장 정하기
    public static void main11(String[] args) {
        /**
         *  오답,
         *  학생과 학생(열과 열)으로 비교하지 않고
         *  한 학생에 대해 for문을 돌때 한 학년에서 전체 학생들과 같은 반이 된적이 있는지를 검사했다.
         *  이렇게 되면 삼중포문을 다돌기때문에 run time exceed 가 날 수 있고
         *  같은 반이었던 학생의 수를 세는것인데 중복으로 세질 수 있어서 잘못된 발상이었다.
         *
         *  오로지 다른 학생과 해당 학생(열)이 같은 반이 된적이 있는지만 따지려면
         *  학생과 학생 (열과 열)로 하나씩 비교하는 발상이 옳다.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }


        int answer = 0, max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if(i!=k){
                        if(arr[i][j] == arr[k][j]) {
                            cnt++;
                        }
                    }
                }
            }
            if(cnt>max) {
                max = cnt;
                answer = i;
            }
        }

        System.out.println(answer+1);
    }


    // 12. 멘토링
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt(); // 인원수
        int m= scn.nextInt(); // 시험횟수
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int s = arr[0][i];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if(j==0){
                        if(s == arr[j][k]) {
                            cnt = n - (k+1);
                        }
                    } else {
                        if(s==arr[j][k]){
                            break;
                        } else {
                            cnt--;
                        }
                    }



                }
            }
        }

        System.out.println(cnt);

    }

}
