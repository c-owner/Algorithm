package Lv1;

import java.util.Scanner;

public class ex4 {

	static int getPageCount(int m,int n) {
		int cnt = m / n; 
		// m 은 총 건수 , n 은 페이지 게시물 수 
		if ( m % n > 0 ) {
			cnt++;
		}
		// 3항연산으로 보여줄 수도 있음
//		System.out.println(m % n > 0 ? cnt + 1 : cnt );
		
		System.out.println("m	n	출력");
		System.out.print(m+"	"+n+"	"+cnt);
		return cnt;
		
	}
	public static void main(String[] args) {
		
		
		System.out.println("게시판 프로그램");
		
		//page는 게시물 10개당 1page가 되는것
		// 11개면 2page
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 건수 입력 >");
		int m = sc.nextInt();
		System.out.print("게시물 수 입력 >");
		int n = sc.nextInt();
		 ex4.getPageCount(m, n);

		 System.out.println();

	}

}
