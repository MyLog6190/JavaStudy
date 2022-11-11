package _12_Generics.practice.p05;

public class Deck {
	final int CARD_NUM = Card.Kind.values().length
			* Card.Number.values().length; // 카드의 개수
	Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열을 포함
	Deck () {
			/*
			(1) . 알맞은 코드를 넣어서 완성하시오
			Deck . 의 카드를 초기화한다
			*/
		int i = 0;
		for(Card.Kind kind : Card.Kind.values()) {
			for(Card.Number number : Card.Number.values()) {
				cardArr[i++] = new Card(kind, number);
			}
		}
	}
	
	Card pick(int index) { // (index) 지정된 위치 에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}
			
	Card pick() { // Deck . 에서 카드 하나를 선택한다
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
			
	void shuffle() { // . 카드의 순서를 섞는다
		for(int i=0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}
