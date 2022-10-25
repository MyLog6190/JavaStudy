package _02_.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExmple {
	public static void main(String[] args) {
		/*
		 	Stream
		 	- 컬렉션 및 배열의 요소를 반복 처리하기 위한 스트림 사용
		 	- 컬렉션을 표준화된 방법으로 처리
		 	  - List, Set, Map, 배열 -> Stream으로 변환하여 처리할 수 있다.
		 	- 중간연산은 여러번 최종 연산을 1번만 할 수 있다.
		 	  - 중간연산 -> list.stream().distinct().filter().sorted();
		 	  - 최종연산 -> list.stream.forEach() -> 소멸
		 	- 스트림은 데이터를 읽기만할 뿐 변경하지 않는다.
		 	- Iterator처럼 일회용이다.
		 	
		 */
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,1,2);
		List<String> strList = Arrays.asList("홍길동", "신용권", "남궁성");
		// list를 Steam으로 변환
		Stream<Integer> intStream = list.stream();
		
		// 최종연산을 수행하면 stream이 닫힌다.
		intStream.forEach(l -> System.out.print(l));
		System.out.println();
		try {
			// Stream은 1회용이기 때문에 다시 생성하여 사용해야한다.
			intStream.forEach(l -> System.out.println(l));
		} catch(IllegalStateException e) {
			System.out.println(e);
		}
		
		// .distinct() 중복제거
		System.out.print("중복 제거 : ");
		list.stream().distinct().forEach(l -> System.out.print(l));
		System.out.println();
		
		// filter() ()안에 조건식이 true인 값을 필터링한다.
		System.out.print("필터링 : ");
		list.stream().filter(l -> l != 1 ).forEach(l -> System.out.print(l));
		
		System.out.print("\n필터링 : ");
			// startWith는 ()안에 문자열로 시작하는 요소만 필터링
		strList.stream().filter(sl -> sl.startsWith("신")).forEach(sl -> System.out.print(sl));;
		System.out.println();
		
		// sorted() 정렬
		System.out.print("정렬 : ");
		list.stream().sorted().forEach(l -> System.out.print(l));
		System.out.print("\n정렬 : ");
		strList.stream().sorted().forEach(l -> System.out.print(l+ " "));
		
		// 역순 정렬
		System.out.print("\n정렬 : ");
		list.stream().sorted(Comparator.reverseOrder()).forEach(l -> System.out.print(l));
		System.out.print("\n정렬 : ");
		strList.stream().sorted(Comparator.reverseOrder()).forEach(l -> System.out.print(l+ " "));
	}
	
}
