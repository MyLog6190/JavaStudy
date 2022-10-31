package _06_class_.practice02.p02;

import java.util.Iterator;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	public SutdaDeck() {
		for(int i = 0; i < CARD_NUM/2; i++) {
			cards[i] = new SutdaCard((i+1), i+1 == 1 || i+1 == 3 || i+1 == 8?true:false);
		}
		
		for(int j = 10; j < CARD_NUM; j++) {
			cards[j] = new SutdaCard((j-9), false);
		}
	}
	
	// SutdaDeck
	public void shuffle() {
		int index[] = new int[20];
		SutdaCard[] copyCards = new SutdaCard[CARD_NUM];
		for(int i = 0; i < CARD_NUM; i++) {
			copyCards[i] = cards[i];
			index[i] = (int) Math.floor( (Math.random() * CARD_NUM ) );
			for(int j = 0; j < i; j++) {
				if(index[i] == index[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < index.length; i++) { cards[i] = copyCards[index[i]]; }
		 
	}
	

	public SutdaCard pick() {
		int ran = (int) Math.floor( (Math.random() * CARD_NUM) );
		return cards[ran];
	}
	
	public SutdaCard pick(int index) {
		return cards[index];
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
