package _11_collections.practice.p11;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return num==c.num && isKwang==c.isKwang;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
}
