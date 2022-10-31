package _06_class_.practice02.p20;

public class Practice {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x);
		p.method();
		// 200
		//Child Method
		System.out.println("c.x = " + c.x);
		c.method();
		// 200
		//Child Method
	}
}
class Parent {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}
class Child extends Parent {
	int x = 200;
	void method() {
		System.out.println("Child Method");
	}
}
