package _11_collections.practice.p14;

import java.util.ArrayList;
import java.util.Scanner;

public class MainExample {
	static ArrayList record = new ArrayList(); //
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		while(true) {
			switch(displayMenu()) {
			case 1 :
			inputRecord();
			break;
			case 2 :
			displayRecord();
			break;
			case 3 :
			System.out.println(" 프로그램을 종료합니다 .");
			System.exit(0);
			}
		} // while(true)
	}
	
	// menu 를 보여주는 메서드
	static int displayMenu(){
		System.out.println("**************************************************");
		System.out.println("*성적 관리 프로그램*");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println(" 1. 학생성적 입력하기 ");
		System.out.println();
		System.out.println(" 2. 학생성적 보기 ");
		System.out.println();
		System.out.println(" 3. 프로그램 종료 ");
		System.out.println();
		System.out.print(" 원하는 메뉴를 선택하세요 .(1~3) : ");
		int menu = 0;
		/*
		
		(1) 아래의 로직에 맞게 코드를 작성하시오 .
		1. 화면으로부터 메뉴를 입력받는다 . 메뉴의 값은 1~3 사이의 값이어야 한다 .
		2. 1~3 사이의 값을 입력받지 않으면 , 메뉴의 선택이 잘못되었음을 알려주고
		다시 입력받는다 .( 유효한 값을 입력받을 때까지 반복해서 입력받는다 .)
		*/
		menu = Integer.parseInt(s.nextLine());
		System.out.println(menu);
		if(menu != 1 && menu != 2 && menu != 3) {
			System.out.println("메뉴 다시 입력");
			displayMenu();
		}
		
		return menu;
	} // public static int displayMenu(){
	
	static void inputRecord() {
		System.out.println("1. 학생성적 입력하기 ");
		System.out.println(" 이름 , 반 , 번호 , 국어성적 , 영어성적 , 수학성적 ' 의 순서로 공백없이 입력하세요 .");
		System.out.println(" 입력을 마치려면 q 를 입력하세요 . 메인화면으로 돌아갑니다 .");
		while(true) {
			System.out.print(">>");
		/*
		(2) 아래의 로직에 맞게 코드를 작성하시오 .
		1. Scanner 를 이용해서 화면으로 부터 데이터를 입력받는다 .(',' 를 구분자로 )
		2. 입력받은 값이 q 또는 Q 이면 메서드를 종료하고 ,
		그렇지 않으면 입력받은 값으로 Student 인스턴스를 생성하고 record 에 추가한다 .
		3. 입력받은 데이터에서 예외가 발생하면 , " 입력오류입니다 ." 를 보여주고 다시 입력받는다 .
		4. q 또는 Q 가 입력될 때까지 2~3 의 작업을 반복한다 .
		*/
			String input = s.nextLine();
			if( input.equals("q") || input.equals("Q") ) {
				break;
			}
			
			try {
				String str[] = input.split(",");
				record.add(new Student(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), 
						Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5])));
			} catch (Exception e) {
				System.out.println("입력 오류");
				
			}
			
			
		} // end of while
	} // public static void inputRecord() {
	// 데이터 목록을 보여주는 메서드
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		int length = record.size();
		if(length > 0) {
			System.out.println();
			System.out.println(" 이름반 번호 국어 영어 수학 총점 평균 전교등수 반등수 ");
			System.out.println("====================================================");
			for (int i = 0; i < length ; i++) {
			Student student = (Student)record.get(i);
			System.out.println(student);
			koreanTotal += student.kor;
			mathTotal += student.math;
			englishTotal += student.eng;
			total += student.total;
		}
			System.out.println("====================================================");
			System.out.println(" 총점 : "+koreanTotal+" "+englishTotal
			+" "+mathTotal+" "+total);
			System.out.println();
		} else {
			System.out.println("====================================================");
			System.out.println(" 데이터가 없습니다 .");
			System.out.println("====================================================");
		}
	} // static void displayRecord() {
}

