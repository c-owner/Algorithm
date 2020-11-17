package Lv1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class Prac {
	public static void main(String[] args) {
		String str = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] name = str.split(",");
		ArrayList<String> name_list = new ArrayList<>();

		for (int i = 0; i < name.length; i++) {
			name_list.add(name[i]);
		}

		//김씨 이씨
		int cntK = 0, cntL = 0;
		for (int i = 0; i < name.length; i++) {
			if(name[i].contains("김")) {
				cntK++;
			}else if(name[i].contains("이")){
				cntL++;
			}
		}
		System.out.println("김씨: "+cntK);
		System.out.println("이씨: "+cntL);

		//이재영 몇번반복?
		int cnt=0;
		for (int i = 0; i < name.length; i++) {
			if(name[i].equals("이재영")) {
				cnt++;
			}
		}
		System.out.println("이재영 몇번 반복?");
		System.out.println(cnt);

		//중복 제거한 이름 출력
//		HashSet<String> name_set = new HashSet<>();
		HashSet name_set = new HashSet();
		for (int i = 0; i < name.length; i++) {
			name_set.add(name[i]);
			
		}
		System.out.println(name_set);

	 
		
		//중복 제거하고 오름차순으로 정렬
		// Hash를 다시 Array로 변환해서 정렬 후 출력 
		ArrayList name_set2 = new ArrayList(name_set); 
		Collections.sort(name_set2); // 정렬 
	    int size=name_set2.size();
        for(int i=0;i<=size-1; i++){
            System.out.print(name_set2.get(i)+", ");
        }
 
	}



}
