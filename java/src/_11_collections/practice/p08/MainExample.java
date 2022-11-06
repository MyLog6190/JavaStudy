package _11_collections.practice.p08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainExample {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // 먼저 list 를 총점기준 내림차순으로정렬한다 .
		int prevRank = -1;
		// 이전 전교등수
		int prevTotal = -1;
		// 이전 총점
		int length = list.size();
		
		int rank = 1;
		for(Object o : list) {
			Student s = (Student)o;
			
			if(s.total == prevTotal) {
				s.schoolRank = prevRank;
			}else {
				s.schoolRank = rank;
			}
			
			prevTotal = s.total;
			prevRank = s.schoolRank;
			rank++;
		}
		
		
	}
		/*
		(2) 아래의 로직에 맞게 코드를 작성하시오 .
		1. 반복문을 이용해서 list 에 저장된 Student 객체를 하나씩 읽는다 .
		1.1 총점 (total) 이 이전총점 (prevTotal) 과 같으면
		이전 등수 (prevRank) 를 등수 (schoolRank) 로 한다 .
		1.2 총점이 서로 다르면 ,
		등수 (schoolRank) 의 값을 알맞게 계산해서 저장한다 .
		이전에 동점자 였다면 , 그 다음 등수는 동점자의 수를 고려해야 한다 .
		( 실행결과 참고 )
		1.3 현재 총점과 등수를 이전총점 (prevTotal) 과 이전등수 (prevRank) 에
		저장한다 .
		*/
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student(" 이자바 ",2,1,70,90,70));
		list.add(new Student(" 안자바 ",2,2,60,100,80));
		list.add(new Student(" 홍길동 ",1,3,100,100,100));
		list.add(new Student(" 남궁성 ",1,1,90,70,80));
		list.add(new Student(" 김자바 ",1,2,80,80,90));
		calculateSchoolRank(list);
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
