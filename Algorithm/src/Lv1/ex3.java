package Lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		String txt;     // 기록용 변수 선언
		String fileName = ("C:\\hoon\\input.txt");

		System.out.print("기록하실 내용을 입력하세요 : ");
		txt = sc.nextLine(); // 기록을 하기 위한 입력값
		try{
			BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
			fw.write(txt);
			fw.write("\r\n"); 
			fw.flush();  
			fw.close();
		} catch(Exception e){
			e.printStackTrace();
		} 
		
		try {
			File input_file = new File("C:\\hoon\\input.txt");
			FileReader fileReader = new FileReader(input_file);
			BufferedReader reader = new BufferedReader(fileReader);
			FileWriter fileWriter = new FileWriter("C:\\hoon\\output.txt");
			BufferedWriter writer = new BufferedWriter(fileWriter);

			int input_ascii; 
			while( (input_ascii = reader.read()) != -1 ) { 
				char input_char = (char)input_ascii;
				if (input_char == 9 ) {
					input_char = 32;
					for (int i=1; i<=4; i++) {
						writer.write(input_char);
					}
				} else {
					writer.write(input_char);
				}
			}
			writer.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
