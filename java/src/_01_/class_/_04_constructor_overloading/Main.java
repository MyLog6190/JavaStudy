package _01_.class_._04_constructor_overloading;

public class Main {
	public static void main(String[] args) {
		
		// 생성자의 매개 변수에 따라 실행되는 생성자고 다르다.
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(1, 2);
		Constructor c3 = new Constructor(1, "2");
		Constructor c4 = new Constructor("1", 1);
	}
}
