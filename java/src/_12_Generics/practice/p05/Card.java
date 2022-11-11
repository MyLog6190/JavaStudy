package _12_Generics.practice.p05;

public class Card {
	enum Kind { CLOVER, HEART, DIAMOND, SPADE }
	enum Number {
		ACE, TWO, THREE, FOUR, FIVE,
		SIX, SEVEN, EIGHT, NINE, TEN,
		JACK, QUEEN, KING
	}
	Kind kind;
	Number num;
	
	Card() {
		this(Kind.SPADE, Number.ACE);
	}
	
	Card(Kind kind, Number num) {
		this.kind = kind;
		this.num = num;
	}
	public String toString() {
		return "[" + kind.name() + "," + num.name() + "]";
	}
}
