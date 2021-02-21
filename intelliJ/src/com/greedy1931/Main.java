package com.greedy1931;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            회의실 배정
         */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 회의의 수
        int[][] arr = new int[n][2];

        try {
            if (1 <= n && n <= 100000) {
                for (int i = 0; i < n; i++) {
                    arr[i][0] = sc.nextInt(); //
                    arr[i][1] = sc.nextInt(); //
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 끝나는 시간을 기준으로 정렬, 재정의
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });


        int cnt = 0;  // 회의 가능한 최대 개수
        int end_time = 0; // 이전 직전 시간

        // 비교 로직

        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= end_time) {
                end_time = arr[i][1];
                // 카운트 증가
                cnt++;
            }
        } // logic end

        System.out.println(cnt);

    }
}
