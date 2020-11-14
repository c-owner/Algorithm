package Lv1;

import java.util.Arrays;
import java.util.Scanner;

 
public class ex2 {

	public static void main(String[] args) {
		
		/*
		 * 10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 
		 * 이들의 총합은 23이다. 1000미만의 자연수에서 3,5의 배수의 총합을
		 * 구하라.
		 */
		
		// i < 10  i % 3 == 0  i % 5 == 0 , 
		// 
		
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < num.length;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		
		int sum = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		// result == 233168
			
	}

}
