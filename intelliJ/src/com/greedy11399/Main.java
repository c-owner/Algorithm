package com.greedy11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(3+1+4+3+2+2+4+3+5+1);
        // n번은 사람들의 번호
        System.out.print("사람의 수 입력 > ");
        int n = sc.nextInt();
        int[] p = new int[n+1]; // 사람 수 +1 만큼 배열선언 = 배열 인덱스를 1부터 시작할 것이기 때문이다.
        int min = 0; // 최솟값

            // 돈을 인출하는데 걸리는 시간
            for(int i = 1; i <= n; i++ ){
                System.out.print("시간 입력 > ");
                p[i] = sc.nextInt();
            }
        Arrays.sort(p); // 배열 정렬 ( 오름차순 정렬을 해야 최소화 할 수 있다.)
        for (int i = 1; i <= n; i++ ){ // 인덱스를 1번부터 시작하기위헤 한칸 씩 미루는 작업
            p[i] = p[i-1] + p[i]; // p[i-1]는 이전사람, p[i]는 현재 자신이 된다.
            // 이런식으로 1+2 > 3+3 > 6 + 3 > 9 + 4 > 13 이 된다.
            // 위의 걸린 시간들(1+3+6+9+13)의 합을 아래 min 변수에 담는다.
            min += p[i];

        }

        System.out.println(min);
        sc.close();

    }
}
