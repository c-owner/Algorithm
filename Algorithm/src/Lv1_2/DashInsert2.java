package Lv1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class DashInsert2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<String> dash = new ArrayList<String>();
		// String을 갖고있는 자료타입(클래스타입)을 명시해준다.
		
		System.out.print("정수 입력 >");
		String num = sc.next();
		String[] strArray = num.split("");
		// split 함수로 입력한 문자열 잘라서 배열에 넣기
		// 문자열을 자른 배열을 strArray로 가진 인덱스 만큼 넣고
		for (int i = 0; i < strArray.length; i++ ) {
			dash.add(i,strArray[i]);
			// 배열리스트 Dash 인덱스에 i칸씩 집어넣는다.
		}
		
		for (int j =0; j<dash.size()-1; j++) {
			// 배열리스트의 길이 만큼 반복할건데 마지막 -1인 이유는
			// 그 끝 index가 바로 앞 index와 비교할 값이 존재하지 않아서 조건걸음 
			// 애초에 안하면 오류남
			if(dash.get(j).contentEquals("-") || dash.get(j).contentEquals("*")) {
				// 배열리스트의 있는 j 인덱스가 이미 "-","*" 존재하면 
				// continue; 무시
				continue;
			}  
			else if (Integer.parseInt(dash.get(j))%2 == 0 && Integer.parseInt(dash.get(j+1))%2 == 0) {
				// 배열리스트에 있는 문자열을 정수로 변한하여 2로 나누어 계산 때릴 때
				// 연속적으로 (한단계 높은 인덱스도) 짝수라면 *을 집어넣기
				dash.add(j+1,"*");
			} else if (Integer.parseInt(dash.get(j))%2==1 && Integer.parseInt(dash.get(j+1))%2 == 1 ) {
				// 위 계산처럼 마찬가지로 홀수가 연속적 이면 "-"
				dash.add(j+1, "-");
			}
		}
		// 향상 for문으로 배열리스트 확인하기
		for (String str : dash) {
			System.out.print(str);
		}System.out.println();
		sc.close(); //스캐너 닫아버리기
	}

}
