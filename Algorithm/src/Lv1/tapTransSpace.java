package Lv1;

import java.util.Scanner;

public class tapTransSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String tab = sc.nextLine();
		char[] str = tab.toCharArray();
		// 배열에 있는 문자들을 char 배열로 전환하여 집어 넣는다
		
		for (int i = 0; i <str.length; i++) {
			if(str[i] == '\u0009') {
				System.out.print("    ");
			} else {
				System.out.print(str[i]);
			}
		} 
		// 글을 입력하고 tab키 눌르면 4space로 전환하여 출력됨
		
		

	}

}
