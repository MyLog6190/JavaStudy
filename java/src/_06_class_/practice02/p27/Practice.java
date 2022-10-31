package _06_class_.practice02.p27;

public class Practice {
	public static void main(String[] args) {
		
		/*
		(4) . 알맞은 코드를 넣어 완성하시오
		*/
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		inner.method1();
	}
}

class Outer {
	int value=10;
	class Inner {
		int value=20;
		void method1() {
			int value=30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝
