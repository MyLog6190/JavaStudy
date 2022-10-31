package _06_class_.practice01.p02;

public class Practice {
	public static void main(String[] args) {
		System.out.println("== 2 ==");
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}	
}

class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard() {
		this.isKwang = true;
		this.num =1;
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
		
	}

	public String info() {
		String str = (isKwang == true)?"K":"";
		return num + str;
	}
}