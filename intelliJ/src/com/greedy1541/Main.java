package com.greedy1541;

import java.util.Scanner;

public class Main {
    static int min = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] str = input.split("-");
        min += sum(str[0].split("[+]"));

        for (int i = 1; i < str.length; i++ ) {
         min -= sum(str[i].split("[+]"));
            System.out.println("min = "+min);
        }
        System.out.println(min);


    }

    static int sum(String[] input) {
        int result = 0;
        for (String num : input ) {
            result += Integer.parseInt(num);
            System.out.println("num = " + num);
            }
        System.out.println("result = " + result);
        return result;
    }

}

