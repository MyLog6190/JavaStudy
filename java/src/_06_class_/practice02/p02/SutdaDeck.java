package _06_class_.practice02.p02;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	/*
	문제 7-1 의 답이므로 내용생략
	*/
	/*
	*/
	// SutdaDeck
	public void shuffle() {
		// TODO Auto-generated method stub
		
	}
	
	public char[] pick() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public char[] pick(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

class Exercise7_2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		
		deck.shuffle();
		
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
