package com.greedy11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        int n = sc.nextInt();
        int[] nArr = {1,5,10,50,100,500,1000,5000,10000,50000};
        int cnt = 0; // 최소 동전개수
        System.out.print("> ");
        int k = sc.nextInt(); // 가치의 합

        if( n < 1 && n > 10 ) {
            System.exit(0);
        }

            while(k > 0 ) {
                int i = 10;
                if(k % nArr[i-1] == 0 ){
                   k -= nArr[i-1];
                    cnt++;
                } else {
                    i--;
                }
                if( k == 0 ) {
                    break;
                }
            }

        System.out.println(cnt);








    }
}
