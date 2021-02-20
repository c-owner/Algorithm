package com.greedy11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("동전의 종류 개수 입력 > ");
        int n = sc.nextInt();

        int[] nArr = {1,5,10,50,100,500,1000,5000,10000,50000};

        int cnt = 0; // 최소 동전개수
        System.out.print("> ");
        int k = sc.nextInt(); // 가치의 합
        int i = 10;

            for(int j = 0; j < n; j++  ) {
                System.out.println(nArr[j]);
            }
        if( n >= 1 && n <= 10 ) {

            while (k > 0) {
                if ( k >= nArr[n-1]) {
                    k -= nArr[n - 1];
                    cnt++;
                }
               if ( k < nArr[n - 1]) {
                   n--;
               }

                if (k == 0) {
                    break;
                }

            }
        }
        System.out.println(cnt);

    }
}
