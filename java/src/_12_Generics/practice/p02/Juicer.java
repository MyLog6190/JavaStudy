package _12_Generics.practice.p02;

public class Juicer {
	static <T extends Fruit> String makeJuice(FruitBox<T> box) {
		String tmp = "";
		for(Fruit f : box.getList()) tmp += f + " ";
		return tmp;
	}

}
