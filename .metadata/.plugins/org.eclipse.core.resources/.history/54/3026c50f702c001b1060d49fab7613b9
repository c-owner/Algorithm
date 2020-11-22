package Lv1_2;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class DashInsert {
	static UnaryOperator<Integer> oddOrEven = i -> i % 2 == 0 ? i : -1 ;
	static UnaryOperator<String> dashInsert = s -> {
		
		int previous = 0, nextInsert = 0;
		
		String result = "";
		for(int i = 0; i< s.length(); i++) {
			nextInsert = oddOrEven.apply(Character.getNumericValue(s.charAt(i)));
			if ( nextInsert == previous ) {
				if ( previous == 1 ) {
					result += "*";
				} else {
					result += "-";
				}
			}
			previous = nextInsert;
			result += Character.toString(s.charAt(i));
		}
		return result;
	};
	// Operator  , -> if문을 줄이는 3항 연산

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(dashInsert.apply(sc.next()));
	}

}
