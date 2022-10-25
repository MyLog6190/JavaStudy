package _01_.class_._03_instance_create;

import _01_.class_._02_class_coposition.ClassComposition;

public class InstanceCreate {
	public static void main(String[] args) {
		// 클래스를 사용하여 인스턴스 생성
		// 인스턴스를 생성하면 기본 생성자가 실행되어 인스턴스 초기화를 해준다.
		ClassComposition cc = new ClassComposition();
		
		// 생성한 객체로 클래스에서 작성한 매소드를 호출할 수 있다.
		// 패키지가 다르면 접근 제어자가 public인 필드나, 메소드만 호출 가능하다.
		cc.method();
	}
}
