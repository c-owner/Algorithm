package Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.print("배열의 크기를 입력하세요.\n >");
		int cnt = sc.nextInt();
		if (cnt > 10 || cnt < 1 ) {
			System.out.println("default : 5");
			cnt = 5; 
		}
		int[] arr = new int[cnt];
		
		System.out.print("배열의 음수와 양수를 임의로 저장하세요.\n >");
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = sc.nextInt();
		}
		System.out.println("현재 배열 목록\n"+Arrays.toString(arr));
		
		System.out.println("배열의 정렬 시작");
		for (int i = 0; i < arr.length-1; i++ ) {
			for (int j = 0; j < (arr.length-i)-1; j++ ) {
				if ( arr[j] > 0 && arr[j+1] < 0 ) {
					// && 하나라도 false가 등장하면 연산 중지
					// || 하나라도 true가 등장하면 연산 중지 
					int temp = arr[j]; // 교환 알고리즘
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
