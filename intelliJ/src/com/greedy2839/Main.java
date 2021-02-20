package com.greedy2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0; // N킬로그램
        int result = 0; // 배달할 봉지 최소 개수

        System.out.print("몇 kg을 배달 합니까?\n입력 >");
        n = sc.nextInt();
        if(n >= 3 && n <= 5000) {
            while (n > 0) {
                if (n % 5 == 0) {
                    n -= 5;
                    result++;
                } else if (n % 3 == 0) {
                    n -= 3;
                    result++;
                } else if (n > 3) {
                    n -= 3;
                    result++;
                } else if (n > 5) {
                    n -= 5;
                    result++;
                } else {
                    result = -1;
                    break;

                }
            }
        } else {
            System.out.println("잘못된 수를 입력하셨습니다.");
        }
        System.out.println(result + "개");

    }
}


