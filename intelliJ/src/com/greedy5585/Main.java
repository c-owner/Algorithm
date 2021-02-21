package com.greedy5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        거스름돈
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int pay = Integer.parseInt(br.readLine());

        Integer money[] = {500, 100, 50, 10, 5, 1};
        Arrays.sort(money, Collections.reverseOrder());

        pay = 1000 - pay; // 1000원에서 지불할 금액을 빼면 받을 돈
        int cnt = 0;

        for(int i = 0; i < money.length; i++ ) {
            if (pay >= money[i]) {
                cnt += pay/money[i];
                pay %= money[i];
            }
        }
        System.out.println(cnt);
    }
}

