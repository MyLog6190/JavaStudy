package _05_array.pracice;

import java.util.Arrays;

public class Pracice {
	public static void main(String[] args) {
		// 5-2
		// 2
		
		// 5-4
		System.out.println("== 4 ==");
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		int length = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				length++;
			}
		}
		average = total/length;
		
		System.out.println("total="+total);
		System.out.println("average="+average);
		
		// 5-5
		System.out.println();
		System.out.println("== 5 ==");
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		// 배열 ballArr 의 임의의 요소를 골라서 위치를 바꾼다 .
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length)+1;
			int tmp = 0;
			
			if(i == 0) {
				if(ballArr[i] != j) {
					ballArr[i] = j;
				}
			}
			
			for(int k = 0; k < i; k++) {
				if(ballArr[k] == j) {
					i--;
					break;
				}else {
					ballArr[i] = j;
				}
			}
			
		}
		ball3 = Arrays.copyOf(ballArr, ball3.length);
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		System.out.println();
		
		
		// 5-7
		System.out.println("== 7 ==");
		
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		// 문자열을 숫자로 변환한다 . 입력한 값이 숫자가 아닐 경우 예외가 발생한다 .
		int money = Integer.parseInt(args[0]);
		System.out.println("money="+money);
		int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
		int[] coin= {5, 5, 5, 5};
		// 단위별 동전의 개수
		
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
			money = money / coinUnit[i];
			/* (1) 아래의 로직에 맞게 코드를 작성하시오 .
			1. 금액 (money) 을 동전단위로 나눠서 필요한 동전의 개수 (coinNum) 를 구한다 .
			2. 배열 coin 에서 coinNum 만큼의 동전을 뺀다 .
			( 만일 충분한 동전이 없다면 배열 coin 에 있는 만큼만 뺀다 .)
			3. 금액에서 동전의 개수 (coinNum) 와 동전단위를 곱한 값을 뺀다 .
			*/
			for(int j = 0; j < coin.length; j++) {
				if(money / coinUnit[j] == 0) {
					
				}
			}
			System.out.println(coinUnit[i]+" 원 : "+coinNum);
		}
		
		if(money > 0) {
		System.out.println(" 거스름돈이 부족합니다 .");
			System.exit(0); // 프로그램을 종료한다 .
		}
		System.out.println("= 남은 동전의 개수 =");
		
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+" 원 :"+coin[i]);
		}
		
		System.out.println();
		// 5-8
		System.out.println("== 8 ==");
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for(int i=0; i < answer.length;i++) {
		/* (1) 알맞은 코드를 넣어 완성하시오 . */
			if(answer[i] == 1) {
				counter[0] += 1;
			}else if(answer[i] == 2) {
				counter[1] += 1;
			}else if(answer[i] == 3) {
				counter[2] += 1;
			}else if(answer[i] == 4) {
				counter[3] += 1;
			}
		}
		for(int i=0; i < counter.length;i++) {
			System.out.println( i + 1 + "*".repeat(counter[i]) );
		}
		System.out.println();
		
		
		
		// 5-11
		System.out.println("== 11 ==");
		
		System.out.println("== 11 ==");

		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][result[i].length-1] += score[i][j];
				result[result.length-1][j] += score[i][j];
				result[result.length-1][result[i].length-1] += score[i][j];
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}
	
}
