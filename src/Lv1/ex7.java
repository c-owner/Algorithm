/*
		 메모리 공간을 동적으로 사용하여 관리하기
 		프로그램 실행 순서
	입력할 정수의 개수를 사용자로부터 입력 받는다.
	입력받은 정수의 개수만큼 정수를 입력받는다.
	입력받은 정수의 합과 평균 값을 출력한다.
	할당된 메모리공간을 비운다.
	요구사항
	
	메모리공간은 사용자의 입력 수의 따라 변동된다.
	사용한 공간은 마지막에 비워야 한다.
	배열을 사용하면 안된다.
 */
package Lv1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		System.out.print("개수 입력 >");
		cnt = sc.nextInt();
		for(int i = 0; i < cnt; i ++ ) {
			System.out.print(">");
			int num = sc.nextInt();
			sum += num; 
		}
		int avg = (sum/cnt);
		System.out.printf("개수 : %d, 합 : %d, 평균 : %d",cnt,sum,avg);
		sc.close();
		
		
	}

}
