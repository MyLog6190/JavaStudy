package _01_.class_._04_constructor_overloading;

public class Constructor {
	
	// 오버로딩 
    // 이름이 같더라도 매개변수 수와 타입이 다르면 다른 생성자로 인식
	Constructor() {
		System.out.println("1");
	}
	Constructor(int i, int j) {
		System.out.println("2");
	}
	Constructor(int i, String s) {
		System.out.println("3");
	}
	Constructor(String s, int i) {
		System.out.println("4");
	}
}
