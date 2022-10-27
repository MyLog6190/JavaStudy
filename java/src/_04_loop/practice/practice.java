package _04_loop.practice;

import java.util.Iterator;

public class practice {
	public static void main(String[] args) {
		
		// 2
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("2번 : " + sum);
		System.out.println();
		
		// 4
		sum = 0;
		int num = 1;
		while(sum < 100) {
			sum = (num%2 == 0)?sum - num : sum + num ;
			num++;
		}
		System.out.println("4번 : " + num );
		System.out.println();
		
		// 6
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println("5번 : " + i + "+" + j + "=" + (i+j));
				}
			}
		}
		System.out.println();
		
		// 8
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if( (2 * x) + (4 * y)  == 10 ) {
					System.out.println("8번 " + "x : " + x + " y :" + y );
				}
			}
		}
		System.out.println();
		
		// 10
		num = 12345;
		sum = 0;
		for(int i = 0; i < 5; i++) {
			int num2 = num % 10;
			num = num / 10;
			sum += num2;
		}
		System.out.println("10번 sum="+sum);
		System.out.println();
		
		// 12
		System.out.println("== 12번  ==");
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println( i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		System.out.println();
		
		// 14
		System.out.println("== 14번 ==");
		int answer = (int) Math.floor( (Math.random() * 100) + 1 );
		int input = 0;
		int count = 0;
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1 과 100 사이의 값을 입력하세요 :");
			input = s.nextInt();
			if(answer == input) {
				System.out.println("맞췄습니다.");
				break;
			}
		} while(true);
	}
}
