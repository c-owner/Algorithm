package Lv1;

public class ex6 {

	static int time3 = 0; // 3이 나오는 시간을 카운트

	static void digitalMethod() {
		for (int i = 0; i < 24; i ++ ) {
			if(i == 3 || i == 13 || i == 23 ) {
				time3+=60; // 60분으로
				continue;
			} else for(int m = 0; m < 6; m++) {
				if(m == 3 ) {
					time3+= 10;
					continue;
				} else {
					time3++;
				}
			}
		}
		System.out.println("3이 있는 총 60초의 시간은");
		System.out.println(time3*60+"초 입니다.");
	}
	
	public static void main(String[] args) {

		System.out.println();
		digitalMethod();
		
		
	}

}
