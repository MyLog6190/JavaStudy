package _06_class_.practice02.p05;

public class Practice {
	public static void main(String[] args) {
			Tv t = new Tv();
	}
}
class Product{
	int price;
	// 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}

class Tv extends Product {
	
	Tv() {super(0);}

	public String toString() {
		return "Tv";
	}
}