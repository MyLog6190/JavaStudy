package _06_class_.practice02.p14;

public class Practice {
	public static void main(String args[]) {
		SutdaCard card = new SutdaCard(1, true);
	}
}

class SutdaCard {
	private final int num;
	private final boolean isKwang;
	
	public SutdaCard() {
		this(1, true);
	}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
	
}