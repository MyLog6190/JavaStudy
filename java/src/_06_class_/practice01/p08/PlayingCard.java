package _06_class_.practice01.p08;

public class PlayingCard {
	int kind;
	int num;
	static int width;
	static int height;
	
	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}
	
	public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1,1);
	}
	
	// 클래스 변수
	// width, height, kind, num
	
	// 인스턴스 변수
	// card
	
	// 지역변수
	// k, n
}

